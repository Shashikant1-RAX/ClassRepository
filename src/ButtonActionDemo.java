import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends JFrame {
    Container c;
    JButton btn1,btn2,btn3;
//    JButton btn1 = new JButton("red");
//    JButton btn2 = new JButton("yellow");
//    JButton btn3 = new JButton("black");
    MyFrame1() {
        c = this.getContentPane();
        c.setLayout(null);

        btn1 = new JButton("Click Me");
        btn2 = new JButton("Click Me");
        btn3 = new JButton("Click Me");
        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(250, 100, 100, 50);
        btn3.setBounds(400, 100, 100, 50);
        btn1.setCursor(new Cursor(12));
        btn2.setCursor(new Cursor(12));
        btn3.setCursor(new Cursor(12));
        add(btn1);
        add(btn2);
        add(btn3);
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn3.addActionListener(this);
        // }
        //@Override
//    public void actionPerformed(ActionEvent e) { // for 1 action
//        c.setBackground(Color.RED);
//    }
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==btn1){
//            c.setBackground(new Color(123,156,32));
//        }
//        if(e.getSource()==btn2){
//            c.setBackground( new Color(123,56,31));
//        }
//        if(e.getSource()==btn3){
//            c.setBackground(Color.black);
//        }
//    }

        ActionListener alr = (e -> {
            if(e.getSource() == btn1){
                c.setBackground(new Color(123,156,32));
            }
            if(e.getSource() == btn2){
                c.setBackground( new Color(123,56,31));
            }
            if(e.getSource() == btn3){
                c.setBackground(Color.black);
            }
        });
        btn1.addActionListener(alr);
        btn2.addActionListener(alr);
        btn3.addActionListener(alr);
    }
}
public class ButtonActionDemo {
    public static void main(String[] args) {
        MyFrame1 frm = new MyFrame1();
        frm.setTitle("My LogIn");
        frm.setSize(700,500);
        frm.setLocation(100,100);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
