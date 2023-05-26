package fsm.miaad.java.io;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThreadBlockingChatServer extends Thread
{

    private List<Conversation> conversations=new ArrayList();

    int clientsCount=0;

    public static void main(String[] args) {

        new MultiThreadBlockingChatServer().start();
    // Suite
    }
    
    @Override
    public void run() {
        try
        {
            ServerSocket serverSocket=new ServerSocket (1234);

            while(true){
                Socket socket = serverSocket.accept();
                ++clientsCount;

                Conversation conversation = new Conversation(socket, clientsCount);
                conversations.add(conversation);

                conversation.start();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    class Conversation extends Thread{
        private int clientId; 
        private Socket socket;
        public Conversation(Socket socket, int clientId){
            this.socket=socket; 
            this.clientId=clientId;
        }

        @Override
        public void run() {
            try {
                InputStream is=socket.getInputStream(); 
                InputStreamReader isr=new InputStreamReader(is); 
                BufferedReader br=new BufferedReader(isr);
                OutputStream os=socket.getOutputStream(); 
                PrintWriter pw=new PrintWriter(os,true);

                System.out.println("New connection from Number"+clientId+" IP= " +socket.getRemoteSocketAddress());
                pw.println("Welcome you are the client number :"+clientId);

                String request; String message="";
                 List<Integer> ids=new ArrayList<>();

                while ((request=br.readLine())!=null){
                    if(request.contains("=>")){
                        ids=new ArrayList<>(); String[] items = request.split("=>"); String clients=items[0]; message= items[1];
                        if(clients.contains(",")){
                            String[] idsListStr = clients.split(",");
                            for(String id : idsListStr){ 
                                ids.add(Integer.parseInt(id));
                            }
                        } 
                        else { ids.add(Integer.parseInt(clients)); }
                    } else{ 
                        message=request; 
                        ids=conversations.stream().map(c->c.clientId).collect(Collectors.toList()); 
                    }
                    System.out.println("New Request => "+request+" from "+socket.getRemoteSocketAddress());
                    broadcastMessage(message,socket,ids);
                }
            } 
            catch (IOException e) { 
                throw new RuntimeException(e);
            }
        }
        }

        public void broadcastMessage(String message, Socket from, List<Integer> clientIds){
            try {
                for (Conversation conversation:conversations){
                    Socket socket = conversation.socket;
                    if((socket!=from) && clientIds.contains(conversation.clientId)){
                        OutputStream os=socket.getOutputStream();
                        PrintWriter printWriter = new PrintWriter(os,true);
                        printWriter.println(message);
                    }
                }
            } 
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}