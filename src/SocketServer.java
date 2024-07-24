import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server is started.");
            ServerSocket serverSocket = new ServerSocket(9806);

            System.out.println("Server is waiting for client request.");
            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            //BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = br.readLine();
            System.out.println("Client Data: " + str);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
