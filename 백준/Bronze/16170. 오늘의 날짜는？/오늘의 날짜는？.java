import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
        String year = utcNow.format(DateTimeFormatter.ofPattern("yyyy"));
        String month = utcNow.format(DateTimeFormatter.ofPattern("MM"));
        String day = utcNow.format(DateTimeFormatter.ofPattern("dd"));
        System.out.printf("%s\n%s\n%s", year,month,day);
    }
}