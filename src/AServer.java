//import java.io.*;
//import java.net.*;
//import java.util.*;
//
//class AServer {
//  static Vector serverThreads;
//  static String names[]=new String[20];
//  static int i=0;
//  public static void main(String args[]) {
//    try {
//      // Create vector to hold server threads
//      serverThreads = new Vector();
//      // Create server socket
//      ServerSocket ss = new ServerSocket(2000);// client socket:  ip + port, Socket
//      // Create infinite loop   server socket:  Port number , ServerSocket
//      while(true) {
//        // Accept incoming requests
//        Socket s = ss.accept();
//        System.out.println(s);
//        ServerThread st = new ServerThread(s);
//        st.start();
//        // Add thread to vector
//        serverThreads.addElement(st);
//      }
//    }
//    catch(Exception e) {
//      System.out.println("Exception: " + e);
//    }
//  }
//  public synchronized static void recieve(String str) // ~Sarv
//  {
//	names[i]=str.substring(1);// names[0]=Sarv
//	i++;
//    Enumeration e = serverThreads.elements();
//    try {
//    while(true)
//    {
//       ServerThread st = (ServerThread)e.nextElement();
//       st.echo(str);
//       if(!e.hasMoreElements())
//       {
//          for(int j=0;j<i-1;j++)
//            st.echo("~"+names[j]);
//          break;
//       }
//     }
//      }catch(Exception ex) { }
//  }
//
//
//  public synchronized static void echoAll(String str)
//  {
//    int a=str.indexOf('>');   //<>Sarv : Hello Shashi  a=1
//    int k=0;
//    String rec=str.substring(1,a);// rec= shashi  null
//    String str1=str.substring(a+1);// str1=  Sarv : Hello Shashi
//    Enumeration e = serverThreads.elements();
//    while(e.hasMoreElements()) {
//      try {
//        ServerThread st = (ServerThread)e.nextElement(); // 3 users are there
//       if(rec.equals(names[k++]) || rec.equals("null"))
//        st.echo(str1);
//      }
//      catch(Exception ex) {
//        // Ignore any problems communicating with a client
//      }
//    }
//  }
//}

    
