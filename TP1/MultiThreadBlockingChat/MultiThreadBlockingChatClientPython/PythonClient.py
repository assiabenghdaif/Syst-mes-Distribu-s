import socket


def client_program():
    host = "localhost" # Host name
    port = 1234 # socket server port number
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM) # instantiate
    client_socket.connect((host, port)) # connect to the server
    data = client_socket.recv(1024).decode() # receive response
    print('Received from server: ' + data)# show in terminal

    request = input(" -> ")
    client_socket.sendall(request.encode()) # send message
    
    client_socket.close() # close the connection
if __name__ == '__main__':
    client_program()