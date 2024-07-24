import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class ChatClient extends Frame implements ActionListener, Runnable {
  TextArea ta;
  TextField tf;
  BufferedReader br;
  PrintWriter pw;
  List l1;
  String name;

  ChatClient(String title, String address, int port) {

    // Invoke the superclass constructor
    super(title);
    l1=new List(8);

    // Handle window closing event
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });   

    // Create a text area and add it to the frame
    ta = new TextArea(10, 20);
    ta.setEditable(false);
    setLayout(new BorderLayout());
    add(ta, "Center");
    add(l1,"East");
    // Create a text field and add it to the frame
    tf = new TextField("", 25);
    tf.addActionListener(this);
    add(tf, "South");

    try {  

      // Create socket
      Socket s = new Socket(address, port);

      // Create buffered reader and writer for that socket
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      br = new BufferedReader(isr);
      OutputStream os = s.getOutputStream();
      pw = new PrintWriter(os, true);
      pw.println("~"+title);// ~Sarv
      name="~"+title;// ~Sarv
    }   
    catch(Exception e) {
    }
    
    // Create a thread to listen for messages from server
    Thread thread = new Thread(this);
    thread.start();
  }

  public void actionPerformed(ActionEvent ae) {
    String rec;
    try {
      rec=l1.getSelectedItem();//   <>Sarv : Hello Shashi
      // Write contents of text field to server
      String str = "<"+rec+">"+name.substring(1)+" : "+tf.getText();
      pw.println(str);
      // Clear text field
      tf.setText("");
    }
    catch(Exception e) {
    }
  }

  public void run() {
//   String rec;
    try {

      while(true) {

        // Read a string from the server
        String str = br.readLine();
////////////////////////////////////
        if(str.charAt(0)=='~')
        {
          // if(!str.equals(name))
                l1.add(str.substring(1));
          }
        else
        {	
////////////////////////////////////
        // Append that string to the text area
                ta.append(str + "\n");
          }
      }
    }
    catch(Exception e) {
    }
  }
}
