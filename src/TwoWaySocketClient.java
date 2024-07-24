//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TwoWaySocketClient{
//    private JLabel heading;
//    private JTextArea messageDisplay;
//    private JTextField messageIn;
//    PrintWriter pw;
//
//    TwoWaySocketClient(){
//
//        heading = new JLabel("Client Area ");
//        messageDisplay = new JTextArea();
//        messageIn = new JTextField();
//        Font font = new Font("Roboto",Font.PLAIN,15);
//
//        heading.setFont(font);
//        messageDisplay.setFont(font);
//        messageIn.setFont(font);
//
//        heading.setHorizontalAlignment(JLabel.CENTER);
//        heading.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
//
//        this.setLayout(new BorderLayout());
//        this.add(heading,BorderLayout.NORTH);
//        this.add(messageDisplay,BorderLayout.CENTER);
//        this.add(messageIn,BorderLayout.SOUTH);
//
//        this.setVisible(true);
//
//        messageIn.addKeyListener(this);
//
//
//
//    }
//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        if(e.getKeyCode() == 10){
//            String str = messageIn.getText();
//            pw.println(str);
//            pw.flush();
//            messageIn.setText("");
//        }
//    }

    public static void main(String[] args) {
//        TwoWaySocketClient frame = new TwoWaySocketClient();
//        frame.setTitle("Client Chat");
//        frame.setSize(500,500);
//        frame.setLocation(100,100);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String ip = "localhost";
        int port = 9806;
        String str1;
        try {
            Socket socket = new Socket(ip, port);
            do {
                InputStreamReader isr1 = new InputStreamReader(System.in);
                BufferedReader br1 = new BufferedReader(isr1);
                System.out.print("Enter the message to send the server: ");
                String str = br1.readLine();

                OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());  //Here getOutputStream describes the port number from where you want to send the message.
                PrintWriter pw = new PrintWriter(osw); //PrintWriter is a class used to write any form of data e.g. int, float, double, String or Object in the form of text either on the console or in a file in Java.
                pw.println(str); //this println() method is use to send the message to connected network server or client.
                pw.flush();// it will read all the bytes of string and send forcefully all the text to connected server or client.
//            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//            pw.println(str);
//            pw.flush();

                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                //BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                str1 = br.readLine();
                System.out.println("Server Data: " + str1);
            } while (!str1.equals("bye"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
