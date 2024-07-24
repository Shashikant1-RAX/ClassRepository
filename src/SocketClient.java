import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        String ip = "localhost";
        int port = 9806;
        try {
            Socket socket = new Socket(ip, port);
            InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader br1 = new BufferedReader(isr1);
            System.out.print("Enter the message to send the server: ");
            String str = br1.readLine();

            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());  //Here getOutputStream describes the port number from where you want to send the message.
            PrintWriter pw = new PrintWriter(osw); //It is used to print the formatted representation of objects to the text-output stream.
            pw.println(str);
            pw.flush();// it will read all the bytes of string.
//            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//            pw.println(str);
//            pw.flush();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
