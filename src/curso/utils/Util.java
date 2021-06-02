package curso.utils;

import java.util.Scanner;
import java.util.logging.Logger;

public class Util {
    private Util() {
    }

    public static String scanString() {
        return scanner().next();
    }

    public static Double scanDouble() {
        return scanner().nextDouble();
    }

    public static Integer scanInteger() {
        return scanner().nextInt();
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void message(String msg){
        getLogger().info(msg);
    }

    public static Logger getLogger() {
        return Logger.getLogger(Util.class.getName());
    }
}
