import java.time.*;


public class TestNewDate1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zoneDateTime = ZonedDateTime.now();

        System.out.println(instant);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zoneDateTime);

    }
}