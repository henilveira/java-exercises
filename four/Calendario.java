package four;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + "/" + (cal.get(Calendar.YEAR))));
    }
}
