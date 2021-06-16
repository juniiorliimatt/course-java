package curso.application;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {
    public static void main(String[] args) throws ParseException {

        // Definindo data e formatando.
        var data = new Date(System.currentTimeMillis());
        var formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        formatador.setTimeZone(TimeZone.getTimeZone("GMT"));


        System.out.println(formatador.format(data));
        System.out.println();

        var sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        var sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        var x1 = new Date(System.currentTimeMillis());
        var x2 = new Date(System.currentTimeMillis());
        var x3 = new Date(0L);
        var x4 = new Date(1000L * 60L * 60L * 5);
        var x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println("-------------------------------------------------");
        System.out.println(sdf1.format(y1));
        System.out.println(sdf2.format(y2));

        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(x3));
        System.out.println(sdf2.format(x4));
        System.out.println(sdf3.format(x5));


        System.out.println("-------------------------------------------------");
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));

        System.out.println(sdf3.format(x1));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x3));
        System.out.println(sdf3.format(x4));
        System.out.println(sdf3.format(x5));

    }
}
