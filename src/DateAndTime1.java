//import java.util.Date;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.TimeZone;
//import java.time.LocalDate;
//
//public class DateAndTime1 {
//    public static void main(String[] args) {
//        //System.out.println(System.currentTimeMillis()); // it will return the time in milliseconds.
////        LocalDate di = LocalDate.now();
////        System.out.println(di);
//        //printing the current Date.
//        Date d = new Date();
////        System.out.println(d);
////        System.out.println(d.getDate());
////        System.out.println(d.getYear());
////        System.out.println(d.getMonth());
////        System.out.println(d.getTime());  // return time in milliseconds.
////        System.out.println(d.getHours());
//
//        //Calendar Class. Printing the Calendar Timezone.
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType()); // returns the type of calendar
//        System.out.println("India TimeZone:= " + c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());
//        System.out.println(c.get(Calendar.YEAR)); // return current year
////        System.out.println(c.get(Calendar.MONTH)); // return month
////        System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // return week of month
////        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // return day of week
////        System.out.println(c.get(Calendar.DATE)); // return current date
//        System.out.println(c.getTime());
////        c.add(Calendar.YEAR, 4); // return year after 4 year.
////        System.out.println(c.getTime());
////        c.add(Calendar.YEAR, -12); // return year before 12 years
////        System.out.println(c.getTime());
////        System.out.println(c.getWeeksInWeekYear());
////        Calendar cd = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
////        System.out.println("Singapore TimeZone:= " + cd.getTimeZone());
////        System.out.println(cd.getTimeZone().getID()); // return the id of current TimeZone
//
//        //Gregorian Class.
//        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(gc.isLeapYear(2016));
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[6]);
//        System.out.println(TimeZone.getAvailableIDs()[7]);
//        System.out.println(TimeZone.getDefault());
//    }
//}

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;

class DateTimeExample {
    public static void main(String[] args) {
// Creating LocalDate, LocalTime, LocalDateTime instances
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

// Creating specific dates and times
        LocalDate specificDate = LocalDate.of(2024, 6, 23);
        LocalTime specificTime = LocalTime.of(14, 30);
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 23, 14, 30);

// Formatting and parsing dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-06-23 14:30:00", formatter);

        System.out.println("Formatted DateTime: " + formattedDateTime);
        System.out.println("Parsed DateTime: " + parsedDateTime);

// Calculating durations and periods
        LocalDateTime startDateTime = LocalDateTime.of(2024, 6, 23, 10, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 6, 23, 14, 30);
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration between start and end: " + duration.toHours() + " hours");

        LocalDate startDate = LocalDate.of(2024, 6, 23);
        LocalDate endDate = LocalDate.of(2024, 6, 30);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between start and end dates: " + period.getDays() + " days");

// Additional operations
        LocalDate futureDate = today.plusDays(7);
        System.out.println("Date 7 days from now: " + futureDate);

        LocalTime laterTime = now.plusHours(2);
        System.out.println("Time 2 hours from now: " + laterTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(7).plusHours(2);
        System.out.println("Date and time 7 days and 2 hours from now: " + futureDateTime);
    }
}