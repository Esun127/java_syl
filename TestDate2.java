import java.util.Date;


public class TestDate2 {
    public static void main(String[] args) {

        Date date1 = new Date(10000000);
        Date date2 = new Date();

        boolean isBefore = date1.before(date2);
        boolean isAfter = date1.after(date2);
        System.out.println(isBefore);
        System.out.println(isAfter);
        System.out.println(date1);

    }
}