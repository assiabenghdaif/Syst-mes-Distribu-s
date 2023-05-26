import socket
import selectors

# set up selector object for handling I/O
selector = selectors.DefaultSelector()

# function to handle incoming data from server
def read(conn):
    data = conn.recv(1024)
    if data:
        print(f"Response => {data.decode().strip()}")

# set up TCP socket
HOST = 'localhost'
PORT = 2001
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
sock.connect((HOST, PORT))
sock.setblocking(False)

# register the socket for read events with the selector
selector.register(sock, selectors.EVENT_READ, read)

# event loop for I/O
while True:
    # read input from user
    request = input()
    
    # send request to server
    if request:
        sock.sendall(request.encode())

    # wait for events and handle them
    events = selector.select()
    for key, mask in events:
        callback = key.data
        callback(key.fileobj)
