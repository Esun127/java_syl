import java.util.Date;
import java.time.*;


public class TestNewDate2 {
    public static void main(String[] args) {

        ZoneId  zondId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();

        ZonedDateTime zdt = localDate.atStartOfDay(zondId);

        Date date = Date.from(zdt.toInstant());
        System.out.println("LocalDate: " + localDate);
        System.out.println("Date: " + date);
    }
}