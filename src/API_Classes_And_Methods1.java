import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class API_Classes_And_Methods1 {
    public static void main(String[] args) {
        //Printing Local Date.
        LocalDate d = LocalDate.now();
        System.out.println(d);

        //Printing the Local Time.
        LocalTime t = LocalTime.now();
        System.out.println(t);

        //Printing both date and time.
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        //System.out.println(d + " " + t);

        //DateTimeFormatter in java
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        String b = dt.format(dft);
        System.out.println(b);
//        DateTimeFormatter dft2 = DateTimeFormatter.ISO_LOCAL_DATE;
//        String c = dt.format(dft);
//        System.out.println(c);

    }
}
