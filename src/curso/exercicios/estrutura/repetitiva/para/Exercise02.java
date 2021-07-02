package curso.exercicios.estrutura.repetitiva.para;

import curso.util.Util;

public class Exercise02 {
    // 5
    // 14 123 10 -25 32
    public static void main(String[] args) {
        Util.message("Digite uma quantidade de números:");
        int quantidade = Util.scanInteger();
        var in = 0;
        var out = 0;
        for (var i = 0; i < quantidade; i++) {
            int n = Util.scanInteger();
            if (n >= 10 && n <= 20) {
                in++;
            } else {
                out++;
            }
        }
        var r = "\n" + in + " in\n" + out + " out";
        Util.message(r);
    }
}
