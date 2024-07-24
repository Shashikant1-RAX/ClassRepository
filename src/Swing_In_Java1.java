//import javax.swing.*;
//import javax.swing.ImageIcon;
//import javax.swing.border.Border;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.util.concurrent.TimeoutException;
//
//public class Swing_In_Java1 {
//    public static void main(String[] args) {
//
//        //Frame...
//        JFrame frame = new JFrame(); //creating a frame.
//        //frame.getContentPane().setBackground(Color.red);// to set the background of frame.
//        frame.getContentPane().setBackground(new Color(178,223,90));// to set the background of frame in rgb.
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate program after clicking close button.
//        //frame.setSize(700, 500);// to set the size of frame
//        frame.setLayout(null);
//        //frame.setVisible(true);// to set the visibiltiy of frame, by default is false.
//        frame.setTitle("Shashi Frame"); // to set the title of frame.
////        frame.setLocation(100,50);// it will set the location of frame from all sides on display.
//        frame.setBounds(100,100,700,500); // to set the bounds within x-axis,y-axis,width,and height.
//        //frame.setResizable(false); //you cannot resize the frame.
//        //frame.pack();
//
////        ImageIcon image = new ImageIcon("file.png");
////        frame.setIconImage(image.getImage());
//
//        //Border border = BorderFactory.createLineBorder(Color.red,15);  //used to create a border.
//
//        //Label...
////        JLabel label = new JLabel(); //create a label.
////        label.setText("Bro, do you even  code?");//set text of label
////        frame.add(label);
////        ImageIcon image1 = new ImageIcon("file1.png");//set icon to text label
////        label.setIcon(image1);
////        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, RIGHT, CENTER of imageicon.
////        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, BOTTOM, CENTER of imageicon
////        label.setForeground(new Color(123,45,61)); //set colour of text.
////        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font of text.
////        label.setIconTextGap(-25); // set text gap to image.
////        //label.setBackground(Color.black); //set the background colour.
////        //label.setOpaque(true);//show the background colour.
////        label.setBorder(border); //set the border.
////        label.setVerticalAlignment(JLabel.CENTER);// set the vertical position of icon+text within label.
////        label.setHorizontalAlignment(JLabel.CENTER);// set the Horizontal position of icon+text within label.
////        //label.setBounds(100,100,300,400); //set x,y position within frame as well as dimensions.
//
//        //Button...
////        JButton button = new JButton("Click Here"); //creating the button.
////        button.setSize(100,30);//set the size of button.
////        button.setLocation(100,100); //set the location of button.
////        frame.getContentPane().add(button); //add button within frame.
////        button.setFont(new Font("MV Boli",Font.PLAIN,12)); //set the font colour of button.
////        button.setBackground(Color.YELLOW); //set the background oof colour.
////        button.setText("Click Me"); //this will set or change the button text.
////        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); //set the cursor type. int value of Hand cursor is 12, 1 for CrossHair cursor, 3 for Wait cursor.
//
//        //JTextField...
////        JTextField t1 = new JTextField(); //creating a JTextField. it is used for single line input.
////        t1.setBounds(100,50,120,30);
////        frame.getContentPane().add(t1); // to set the bounds within x-axis,y-axis,width,and height.
//        //t1.setText(" ");
//
//        //JTextArea...
////        JTextArea textArea = new JTextArea(); //creating a JTextArea. it is used for multiple line input.
////        textArea.setBounds(100,100,400,200);//set x,y position within frame as well as dimensions.
////        frame.getContentPane().add(textArea); //adding colour to the frame
////        textArea.setText("This is a TextArea");
////        textArea.setFont(new Font("Arial", Font.BOLD,15)); //setting font to the text of textarea.
////        //textArea.setEditable(false); //use to not change the setText if it is false.
////        textArea.setLineWrap(true); // if one line is complete it will go to second line.
//
//        //JPanel...
////        JPanel panel = new JPanel();
////        panel.setBounds(0,0,340,300);
//////        panel.setLayout(new FlowLayout());
////        panel.setLayout(null);
////        panel.setBackground(Color.YELLOW);
////        frame.getContentPane().add(panel);
////
////        JPanel panel2 = new JPanel();
////        panel2.setBounds(300,0,200,200);
////        frame.getContentPane().add(panel2);
////        panel2.setBackground(Color.red);
////        panel.add(panel2);
////
////        JButton button1 = new JButton("Click Here"); //creating the button.
////        button1.setSize(100,30);//set the size of button.
////        panel2.add(button1);
//
//            //JTable...
//        Object [][] data = {
//                {"Ram", 56, "A"},
//                {"Shyam", 57, "O"},
//                {"Jaggannath", 58, "A+"}
//        };
//        String [] columnName = {"Name", "Age", "Grade"};
//        DefaultTableModel model = new DefaultTableModel(data,columnName);
//        JTable jTable = new JTable(model);
//        frame.getContentPane().add(jTable);
//        //JScrollPane jsp = new JScrollPane( );
//        //frame.getContentPane().add(jsp);
//
//
//        frame.setVisible(true);
//    }
//}


//import java.sql.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//class MyF extends JFrame implements ActionListener
//{
//    JButton b1,b2,b3;
//    JTextField t1,t2,t3;
//    JLabel l1,l2,l3;
//    JTextArea textArea;
//    JTable jtb1,jtb2;
//
//    Connection conn;
//    Statement stmt;
//    PreparedStatement pstmt1;
//    ResultSet rs;
//
//    Container con;
//    int row=0,col=0;
//    Object data2[][]=new Object[30][5];
//    Object data3[][]=new Object[1][1];//empty
//    JScrollPane jsp2;
//    String head2[]={"Sr-No.","Name","Sur-Name","PayId"};
//    int index=0;
//    String last;
//    MyF(String title)
//    {
//        super(title);
//        b1=new JButton("Submit");
//        b2=new JButton("Fetch");
//        b3=new JButton("Last entry");
//        t1=new JTextField(10);
//        t2=new JTextField(10);
//        t3=new JTextField(10);
//        l1=new JLabel("First Name");
//        l2=new JLabel("Last Name");
//        l3=new JLabel("PayID");
//        textArea = new JTextArea(6,40);
//
//
//        con=getContentPane();
//        con.setLayout(new FlowLayout());
//        con.add(l1);
//        con.add(t1);
//        con.add(l2);
//        con.add(t2);
//
//        con.add(l3);
//        con.add(t3);
//        con.add(b1);
//        con.add(b2);
//        con.add(textArea);
//        con.add(b3);
//
////JScrollPane scrollPane = new JScrollPane(textArea);
//        textArea.setEditable(false);
//        textArea.setFont(new Font("arial", Font.ITALIC, 16));
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        b3.addActionListener(this);
//    }
//
//    public void actionPerformed(ActionEvent ae)
//    {
//        if(ae.getSource()==b2)
//        {
//            Connection conn = null;
//            String url = "jdbc:mysql://localhost:3306/";
//            String dbName = "db";
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String userName = "root";
//            String password = "1@Shashikant";
//            try
//            {
//                Class.forName(driver).newInstance();
//                conn = DriverManager.getConnection(url+dbName,userName,password);
//                System.out.println("Connected to the database");
//                stmt=conn.createStatement();
//
//                stmt.execute("select * from student");
//                rs = stmt.getResultSet();
////System.out.println(rs);
//                while(rs.next()==true)
//                {
//                    jtb2=new JTable(data3,head2);
//                    String entry1=rs.getString(1);// representing the first column
//                    String entry2=rs.getString(2);// representing the second column
//                    String entry3=rs.getString(3);// representing the third column
//                    String entry4=rs.getString(4);// representing the fourth column
//// System.out.println("The fetched value is:"+entry);
//
//                    textArea.append("sr :"+entry1+" "+"Name :"+entry2+"Surname :"+entry3+ "Payid :"+entry4+"\n");
//
//                    data2[row][col]=rs.getString(1); // data2[1][0]
//                    data2[row][col+1]=rs.getString(2);// data2[1][1]
//                    data2[row][col+2]=rs.getString(3);// data2[1][2]
//                    data2[row][col+3]=rs.getString(4);// data2[1][3]
//                    row++;
//
//                }
//// for obtaing last serial number
//                last=String.valueOf(data2[row-1][0]);// data2[4][0]
//                index=Integer.parseInt(last);
//                index=index+1;
//                last=Integer.toString(index);
//                System.out.println("The Last serial is:"+index);
//
////System.out.println("The Last serial is:"+data2[row-1][0]);
//                jtb2=new JTable(data2,head2);
//                jsp2=new JScrollPane(jtb2);
//                jsp2.setBounds(300,200,200,200);
//                con.add(jsp2);
//                jsp2.setVisible(true);
//            }
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//
//            finally
//            {
//                try {
//
//                    conn.close();
//                } catch (SQLException ex) {}
//                System.out.println("Disconnected from database");
//            }
//
//        }//ifb2
//
//        if(ae.getSource()==b1)
//        {
//            Connection conn = null;
//            String url = "jdbc:mysql://localhost:3306";
//            String dbName = "db";
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String userName = "root";
//            String password = "1@Shashikant";
//            try
//            {
//                Class.forName(driver).newInstance();
//                conn = DriverManager.getConnection(url+dbName,userName,password);
//                System.out.println("Connected to the database");
//                String in1,in2,in3;
//                in1=t1.getText();
//                in2=t2.getText();
//                in3=t3.getText();
//                System.out.println("data input:"+in1+" "+in2+" "+in3);
////stmt=conn.createStatement();
//                pstmt1=conn.prepareStatement("insert into student values(?,?,?,?)");
//
//                pstmt1.setString(1,last);
//                pstmt1.setString(2,in1);
//                pstmt1.setString(3,in2);
//                pstmt1.setString(4,in3);
//
//                int k=pstmt1.executeUpdate();
//                if(k==1)
//                    JOptionPane.showMessageDialog(null,"Data Entered");
//                else
//                    JOptionPane.showMessageDialog(null,"Data Not Entered");
//            }catch(Exception e){System.out.println(e);}
//        }//ifb1
//
//    }// acp
//    public static void main(String args[])
//    {
//        MyF f=new MyF("Data Entry System");
//        f.setVisible(true);
//        f.setSize(400,400);
//    }
//
//}//class