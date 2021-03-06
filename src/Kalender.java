import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Kalender {
    public static void main(String[] args) {

        {
            GregorianCalendar calendar = new GregorianCalendar(2021, 2, 12);
            calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);
            int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);
            int daysInMonth = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

            System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
            System.out.println("MO DI MI DO FR SA SO");

            String initialSpace = " ";
            for (int i = 0; i < dayOfWeek - 1; i++) {
                initialSpace += "    ";
            }
            System.out.println(initialSpace);
            for (int i = 1, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
                for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
                    System.out.printf("%2d ", dayOfMonth);
                    dayOfMonth++;
                }
                System.out.println();
            }
        }
    }
}
