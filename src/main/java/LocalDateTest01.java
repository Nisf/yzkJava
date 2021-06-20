import java.time.LocalDate;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2019, 2, 4);
        LocalDate d3 = LocalDate.parse("2019-03-08");
        System.out.println(d2.getYear());
        System.out.println(d2.getDayOfMonth());
        System.out.println(d2.getMonth());
        System.out.println(d2.getMonthValue());
    }
}
