package curso.exercicios.estrutura.repetitiva.para;

import curso.utils.Util;

public class Exercise04 {
    public static void main(String[] args) {
        int scan = Util.scanInteger();
        for (var i = 0; i < scan; i++) {
            int a = Util.scanInteger();
            int b = Util.scanInteger();

            if (b == 0) {
                Util.message("divisão impossível");
            } else {
                var d = "" + a / b;
                Util.message(d);
            }
        }
    }
}
