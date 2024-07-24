import java.io.*;
import java.util.Scanner;

public class FileHandlingInJava {
    public static void main(String[] args) {
        try {
            File file = new File("Hii.txt");
            boolean hey = file.createNewFile();
            if (hey) {
                System.out.println("File is been created");
            } else {
                System.out.println("File already exists");
            }
            //Writing to a file
            FileWriter writer = new FileWriter(file);
            writer.write("Hey! it's good to see you.");
            writer.close();

            //Reading to file
            FileReader reader = new FileReader(file);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

//Question for practice
//write a program to generate multiplication table of given number and write into a file.
//class MultiplicationTable{
//    public static void main(String[] args) {
//        try {
//            File file = new File("Multiplication.txt");
//            boolean check = file.createNewFile();
//
//            //writing to a file
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the number: ");
//            int i = sc.nextInt();
//            String table = "";
//            for(int j=1;j<=10;j++){
//                table = table + i + "X" + j + ": " + i*j + "\n" ;
//            }
//            FileWriter writer = new FileWriter(file);
//            writer.write(table);
//            writer.close();
//
//            FileReader reader = new FileReader(file);
//            Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
//    }
//}

//codTantra Questions
//1.
//class Letters_In_Upper_Case{
//    public static void main(String[] args) {
//        try{
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter String to store in a file");
//            String input = sc.nextLine();
//            File myFile = new File("uppercase.txt");
//            myFile.createNewFile();
//
//            FileWriter writer = new FileWriter(myFile);
//            //writer.write("hii, i am shashi kant!");
//            writer.write(input);
//            writer.close();
//
//            FileReader  reader = new FileReader(myFile);
//            Scanner scanner = new Scanner(myFile);
//            while(scanner.hasNextLine()){
//                System.out.println(scanner.nextLine().toUpperCase());
//            }
//            reader.close();
//        }
//        catch(IOException e){
//            System.out.println("File does not exist");
//        }
//    }
//}

//2.
//class LineCalculator{
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter String to store in a file");
//            String input = sc.nextLine();
//            File myFile = new File("line.txt");
//            myFile.createNewFile();
//
//            FileWriter writer = new FileWriter(myFile);
//            writer.write(input);
//            writer.close();
//
//            FileReader fileReader = new FileReader(myFile);
//            Scanner scanner =  new Scanner(myFile);
//            int count = 0;
//            int totalLines = 0;
//            while(scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                count += line.length();
//                totalLines++;
//            }
//            System.out.printf("%.2f%n", (double) count/totalLines);
//        }
//        catch(IOException e){
//            System.out.println("file not found");
//        }
//    }
//}

//3.
//class Append_In_File{
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter String to store in a file");
//            String input = sc.nextLine();
//            File file = new File("append.txt");
//            file.createNewFile();
//
//            FileWriter writer = new FileWriter(file,true);
//            writer.write("Hii am Shashi Kant \n");
//            writer.write(input);
//            writer.close();
//
//            FileReader reader = new FileReader(file);
//            Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//            reader.close();
//        }
//        catch(IOException e){
//            System.out.println("File does not exist");
//        }
//    }
//}

//4.
//class CountLines{
//    public static void main(String[] args) {
//        try{
//            File file = new File("newfile.txt");
//            file.createNewFile();
//
//            FileWriter writer = new FileWriter(file);
//            writer.write("ahfashfskdj \n jwqefu2fuh2efh \n ej2fi1wefiuhr \n wefwhfurhfu3rh \n ouwuefiu21gfg");
//            writer.close();
//
//
//            FileReader reader = new FileReader(file);
//            Scanner sc = new Scanner(file);
//            int totalLines=0;
//
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                totalLines++;
////                System.out.println(totalLines);
//            }
//            System.out.println(totalLines);
//            reader.close();
//        }
//        catch(IOException e){
//            System.out.println("File does not exist");
//        }
//    }
//}

//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//class DeserializeDemo {
//    public static void main(String[] args) {
//        PersonSerializable person = null;
//
//        try (FileInputStream fileIn = new FileInputStream("person.ser");
//             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//            person = (PersonSerializable) in.readObject();
//        } catch (IOException i) {
//            i.printStackTrace();
//        } catch (ClassNotFoundException c) {
//            System.out.println("Person class not found");
//            c.printStackTrace();
//        }
//
//        System.out.println("Deserialized Person...");
//        System.out.println(person);
//    }
//}

