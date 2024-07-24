import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//
//class CRUDOperations extends JFrame implements ActionListener {
//    Container c;
//    JLabel lb1, lb2, lb3, lb4, lb5, lb6;
//    JTextField textField1, textField2, textField3, textField4, textField5, textField6;
//    JButton btn1, btn2, btn3, btn4;
//    JTextArea textArea;
//    int st_Id, age;
//    String firstName, lastName, grade, url, userName, password;
//
//    CRUDOperations() {
//        c = getContentPane();
//        c.setLayout(null);
//
//        lb1 = new JLabel("Enter student_id");
//        lb1.setBounds(10, 10, 100, 120);
//        c.add(lb1);
//        lb2 = new JLabel("Enter First Name");
//        lb2.setBounds(10, 40, 100, 120);
//        c.add(lb2);
//        lb3 = new JLabel("Enter Last Name");
//        lb3.setBounds(10, 70, 100, 120);
//        c.add(lb3);
//        lb4 = new JLabel("Enter the age");
//        lb4.setBounds(10, 100, 100, 120);
//        c.add(lb4);
//        lb5 = new JLabel("Enter the grade");
//        lb5.setBounds(10, 130, 100, 120);
//        c.add(lb5);
//        lb6 = new JLabel("Enter column name to update");
//        lb6.setBounds(10, 250, 180, 20);
//        c.add(lb6);
//
//        textField1 = new JTextField();
//        textField1.setBounds(150, 60, 100, 20);
//        c.add(textField1);
//        textField2 = new JTextField();
//        textField2.setBounds(150, 90, 100, 20);
//        c.add(textField2);
//        textField3 = new JTextField();
//        textField3.setBounds(150, 120, 100, 20);
//        c.add(textField3);
//        textField4 = new JTextField();
//        textField4.setBounds(150, 150, 100, 20);
//        c.add(textField4);
//        textField5 = new JTextField();
//        textField5.setBounds(150, 180, 100, 20);
//        c.add(textField5);
//        textField6 = new JTextField();
//        textField6.setBounds(190, 250, 100, 20);
//        c.add(textField6);
//
//        btn1 = new JButton("Insert");
//        btn1.setBounds(10, 220, 100, 20);
//        btn1.setCursor(new Cursor(12));
//        c.add(btn1);
//        btn2 = new JButton("Retrieve");
//        btn2.setBounds(120, 220, 100, 20);
//        btn2.setCursor(new Cursor(12));
//        c.add(btn2);
//        btn3 = new JButton("Update");
//        btn3.setBounds(230, 220, 100, 20);
//        btn3.setCursor(new Cursor(12));
//        c.add(btn3);
//        btn4 = new JButton("Delete");
//        btn4.setBounds(340, 220, 100, 20);
//        btn4.setCursor(new Cursor(12));
//        c.add(btn4);
//
//        textArea = new JTextArea(10,15);
//        textArea.setBounds(500, 40, 500, 400);
//        textArea.setFont(new Font("Arial", Font.BOLD, 15));
//        textArea.setEditable(false);
//        textArea.setLineWrap(true);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        scrollPane.setBounds(500, 40, 500, 400);
//        c.add(scrollPane);
////        c.add(textArea);
////        textArea.append("Student_Id   " + "FirstName   " + "LastName   " + "Age   " + "Grade   \n");
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn3.addActionListener(this);
//        btn4.addActionListener(this);
//
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btn1) {
//            textField6.setEnabled(false);
//            st_Id = Integer.parseInt(textField1.getText());
//            firstName = textField2.getText();
//            lastName = textField3.getText();
//            age = Integer.parseInt(textField4.getText());
//            grade = textField5.getText();
//
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//
//                String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setInt(1, st_Id);
//                preparedStatement.setString(2, firstName);
//                preparedStatement.setString(3, lastName);
//                preparedStatement.setInt(4, age);
//                preparedStatement.setString(5, grade);
//                int rowsAffected = preparedStatement.executeUpdate();
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if (e.getSource() == btn2) {
//            textField6.setEnabled(false);
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//                Statement statement = connection.createStatement();
//                ResultSet rs = statement.executeQuery("select * from student");
//
//                textArea.setText(""); //// Clear the text area before appending new data
//
//                while(rs.next()){
//                    String s4 = rs.getString(1);
//                    String s5 = rs.getString(2);
//                    String s6 = rs.getString(3);
//                    String s7 = rs.getString(4);
//                    String s8 = rs.getString(5);
//
//                    textArea.append(s4 + "   " + s5 + "   " + s6 + "   " + s7 + "   " + s8 + "\n");
//
//                }
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if(e.getSource() == btn3){
//            textField6.setEnabled(true);
//            String columnName = textField6.getText();
//
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//
//                int rowsAffected = 0;
//                if(columnName.equals("fist_name")) {
//                    int st_Id1 = Integer.parseInt(textField1.getText());
//                    String fist_name = textField2.getText();
//                    String query = "UPDATE student SET fist_name = ? WHERE student_id = ?";
//                    PreparedStatement preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setString(1,fist_name);
//                    preparedStatement.setInt(2,st_Id1);
//                    rowsAffected = preparedStatement.executeUpdate();
//                }
//                if(columnName.equals("last_name")) {
//                    int st_Id1 = Integer.parseInt(textField1.getText());
//                    String last_name = textField3.getText();
//                    String query = "UPDATE student SET last_name = ? WHERE student_id = ?";
//                    PreparedStatement preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setString(1,last_name);
//                    preparedStatement.setInt(2,st_Id1);
//                    rowsAffected = preparedStatement.executeUpdate();;
//                }
//                if(columnName.equals("age")) {
//                    int st_Id1 = Integer.parseInt(textField1.getText());
//                    int age1 = Integer.parseInt(textField4.getText());
//                    String query = "UPDATE student SET age = ? WHERE student_id = ?";
//                    PreparedStatement preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setInt(1,age1);
//                    preparedStatement.setInt(2,st_Id1);
//                    rowsAffected = preparedStatement.executeUpdate();
//                }
//                if(columnName.equals("grade")) {
//                    int st_Id1 = Integer.parseInt(textField1.getText());
//                    String grade1 = textField5.getText();
//                    String query = "UPDATE student SET grade = ? WHERE student_id = ?";
//                    PreparedStatement preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setString(1,grade1);
//                    preparedStatement.setInt(2,st_Id1);
//                    rowsAffected = preparedStatement.executeUpdate();
//                }
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if(e.getSource() == btn4){
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            int delData = Integer.parseInt(textField1.getText());
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//                String query = "DELETE FROM student WHERE student_id = ?";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setInt(1,delData);
//                int rowsAffected = preparedStatement.executeUpdate();
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//                connection.close();
//            }
//            catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//    }
//}
//public class CRUDApplication {
//    public static void main(String[] args) {
//        CRUDOperations frame = new CRUDOperations();
//        frame.setTitle("CRUD Application");
//        frame.setVisible(true);
//        frame.setSize(1020, 500);
//        frame.setLocation(100, 100);
//        frame.getContentPane().setBackground(new Color(178, 223, 90));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}

//Extended Version...

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.*;
//
//class CRUDOperations1 extends JFrame implements ActionListener {
//    Container c;
//    JLabel lb1, lb2, lb3, lb4, lb5, lb6, background;
//    JTextField textField1, textField2, textField3, textField4, textField5, textField6;
//    JButton btn1, btn2, btn3, btn4, btn5;
//    JTextArea textArea;
//    int st_Id, age;
//    String firstName, lastName, grade, url, userName, password;
//
//    CRUDOperations1() {
//        c = getContentPane();
//        c.setLayout(null);
//
////        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("design2.png"));
////        Image image2 = image1.getImage().getScaledInstance(1020,500, Image.SCALE_DEFAULT);
////        ImageIcon image3 = new ImageIcon(image2);
////        background = new JLabel(image3);
////        background.setBounds(0,0,1020,500);
////        c.add(background);
//        lb1 = new JLabel("Enter student_id");
//        lb1.setBounds(10, 10, 100, 120);
//        c.add(lb1);
//        lb2 = new JLabel("Enter First Name");
//        lb2.setBounds(10, 40, 100, 120);
//        c.add(lb2);
//        lb3 = new JLabel("Enter Last Name");
//        lb3.setBounds(10, 70, 100, 120);
//        c.add(lb3);
//        lb4 = new JLabel("Enter the age");
//        lb4.setBounds(10, 100, 100, 120);
//        c.add(lb4);
//        lb5 = new JLabel("Enter the grade");
//        lb5.setBounds(10, 130, 100, 120);
//        c.add(lb5);
//        lb6 = new JLabel("Enter student id to search");
//        lb6.setBounds(10, 250, 180, 20);
//        c.add(lb6);
//
//        textField1 = new JTextField();
//        textField1.setBounds(150, 60, 100, 20);
//        c.add(textField1);
//        textField2 = new JTextField();
//        textField2.setBounds(150, 90, 100, 20);
//        c.add(textField2);
//        textField3 = new JTextField();
//        textField3.setBounds(150, 120, 100, 20);
//        c.add(textField3);
//        textField4 = new JTextField();
//        textField4.setBounds(150, 150, 100, 20);
//        c.add(textField4);
//        textField5 = new JTextField();
//        textField5.setBounds(150, 180, 100, 20);
//        c.add(textField5);
//        textField6 = new JTextField();
//        textField6.setBounds(190, 250, 100, 20);
//        c.add(textField6);
//
//        btn1 = new JButton("Insert");
//        btn1.setBounds(10, 220, 100, 20);
//        btn1.setCursor(new Cursor(12));
//        c.add(btn1);
//        btn2 = new JButton("Retrieve");
//        btn2.setBounds(120, 220, 100, 20);
//        btn2.setCursor(new Cursor(12));
//        c.add(btn2);
//        btn3 = new JButton("Update");
//        btn3.setBounds(230, 220, 100, 20);
//        btn3.setCursor(new Cursor(12));
//        c.add(btn3);
//        btn4 = new JButton("Delete");
//        btn4.setBounds(340, 220, 100, 20);
//        btn4.setCursor(new Cursor(12));
//        c.add(btn4);
//        btn5 = new JButton("Search");
//        btn5.setBounds(340, 250, 100, 20);
//        btn5.setCursor(new Cursor(12));
//        c.add(btn5);
//
//
//        textArea = new JTextArea(10,15);
//        textArea.setBounds(500, 40, 500, 400);
//        textArea.setFont(new Font("Arial", Font.BOLD, 15));
//        textArea.setEditable(false);
//        textArea.setLineWrap(true);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        scrollPane.setBounds(500, 40, 500, 400);
//        c.add(scrollPane);
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn3.addActionListener(this);
//        btn4.addActionListener(this);
//        btn5.addActionListener(this);
//
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btn1) {
//            st_Id = Integer.parseInt(textField1.getText());
//            firstName = textField2.getText();
//            lastName = textField3.getText();
//            age = Integer.parseInt(textField4.getText());
//            grade = textField5.getText();
//
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//
//                String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setInt(1, st_Id);
//                preparedStatement.setString(2, firstName);
//                preparedStatement.setString(3, lastName);
//                preparedStatement.setInt(4, age);
//                preparedStatement.setString(5, grade);
//                int rowsAffected = preparedStatement.executeUpdate();
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//                textField1.setText("");
//                textField2.setText("");
//                textField3.setText("");
//                textField4.setText("");
//                textField5.setText("");
//                connection.close();
//
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if (e.getSource() == btn2) {
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//                Statement statement = connection.createStatement();
//                ResultSet rs = statement.executeQuery("select * from student");
//
//                textArea.setText(""); //// Clear the text area before appending new data
//
//                while(rs.next()){
//                    String s4 = rs.getString(1);
//                    String s5 = rs.getString(2);
//                    String s6 = rs.getString(3);
//                    String s7 = rs.getString(4);
//                    String s8 = rs.getString(5);
//
//                    textArea.append(s4 + "   " + s5 + "   " + s6 + "   " + s7 + "   " + s8 + "\n");
//
//                }
//                textField1.setText("");
//                textField2.setText("");
//                textField3.setText("");
//                textField4.setText("");
//                textField5.setText("");
//                connection.close();
//
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if(e.getSource() == btn3){
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//
//                int st_Id1 = Integer.parseInt(textField1.getText());
//                String fist_name = textField2.getText();
//                String last_name = textField3.getText();
//                int age1 = Integer.parseInt(textField4.getText());
//                String grade1 = textField5.getText();
//                String query = "UPDATE student SET fist_name = ?,last_name = ? ,age = ?, grade  = ? WHERE student_id = ?";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setString(1,fist_name);
//                preparedStatement.setString(2,last_name);
//                preparedStatement.setInt(3,age1);
//                preparedStatement.setString(4,grade1);
//                preparedStatement.setInt(5,st_Id1);
//                int rowsAffected = preparedStatement.executeUpdate();
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//                textField1.setText("");
//                textField2.setText("");
//                textField3.setText("");
//                textField4.setText("");
//                textField5.setText("");
//                connection.close();
//
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if(e.getSource() == btn4){
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            int delData = Integer.parseInt(textField1.getText());
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//                String query = "DELETE FROM student WHERE student_id = ?";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setInt(1,delData);
//                int rowsAffected = preparedStatement.executeUpdate();
//                if (rowsAffected > 0) {
//                    JOptionPane.showMessageDialog(null, "Data Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data Not Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
//                }
//                textField1.setText("");
//                textField2.setText("");
//                textField3.setText("");
//                textField4.setText("");
//                textField5.setText("");
//                connection.close();
//
//            }
//            catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//        if(e.getSource() == btn5){
//            url = "jdbc:mysql://localhost:3306/db";
//            userName = "root";
//            password = "1@Shashikant";
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                Connection connection = DriverManager.getConnection(url, userName, password);
//                int newSt_id = Integer.parseInt(textField6.getText());
//
//                String query = "SELECT * FROM student WHERE student_id = ?";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//                preparedStatement.setInt(1, newSt_id);
//                ResultSet rs = preparedStatement.executeQuery();
//
//                textArea.setText(""); //// Clear the text area before appending new data
//
//                while(rs.next()){
//                    String s41 = rs.getString(1);
//                    String s51 = rs.getString(2);
//                    String s61 = rs.getString(3);
//                    String s71 = rs.getString(4);
//                    String s81 = rs.getString(5);
//
//                    textField1.setText(s41);
//                    textField2.setText(s51);
//                    textField3.setText(s61);
//                    textField4.setText(s71);
//                    textField5.setText(s81);
//
//                }
//            } catch (ClassNotFoundException | SQLException a) {
//                a.printStackTrace();
//            }
//        }
//    }
//}
//class CRUDApplication1 {
//    public static void main(String[] args) {
//        CRUDOperations1 frame = new CRUDOperations1();
//        frame.setTitle("CRUD Application");
//        frame.setVisible(true);
//        frame.setSize(1020, 500);
//        frame.setLocation(100, 100);
//        frame.getContentPane().setBackground(new Color(178, 223, 90));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}

//Newly Extended Version...

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class CRUDOperations1 extends JFrame implements ActionListener {
    Container c;
    //JPanel background;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6,background;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6;
    JButton btn1, btn2, btn3, btn4, btn5;
    JTextArea textArea;
    int st_Id, age;
    String firstName, lastName, grade, url, userName, password;

    CRUDOperations1() {
        c = getContentPane();
        c.setLayout(null);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("design3.jpg"));
        Image image2 = image1.getImage().getScaledInstance(1020,500, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        background = new JLabel(image3);
        background.setBounds(0,0,1020,500);
        c.add(background);
        lb1 = new JLabel("Enter student_id");
        lb1.setBounds(10, 10, 100, 120);
        lb1.setForeground(Color.WHITE);
        background.add(lb1);
        lb2 = new JLabel("Enter First Name");
        lb2.setBounds(10, 40, 100, 120);
        lb2.setForeground(Color.WHITE);
        background.add(lb2);
        lb3 = new JLabel("Enter Last Name");
        lb3.setBounds(10, 70, 100, 120);
        lb3.setForeground(Color.WHITE);
        background.add(lb3);
        lb4 = new JLabel("Enter the age");
        lb4.setBounds(10, 100, 100, 120);
        lb4.setForeground(Color.WHITE);
        background.add(lb4);
        lb5 = new JLabel("Enter the grade");
        lb5.setBounds(10, 130, 100, 120);
        lb5.setForeground(Color.WHITE);
        background.add(lb5);
        lb6 = new JLabel("Enter student id to search");
        lb6.setBounds(10, 250, 180, 20);
        lb6.setForeground(Color.WHITE);
        background.add(lb6);

        textField1 = new JTextField();
        textField1.setBounds(150, 60, 100, 20);
        background.add(textField1);
        textField2 = new JTextField();
        textField2.setBounds(150, 90, 100, 20);
        background.add(textField2);
        textField3 = new JTextField();
        textField3.setBounds(150, 120, 100, 20);
        background.add(textField3);
        textField4 = new JTextField();
        textField4.setBounds(150, 150, 100, 20);
        background.add(textField4);
        textField5 = new JTextField();
        textField5.setBounds(150, 180, 100, 20);
        background.add(textField5);
        textField6 = new JTextField();
        textField6.setBounds(190, 250, 100, 20);
        background.add(textField6);

        btn1 = new JButton("Insert");
        btn1.setBounds(10, 220, 100, 20);
        btn1.setCursor(new Cursor(12));
        background.add(btn1);
        btn2 = new JButton("Retrieve");
        btn2.setBounds(120, 220, 100, 20);
        btn2.setCursor(new Cursor(12));
        background.add(btn2);
        btn3 = new JButton("Update");
        btn3.setBounds(230, 220, 100, 20);
        btn3.setCursor(new Cursor(12));
        background.add(btn3);
        btn4 = new JButton("Delete");
        btn4.setBounds(340, 220, 100, 20);
        btn4.setCursor(new Cursor(12));
        background.add(btn4);
        btn5 = new JButton("Search");
        btn5.setBounds(340, 250, 100, 20);
        btn5.setCursor(new Cursor(12));
        background.add(btn5);


        textArea = new JTextArea();
//        textArea.setBounds(500, 40, 500, 400);
        textArea.setFont(new Font("Arial", Font.BOLD, 15));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setOpaque(false); // Make the text area non-opaque
        textArea.setForeground(Color.white);
        textArea.setBackground(new Color(0, 0, 0, 0));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(500, 40, 500, 400);
        scrollPane.setOpaque(false); // Make the scroll pane non-opaque
        scrollPane.getViewport().setOpaque(false); // Make the viewport of the scroll pane non-opaque. This method retrieves the viewport object of the JScrollPane. The viewport is the component that displays the visible part of the content.
        background.add(scrollPane);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            st_Id = Integer.parseInt(textField1.getText());
            firstName = textField2.getText();
            lastName = textField3.getText();
            age = Integer.parseInt(textField4.getText());
            grade = textField5.getText();

            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, userName, password);

                String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, st_Id);
                preparedStatement.setString(2, firstName);
                preparedStatement.setString(3, lastName);
                preparedStatement.setInt(4, age);
                preparedStatement.setString(5, grade);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Not Entered", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                connection.close();

            } catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
        if (e.getSource() == btn2) {
            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, userName, password);
//                Statement statement = connection.createStatement();
//                ResultSet rs = statement.executeQuery("select * from student");
                PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
                ResultSet rs = preparedStatement.executeQuery();

                textArea.setText(""); //// Clear the text area before appending new data

                while(rs.next()){
                    String s4 = rs.getString(1);
                    String s5 = rs.getString(2);
                    String s6 = rs.getString(3);
                    String s7 = rs.getString(4);
                    String s8 = rs.getString(5);

                    textArea.append(s4 + "   " + s5 + "   " + s6 + "   " + s7 + "   " + s8 + "\n");

                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                connection.close();

            } catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
        if(e.getSource() == btn3){
            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, userName, password);

                int st_Id1 = Integer.parseInt(textField1.getText());
                String fist_name = textField2.getText();
                String last_name = textField3.getText();
                int age1 = Integer.parseInt(textField4.getText());
                String grade1 = textField5.getText();
                String query = "UPDATE student SET fist_name = ?,last_name = ? ,age = ?, grade  = ? WHERE student_id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1,fist_name);
                preparedStatement.setString(2,last_name);
                preparedStatement.setInt(3,age1);
                preparedStatement.setString(4,grade1);
                preparedStatement.setInt(5,st_Id1);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Not Updated", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                connection.close();

            } catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
        if(e.getSource() == btn4){
            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            int delData = Integer.parseInt(textField1.getText());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, userName, password);
                String query = "DELETE FROM student WHERE student_id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,delData);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Not Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                connection.close();

            }
            catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
        if(e.getSource() == btn5){
            url = "jdbc:mysql://localhost:3306/db";
            userName = "root";
            password = "1@Shashikant";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, userName, password);
                int newSt_id = Integer.parseInt(textField6.getText());

                String query = "SELECT * FROM student WHERE student_id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, newSt_id);
                ResultSet rs = preparedStatement.executeQuery();

                textArea.setText(""); //// Clear the text area before appending new data

                while(rs.next()){
                    String s41 = rs.getString(1);
                    String s51 = rs.getString(2);
                    String s61 = rs.getString(3);
                    String s71 = rs.getString(4);
                    String s81 = rs.getString(5);

                    textField1.setText(s41);
                    textField2.setText(s51);
                    textField3.setText(s61);
                    textField4.setText(s71);
                    textField5.setText(s81);

                }
            } catch (ClassNotFoundException | SQLException a) {
                a.printStackTrace();
            }
        }
    }
}
//class CRUDApplication1 {
//    public static void main(String[] args) {
//        CRUDOperations1 frame = new CRUDOperations1();
//        frame.setTitle("CRUD Application");
//        frame.setVisible(true);
//        frame.setSize(1020, 500);
//        frame.setLocation(100, 100);
//        frame.getContentPane().setBackground(new Color(178, 223, 90));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//    }
//}


