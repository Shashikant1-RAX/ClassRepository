import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class classWork {
    public static void main(String[] args) throws IOException {
        File file = new File("Example.txt");
        boolean created = file.createNewFile();
        if (created) {
            System.out.println("file is been created");
        } else {
            System.out.println("file already exists. ");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Hello, World!");
        writer.close();
        FileReader reader = new FileReader(file);
//        int character;
//        while ((character = reader.read()) != -1) {
//            System.out.print((char) character);
//        }
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        reader.close();
    }
}



