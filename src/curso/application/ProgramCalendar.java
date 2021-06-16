package curso.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {
    public static void main(String[] args) {
        var sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));

        var cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(d);

        // meses começam a partir do 0;
        var month = cal.get(Calendar.MONTH) + 1;
        var minutes = cal.get(Calendar.MINUTE);
        System.out.println("Mês: " + month + ", Minutes: " + minutes);

    }
}
