import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ClientChatApplication extends JFrame implements ActionListener {
    Container c;
    static JPanel panel2;
    JPanel panel1, panel3, right;
    JLabel back, profile, video, phone, dotIcon, name, status, label;
    JTextField text;
    JButton btn1;
    JScrollPane scrollPane;
    static Box vertical = Box.createVerticalBox(); //it is use to set the message in vertical line means one by one in downside.
    static PrintWriter pw;
    ClientChatApplication(){
        c = getContentPane();
        c.setLayout(null);

        panel1 = new JPanel();
        panel1.setBackground(new Color(7,94,84));
        panel1.setBounds(0,0,450,70);
        panel1.setLayout(null);
        c.add(panel1);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("iconArrow.png"));
        Image image2 = image1.getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        back = new JLabel(image3);
        back.setBounds(5,20,25,25);
        panel1.add(back);

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        //ClassLoader is an abstract class.
        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("Krishna2.png"));  //Find a resource of the specified name from the search path used to load classes. This method locates the resource through the system class loader (see getSystemClassLoader()).
        Image image5 = image4.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT); //A new Image object is returned which will render the image at the specified width and height by default.
        ImageIcon image6 = new ImageIcon(image5);
        profile = new JLabel(image6);
        profile.setBounds(40,10,50,50);
        panel1.add(profile);

        ImageIcon image7 = new ImageIcon(ClassLoader.getSystemResource("video.png"));
        Image image8 = image7.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT); //A new Image object is returned which will render the image at the specified width and height by default.
        ImageIcon image9 = new ImageIcon(image8);
        video = new JLabel(image9);
        video.setBounds(250,20,30,30);
        panel1.add(video);

        ImageIcon image10 = new ImageIcon(ClassLoader.getSystemResource("phone.png"));
        Image image11 = image10.getImage().getScaledInstance(35,30, Image.SCALE_DEFAULT); //A new Image object is returned which will render the image at the specified width and height by default.
        ImageIcon image12 = new ImageIcon(image11);
        phone = new JLabel(image12);
        phone.setBounds(300,20,35,30);
        panel1.add(phone);

        ImageIcon image13 = new ImageIcon(ClassLoader.getSystemResource("3Doticon.png"));
        Image image14 = image13.getImage().getScaledInstance(10,25, Image.SCALE_DEFAULT); //A new Image object is returned which will render the image at the specified width and height by default.
        ImageIcon image15 = new ImageIcon(image14);
        dotIcon = new JLabel(image15);
        dotIcon.setBounds(350,20,10,25);
        panel1.add(dotIcon);

        name = new JLabel("Raadhe");
        name.setBounds(100,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        panel1.add(name);

        status = new JLabel("Active Now");
        status.setBounds(100,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF",Font.BOLD,12));
        panel1.add(status);

        panel2 = new JPanel();
        panel2.setBounds(5,75,370,380);
        scrollPane = new JScrollPane(panel2);
        scrollPane.setBounds(5, 75, 370, 380);
        c.add(scrollPane);

        text = new JTextField();
        text.setBounds(5,460,260,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        c.add(text);

        btn1 = new JButton("Send");
        btn1.setBounds(275,460,100,40);
        btn1.setBackground(new Color(7,94,84));
        btn1.setForeground(Color.WHITE);
        btn1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        c.add(btn1);

        btn1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String out = text.getText();
            panel3 = formatLabel(out);

            panel2.setLayout(new BorderLayout()); //BorderLayout set the object top down left right center.
            right = new JPanel(new BorderLayout()); //this is to show the message right side.
            right.add(panel3, BorderLayout.LINE_END); // this shows the message end of the right side.
            vertical.add(right);  // this will set the message in vertical row if message is vertical.
            vertical.add(Box.createVerticalStrut(15)); //you typically use this method to force a certain amount of space between two components.
            panel2.add(vertical, BorderLayout.PAGE_START); //adding the content to start of page in panel2.

            //dout.writeUTF(out);
            pw.println(out);
            pw.flush();
            text.setText("");

            repaint();
            invalidate();
            validate();
        }
        catch(Exception a){
            a.printStackTrace();
        }

    }
    public static JPanel formatLabel(String out){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //creating box for message which will write the message in y axis. it takes two parameters where we need to hold and in which direction.

        JLabel label = new JLabel("<html><p style = \"width : 150px \">"  + out + "</p> </html>"); //this will provide some fixed width for message.
        label.setFont(new Font("Tahoma", Font.PLAIN,16));// it'll set Font
        label.setBackground(new Color(37,211,102));
        label.setOpaque(true); // it will set the opacity to content.
        label.setBorder(new EmptyBorder(15,15,15,15)); //this will create an emptyBorder of 15 length from all sides.

        panel.add(label);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime())); // adding time to every message.
        panel.add(time); //adding time on panel


        return panel;
    }
}
public class ClientChat {
    public static void main(String[] args) {
        ClientChatApplication frame = new ClientChatApplication();
        frame.setSize(380,500);
        frame.setLocation(800,100);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try{
            Socket socket = new Socket("Localhost",9999);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            ClientChatApplication.pw = new PrintWriter(socket.getOutputStream());
            while (true){
                ClientChatApplication.panel2.setLayout(new BorderLayout());
                String msg = br.readLine();
                JPanel panel = ClientChatApplication.formatLabel(msg);

                JPanel left = new JPanel(new BorderLayout());
                left.add(panel, BorderLayout.LINE_START);
                ClientChatApplication.vertical.add(left);

                ClientChatApplication.vertical.add(Box.createVerticalStrut(15));
                ClientChatApplication.panel2.add(ClientChatApplication.vertical,BorderLayout.PAGE_START);
                frame.validate();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
