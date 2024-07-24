import java.sql.*;
import java.util.Scanner;


public class JDBC_In_Java {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db";
        String userName = "root";
        String password = "1@Shashikant";
        int rowsAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =  DriverManager.getConnection(url,userName,password);

            Statement statement = connection.createStatement(); // we use this for one by one.
            Scanner sc = new Scanner(System.in);
//            String query = "INSERT INTO student(student_id, fist_name, last_name, age, grade) VALUES(?, ?, ?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query); // we use this for large insertion, updation, traversal, retrieving, deletion and so on.

//Insertion data into table in database using Batch Processing PreparedStatement...
            //Batch Processing...
//            while(true) {
//                System.out.print("Enter the Student_Id: ");
//                int student_id = sc.nextInt();
//                System.out.print("Enter the FirstName: ");
//                String firstName = sc.next();
//                System.out.print("Enter the LastName: ");
//                String lastName = sc.next();
//                System.out.print("Enter the Age: ");
//                int age = sc.nextInt();
//                System.out.print("Enter the Grade: ");
//                String grade = sc.next();
//                System.out.println("Enter choice: [Y/N]");
//                String choice = sc.next();
//
//                preparedStatement.setInt(1, student_id);
//                preparedStatement.setString(2, firstName);
//                preparedStatement.setString(3, lastName);
//                preparedStatement.setInt(4, age);
//                preparedStatement.setString(5, grade);
//                preparedStatement.addBatch();
//
//                if(choice.toUpperCase().equals("N")){
//                    break;
//                }
//            }
//            int [] rowsAffected = preparedStatement.executeBatch();
//            for(int i=0; i<rowsAffected.length; i++){
//                if(rowsAffected[i] == 0){
//                    System.out.println("Data has not been inserted");
//                }
//                else {
//                    System.out.println("Data has been inserted successfully");
//                }
//            }

////            Insertion data into table in database using PreparedStatement...
//            String query = "INSERT INTO student(student_id, fist_name, last_name, age, grade) VALUES(?, ?, ?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query); // we use this for large insertion, updation, traversal, retrieving, deletion and so on.
//            preparedStatement.setInt(1, 233);
//            preparedStatement.setString(2, "Mansi");
//            preparedStatement.setString(3, "Chaudhuri");
//            preparedStatement.setInt(4, 19);
//            preparedStatement.setString(5, "O");
//            int rowsAffected = preparedStatement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data has been inserted successfully");
//            } else {
//                System.out.println("Data has not been inserted");
//            }

            //Retriving data using PreparedStatement...
//            ResultSet rs = preparedStatement.executeQuery("select * from student");
//
//            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "studentId", "FirstName", "LastName", "Age", "Grade");
//            while(rs.next()){
//                System.out.printf("%-10d %-10s %-10s %-10d %-10s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
//                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5));
//
//            }

           //Updating data using PreparedStatement...
            System.out.println("Enter firstName to update: ");
            String first_name = sc.next();
//            System.out.println("Enter lastName to update: ");
//            String last_name = sc.next();
            String last_name = null;
//            System.out.println("Enter age to update: ");
            //String age = sc.next();
            int age = 0;
//            System.out.println("Enter Name to update: ");
//            String grade = sc.next();
            String grade = null;
            System.out.println("Enter id for update: ");
            int id = sc.nextInt();
//            if(columnName.equals("last_name")){
            String query = "UPDATE student SET fist_name = ?,last_name = ? ,age = ?, grade  = ? WHERE student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query); // we use this for large insertion, updation, traversal, retrieving, deletion and so on.
            preparedStatement.setString(1,first_name);
            preparedStatement.setString(2,last_name);
            preparedStatement.setInt(3,age);
            preparedStatement.setString(4,grade);
            preparedStatement.setInt(5,id);
            rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
                System.out.println("Data has been Updated successfully");
            } else {
                System.out.println("Data has not been Updated");
            }
//

/*           // Deleting data using PreparedStatement...
//            String query = "DELETE FROM student WHERE student_id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query); // we use this for large insertion, updation, traversal, retrieving, deletion and so on.
//            //preparedStatement.setString(1,"B+");
//            preparedStatement.setInt(1,1103);
//            int rowsAffected = preparedStatement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data has been Deleted successfully");
//            } else {
//                System.out.println("Data has not been Deleted");
//            }*/

/*            //Deleting data into table in database using statement...
//            String query = String.format("DELETE FROM student where student_id=%d ", 187);
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data has been Deleted Successfully");
//            }
//            else{
//                System.out.println("Data has not been Deleted");
//            }*/

           //Updating data into table in database using statement...
//            String query = String.format("UPDATE student SET grade = %s where student_id = %d", "A+", 10);
//            //String query = String.format("UPDATE student SET " + columnName + "= %s where student_id = %d", grade, id);
//            rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data has been Updated Successfully");
//            }
//            else{
//                System.out.println("Data has not been Updated");
//            }

            //Inserting data into table in database using statement...
//            String query = String.format("INSERT INTO student (student_id, fist_name, last_name, age, grade) VALUES (%d, '%s', '%s', %d, '%s')", 189, "Saroj", "Bajpai", 90, "C");
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data has been inserted Successfully");
//            }
//            else{
//                System.out.println("Data has not been inserted");
//            }

            //Retrieving data into table in database using statement...
//            String newSt_id = "10";
//            ResultSet rs = statement.executeQuery("select * from student where student_id = "+newSt_id);
//            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "studentId", "FirstName", "LastName", "Age", "Grade");
//            while(rs.next()){
//                System.out.printf("%-10d %-10s %-10s %-10d %-10s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
//                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5));
//
//            }

            connection.close(); //we will always close the connection.
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

//String query = "UPDATE student SET first_name = ?, last_name = ?, stu_age = ?, grade = ? WHERE student_id = ?";
//// Create prepared statement with RETURN_GENERATED_KEYS option
//PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//// Set parameters for the prepared statement
//preparedStatement.setString(1, firstName);
//preparedStatement.setString(2, lastName);
//preparedStatement.setInt(3, age);
//preparedStatement.setString(4, grade);
//preparedStatement.setInt(5, Integer.parseInt(searchId));

