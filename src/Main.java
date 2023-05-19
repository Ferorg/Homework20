import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("GGGG qqqq cccc dd MMMM yyyy, 'время:' HH:mm:ss  ");
        System.out.println(localDateTime.format(dateTimeFormatter));


        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("GGGG qqqq cccc dd MMMM yyyy, 'время:' hh:mm:ss a ");
        System.out.println(localDateTime.format(dateTimeFormatter2));
    }
}