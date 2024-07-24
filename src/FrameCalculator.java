import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static sun.tools.jconsole.inspector.XDataViewer.dispose;


class MyFrame extends Frame {

    TextField t1,t2,t3;// reference
    Button b1,b2,b3,b4,b5,b6;
    Label l1,l2,l3;
    int a,b,c;
    String s1,s2,s3;

        MyFrame(String str)
        {
            super(str);
            t1=new TextField(20);// initialization
            t2=new TextField(20);
            t3=new TextField(20);

            b1=new Button("Add");
            b2=new Button("Subtract");
            b3=new Button("Multiply");
            b4=new Button("Division");
            b5=new Button("Modulus");
            b6=new Button("Exit");

            l1=new Label("Enter first number");
            l2=new Label("Enter second number");
            l3=new Label("Output");

            add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);

            b1.addActionListener((ActionListener) this);
            b2.addActionListener((ActionListener) this);
            b3.addActionListener((ActionListener) this);
            b4.addActionListener((ActionListener) this);
            b5.addActionListener((ActionListener) this);
            b6.addActionListener((ActionListener) this);
        }
//        public void actionPerformed(ActionEvent ae){
//            if(ae.getSource()==b1){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a+b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b2){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a-b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b3){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a+b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b3){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a*b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b4){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a/b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b5){
//                s1=t1.getText();
//                s2=t2.getText();
//                a=Integer.parseInt(s1);
//                b=Integer.parseInt(s2);
//                c=a%b;
//                s3=""+c;
//                t3.setText(s3);
//            }
//            if(ae.getSource()==b6){
//                dispose();
//            }
//        }

    }
    class FrameCalculator{

        public static void main(String ar[]){
            ActionListener ac = new ActionListener() {
                TextField t1,t2,t3;// reference
                Button b1,b2,b3,b4,b5,b6;
                Label l1,l2,l3;
                int a,b,c;
                String s1,s2,s3;
                @Override
                public void actionPerformed(ActionEvent ae){
                    if(ae.getSource()==b1){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a+b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b2){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a-b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b3){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a+b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b3){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a*b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b4){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a/b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b5){
                        s1=t1.getText();
                        s2=t2.getText();
                        a=Integer.parseInt(s1);
                        b=Integer.parseInt(s2);
                        c=a%b;
                        s3=""+c;
                        t3.setText(s3);
                    }
                    if(ae.getSource()==b6){
                        dispose();
                    }
                }
                private void dispose() {
                }

            };
            MyFrame obj=new MyFrame("Calculator");
            obj.setSize(500,500);
            obj.setVisible(true);
            obj.setLayout(new FlowLayout());
        }
    }

