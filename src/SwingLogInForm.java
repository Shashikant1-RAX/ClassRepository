import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


//class LogInForm extends JFrame implements ActionListener {
//    Container c;
//    JLabel l1, l2;
//    JTextField t1;
//    JPasswordField pass;
//    JButton b1, b2;
//
//    LogInForm() {
//        c = getContentPane();
//        c.setLayout(null);
//
//        l1 = new JLabel("UserName");
//        l1.setBounds(10, 50, 100, 20);
//        c.add(l1);
//        l2 = new JLabel("Password");
//        l2.setBounds(10, 100, 100, 20);
//        c.add(l2);
//
//        t1 = new JTextField();
//        t1.setBounds(120, 50, 120, 20);
//        c.add(t1);
//
//        pass = new JPasswordField();
//        pass.setBounds(120, 100, 120, 20);
//        c.add(pass);
//
//        b1 = new JButton("LogIn");
//        b1.setBounds(80, 150, 80, 20);
//        b1.setCursor(new Cursor(12));
//        c.add(b1);
//        b2 = new JButton("Cancel");
//        b2.setBounds(180, 150, 80, 20);
//        b2.setCursor(new Cursor(12));
//        c.add(b2);
//
//        b1.addActionListener(this);
//        b2.addActionListener( this);
//    }
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) {
//            System.out.println("Username is: " + t1.getText());
//            System.out.println("Password is: " + pass.getText());
//        }
//        if (e.getSource() == b2) {
//            dispose();
//        }
//    }

//Lambda Expression...
//    b1.addActionListener(e -> {
//        if(e.getSource() == b1){
//            System.out.println("Username is: "+ t1.getText());
//            System.out.println("Password is: "+ pass.getText());
//            b1.setText("Hii");
//        }
//    });
//
//    b2.addActionListener(e ->{
//        if (e.getSource() == b2) {
//            b1.setText("Hello");
//            dispose();
//        }
//    });

//        ActionListener al = (e -> {
//            if(e.getSource() == b1){
//            System.out.println("Username is: "+ t1.getText());
//            System.out.println("Password is: "+ pass.getText());
//            b1.setText("Hii");
//        }
//        if (e.getSource() == b2) {
//            dispose();
//        }
//
//        });
//        b1.addActionListener(al);
//        b2.addActionListener(al);
//    }
//}
//public class SwingLogInForm {
//    public static void main(String[] args) {
//        LogInForm frame = new LogInForm();
//        frame.setTitle("LogIn Form");
//        frame.setVisible(true);
//        frame.setSize(400,300);
//        frame.setLocation(100,100);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}

//Calculator...
//class Calculator3 extends JFrame implements ActionListener{
//    Container c;
//    JLabel label1,label2,label3;
//    JTextField text1,text2,text3;
//    JButton btn1,btn2,btn3,btn4,btn5,btn6;
//    String s1;
//    int a,b,d;
//    Calculator3(){
//        c = this.getContentPane();
//        c.setLayout(null);
//
//        label1 = new JLabel("Enter first input");
//        label1.setBounds(10,50,100,20);
//        c.add(label1);
//
//        label2 = new JLabel("Enter second input");
//        label2.setBounds(10, 80, 150,20);
//        c.add(label2);
//
//        label3 = new JLabel("Output");
//        label3.setBounds(10,120,100,20);
//        c.add(label3);
//
//        text1 = new JTextField();
//        text1.setBounds(150, 50, 100,20);
//        c.add(text1);
//        text2 = new JTextField();
//        text2.setBounds(150, 80, 100,20);
//        c.add(text2);
//        text3 = new JTextField();
//        text3.setBounds(150,110,100,20);
//        c.add(text3);
//
//        btn1 = new JButton("add");
//        btn1.setBounds(10,160,100,20);
//        btn1.setCursor(new Cursor(12));
//        c.add(btn1);
//        btn2 = new JButton("subtract");
//        btn2.setBounds(120,160,100,20);
//        btn2.setCursor(new Cursor(12));
//        c.add(btn2);
//        btn3 = new JButton("Multiply");
//        btn3.setBounds(230,160,100,20);
//        btn3.setCursor(new Cursor(12));
//        c.add(btn3);
//        btn4 = new JButton("Division");
//        btn4.setBounds(340,160,100,20);
//        btn4.setCursor(new Cursor(12));
//        c.add(btn4);
//        btn5 = new JButton("Modulus");
//        btn5.setBounds(10,190,100,20);
//        btn5.setCursor(new Cursor(12));
//        c.add(btn5);
//        btn6 = new JButton("Exit");
//        btn6.setBounds(340,190,100,20);
//        btn6.setCursor(new Cursor(12));
//        c.add(btn6);
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn3.addActionListener(this);
//        btn4.addActionListener(this);
//        btn5.addActionListener(this);
//        btn6.addActionListener(this);
//    }
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==btn1){
//            c.setBackground(new Color(123,156,32));
//            a=Integer.parseInt(text1.getText());
//            b=Integer.parseInt(text2.getText());
//            s1=String.valueOf(a+b);
//            text3.setText(s1);
//        }
//        if(e.getSource()==btn2){
//            c.setBackground(new Color(123,56,31));
//            a=Integer.parseInt(text1.getText());
//            b=Integer.parseInt(text2.getText());
//            s1=String.valueOf(a-b);
//            text3.setText(s1);
//        }
//        if(e.getSource()==btn3){
//            c.setBackground(new Color(255,156,32));
//            a=Integer.parseInt(text1.getText());
//            b=Integer.parseInt(text2.getText());
//            s1=String.valueOf(a*b);
//            text3.setText(s1);
//        }
//        if(e.getSource()==btn4){
//            c.setBackground(new Color(145,194,255));
//            a=Integer.parseInt(text1.getText());
//            b=Integer.parseInt(text2.getText());
//            s1=String.valueOf(a/b);
//            text3.setText(s1);
//        }
//        if(e.getSource()==btn5){
//            c.setBackground(new Color(223,27,151));
//            a=Integer.parseInt(text1.getText());
//            b=Integer.parseInt(text2.getText());
//            s1=String.valueOf(a%b);
//            text3.setText(s1);
//        }
//        if(e.getSource()==btn6){
//            dispose();
//        }
//    }
//}
//class TestCalculator{
//    public static void main(String[] args) {
//        Calculator3 calc = new Calculator3();
//        calc.setTitle("Calculator");
//        calc.setSize(700,500);
//        calc.setVisible(true);
//        calc.setLocation(100,100);
//        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;

//class Stopwatch implements Runnable,ActionListener
//{
//    JFrame f;
//    JPanel p;
//    JLabel jh,jm,js,jms;
//    JTextField h,m,s,ms;
//    JButton hm;
//    Button st,rst;
//    int i=0,fl=0,flag=0;
//    Thread t;
//    public Stopwatch()// constructor???
//    {
//        t=new Thread(this);
//        f=new JFrame("Stop Watch");
//        p=new JPanel();
//        jh=new JLabel("Hours");
//        jm=new JLabel("Minutes");
//        js=new JLabel("Seconds");
//        jms=new JLabel("MilliSeconds");
//        h=new JTextField(3);
//        m=new JTextField(2);
//        s=new JTextField(2);
//        ms=new JTextField(4);
//        st=new Button("Start");
//        rst=new Button("Reset");
//        st.addActionListener(this);// registry step
//        rst.addActionListener(this);
//        hm=new JButton("Home");
//        hm.addActionListener(this);
//        p.add(jh);
//        p.add(h);
//        p.add(jm);
//        p.add(m);
//        p.add(js);
//        p.add(s);
//        p.add(jms);
//        p.add(ms);
//        p.add(hm);
//        p.add(st);
//        p.add(rst);
//        f.add(p);
//        f.setVisible(true);
//        f.setSize(900,300);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        Object o=e.getSource();
//        if(o==rst)
//        {
//
//            h.setText("0");
//            m.setText("0");
//            s.setText("0");
//            ms.setText("0");
//
//            flag=1;
//            i=0;
//            fl=0;
//            System.out.println(" Reset Working");
//            t.stop();
//
////}catch(Exception e1){e1.printStackTrace();}
//        }
//        else if(o==st)// i=fl=flag=0
//        {
//            if(i==0)//i=1
//            { System.out.println(" start Working");
//                st.setLabel("Stop");
//                if(fl==0 && flag==0)
//                {
//                    System.out.println(" flag=0 Working");
//                    t.start();// it will invoke public void run()
//                    i=1;
//                }
//                else if(fl==0 && flag==1)
//                {
//
//                    System.out.println(" flag=1 Working");
//                    t=new Thread(this);
//                    t.start();
//                    i=1;
//                }
//                else
//                {
//
//                    t.resume();
//                    i=1;
//                }
//            }
//            else
//            {
//                System.out.println("stopped");
//                st.setLabel("Start");
//                i=0;
////t.stop();
//                t.suspend();
//                fl=1;
//            }
//        }
//    }// acp
//    public void run()
//    {
//        try
//        {
//            for(int x=0;x<=999;x++)// hours
//            {
//                for(int j=0;j<=59;j++)// minutes j=1
//                {
//                    for(int k=0;k<=59;k++)// seconds k=0
//                    {
//                        for(int l=0;l<=999;l++)// mili-seconds
//                        {
//                            h.setText(Integer.toString(x));
//                            m.setText(Integer.toString(j));
//                            s.setText(Integer.toString(k));
//                            ms.setText(Integer.toString(l));
//                            t.sleep(1);
//                        }
//                    }
//                }
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Error : "+e);
//        }
//    }
//    public static void main(String ar[])
//    {
//        Stopwatch ss=new Stopwatch();
//    }
//}

//import java.awt.*;
//        import java.awt.event.*;
//
//class FrameExp1 extends Frame {
//    TextField t1,t2,t3;// reference
//    Button b1,b2,b3,b4;
//    Label l1,l2,l3;
//    int a,b,c;
//    String s1,s2,s3;
//    FrameExp1()//parameterized constructor
//    {
//        t1=new TextField(25);// initialization
//        t2=new TextField(25);
//        t3=new TextField(30);
//
//        b1=new Button("Add");
//        b2=new Button("Clear");
//        b3=new Button("Hi");
//        b4=new Button("Bye");
//        l1=new Label("Enter first number");
//        l2=new Label("Enter Second number");
//        l3=new Label("Output");
//        add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);
//
//        b1.addActionListener(e->{
//            if(e.getSource()==b1){
//                l1.setText("Addition performed");
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a+b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//        });
//
//        b2.addActionListener(e->{
//            if(e.getSource()==b2){
//                l2.setText("B2 is clicked");
//                t1.setText(null);
//                t2.setText(null);
//                t3.setText(null);
//            }
//        });
//
//        b3.addActionListener(e->{
//            if(e.getSource()==b3){
//                l3.setText("Hello,How are you??");
//            }
//        });
//        b4.addActionListener(e-> dispose());
//    }
//}
//class FrameYogi2{
//    public static void main(String args[]){
//        FrameExp1 obj = new FrameExp1();
//        obj.setSize(300,400);
//        obj.setTitle("Hello");
//        obj.setVisible(true);
//
//        obj.setLayout(new FlowLayout());
//
//    }
//}

//Extended Version of Login Form...
//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.*;
//class LogInForm2 extends JFrame {
//    Container c;
//    JLabel l1, l2, bg, write;
//    JTextField t1;
//    JPasswordField pass;
//    JButton b1, b2;
//    JPanel heading, content;
//
//    LogInForm2() {
//        c = getContentPane();
//        c.setLayout(null);
//
//        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("design1.png"));
//        Image image5 = image4.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
//        ImageIcon image6 = new ImageIcon(image5);
//        bg = new JLabel(image6);
//        bg.setBounds(0,0,800,500);
//        c.add(bg);
//
//        content = new JPanel();
//        content.setBounds(250,220,300,180);
//        content.setBackground(new Color(0,0,0,120));
//        content.setLayout(null);
//        bg.add(content);
//        heading = new JPanel();
//        heading.setBounds(0,0,800,80);
//        heading.setBackground(new Color(0,0,0,100));
//        heading.setLayout(null);
//        bg.add(heading);
//        write = new JLabel("LogIn Page");
//        write.setBounds(320,10,200,50);
//        write.setForeground(Color.WHITE);
//        write.setFont(new Font("Serif",Font.BOLD,30));
//        heading.add(write);
//
//        l1 = new JLabel("UserName");
//        l1.setBounds(20, 10, 120, 35);
//        l1.setForeground(Color.WHITE);
//        content.add(l1);
//        l2 = new JLabel("Password");
//        l2.setBounds(20, 60, 120, 35);
//        l2.setForeground(Color.WHITE);
//        content.add(l2);
//
//        t1 = new JTextField();
//        t1.setBounds(20, 40, 120, 20);
//        t1.setFont(new Font("serif",Font.BOLD,13));
//        content.add(t1);
//
//        pass = new JPasswordField();
//        pass.setBounds(20, 90, 120, 20);
//        pass.setFont(new Font("serif",Font.BOLD,13));
//        content.add(pass);
//
//
//        b1 = new JButton("LogIn");
//        b1.setBounds(40, 127, 80, 20);
//        b1.setCursor(new Cursor(12));
//        content.add(b1);
//        b2 = new JButton("Cancel");
//        b2.setBounds(150, 127, 80, 20);
//        b2.setCursor(new Cursor(12));
//        content.add(b2);
//
//        ActionListener al = (e -> {
//            if(e.getSource() == b1){
//                System.out.println("Username is: "+ t1.getText());
//                System.out.println("Password is: "+ pass.getText());
//            }
//            if (e.getSource() == b2) {
//                dispose();
//            }
//
//        });
//        b1.addActionListener(al);
//        b2.addActionListener(al);
//    }
//}
//class SwingLogInForm3 {
//    public static void main(String[] args) {
//        LogInForm2 frame = new LogInForm2();
//        frame.setTitle("LogIn Form");
//        frame.setVisible(true);
//        frame.setSize(800,500);
//        frame.setLocation(100,100);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}


class LogInForm1 extends JFrame implements ActionListener {
    Container c;
    JLabel l1, l2, bg, write;
    JTextField t1;
    JPasswordField pass;
    JButton b1, b2;
    JPanel heading, content;
    String password1, userName1, password, url, userName, s1, s2;

    LogInForm1() {
        c = getContentPane();
        c.setLayout(null);

        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("design1.png"));
        Image image5 = image4.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon image6 = new ImageIcon(image5);
        bg = new JLabel(image6);
        bg.setBounds(0, 0, 800, 500);
        c.add(bg);

        content = new JPanel();
        content.setBounds(250, 220, 300, 180);
        content.setBackground(new Color(0, 0, 0, 120));
        content.setLayout(null);
        bg.add(content);
        heading = new JPanel();
        heading.setBounds(0, 0, 800, 80);
        heading.setBackground(new Color(0, 0, 0, 100));
        heading.setLayout(null);
        bg.add(heading);
        write = new JLabel("LogIn Page");
        write.setBounds(320, 10, 200, 50);
        write.setForeground(Color.WHITE);
        write.setFont(new Font("Serif", Font.BOLD, 30));
        heading.add(write);

        l1 = new JLabel("UserName");
        l1.setBounds(20, 10, 120, 35);
        l1.setForeground(Color.WHITE);
        content.add(l1);
        l2 = new JLabel("Password");
        l2.setBounds(20, 60, 120, 35);
        l2.setForeground(Color.WHITE);
        content.add(l2);

        t1 = new JTextField();
        t1.setBounds(20, 40, 120, 20);
        t1.setFont(new Font("serif", Font.BOLD, 13));
        content.add(t1);

        pass = new JPasswordField();
        pass.setBounds(20, 90, 120, 20);
        pass.setFont(new Font("serif", Font.BOLD, 13));
        content.add(pass);


        b1 = new JButton("LogIn");
        b1.setBounds(40, 127, 80, 20);
        b1.setCursor(new Cursor(12));
        content.add(b1);
        b2 = new JButton("Cancel");
        b2.setBounds(150, 127, 80, 20);
        b2.setCursor(new Cursor(12));
        content.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            userName1 = t1.getText();
            password1 = pass.getText();
            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement preparedStatement = connection.prepareStatement("select * from login where userName = ? and password = ?");
                preparedStatement.setString(1,userName1);
                preparedStatement.setString(2,password1);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    s1 = rs.getString(1);
                    s2 = rs.getString(2);
                }
                if(userName1.equals(s1) && password1.equals(s2)){
                    CRUDOperations1 frame = new CRUDOperations1();
                    frame.setTitle("CRUD Application");
                    frame.setVisible(true);
                    frame.setSize(1020, 500);
                    frame.setLocation(100, 100);
                    frame.getContentPane().setBackground(new Color(178, 223, 90));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    JOptionPane.showMessageDialog(null,"Data Matched","Message",JOptionPane.INFORMATION_MESSAGE);

                }
                else
                    JOptionPane.showMessageDialog(null,"Data Not Matched","Message",JOptionPane.INFORMATION_MESSAGE);

            }
            catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
        if (e.getSource() == b2) {
            dispose();
        }
    }
}
class SwingLogInForm1{
    public static void main(String[] args) {
        LogInForm1 frame = new LogInForm1();
        frame.setTitle("LogIn Form");
        frame.setVisible(true);
        frame.setSize(800,500);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}