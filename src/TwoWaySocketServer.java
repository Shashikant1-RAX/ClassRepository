import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TwoWaySocketServer {
    public static void main(String[] args) {
        String message;
        try {
            System.out.println("Server is started.");
            ServerSocket serverSocket = new ServerSocket(9806);

            System.out.println("Server is waiting for client request.");
            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");
            do {
                InputStreamReader isr = new InputStreamReader(socket.getInputStream());//getInputStream() returns message in byte and InputStreamReader will convert into character.
                BufferedReader br = new BufferedReader(isr); // it will handle by creating buffer stored in br.
                String str = br.readLine();
                System.out.println("Client Data: " + str);

                InputStreamReader isr2 = new InputStreamReader(System.in);
                BufferedReader br2 = new BufferedReader(isr2);

                System.out.print("Enter the message to reply to client: ");
                message = br2.readLine();

                OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());  //Here getOutputStream describes the port number from where you want to send the message.
                PrintWriter pw = new PrintWriter(osw); //It is used to print the formatted representation of objects to the text-output stream.
                pw.println(message);
                pw.flush();
            } while (!message.equals("bye"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

