import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class AdvanceJavaPracticeSet {
    public static void main(String[] args) {
        //problem1
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Shashi");
        ar.add("Shashi1");
        ar.add("Shashi2");
        ar.add("Shashi3");
        ar.add("Shashi4");
        ar.add("Shashi5");
        ar.add("Shashi6");
        ar.add("Shashi7");
        ar.add("Shashi8");
        ar.add("Shashi9");
        for(String obj: ar){
            System.out.println(obj);
        }

        //problem2
        Date d1 = new Date();
        System.out.println(d1.getHours()+ ":" + d1.getMinutes() + ":" + d1.getSeconds());

        //problem3
        Calendar ct = Calendar.getInstance();
        System.out.println(ct.get(Calendar.HOUR_OF_DAY) + ":" + ct.get(Calendar.MINUTE) + ":" + ct.get(Calendar.SECOND));

        //problem4
        LocalDateTime dt1 = LocalDateTime.now();
        //System.out.println(dt1);
        DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("H:m:s");
        String d4 = dt1.format((dft2));
        System.out.println(d4);
    }
}


