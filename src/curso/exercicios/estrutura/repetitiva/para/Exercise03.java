package curso.exercicios.estrutura.repetitiva.para;

import curso.util.Util;

public class Exercise03 {
    //
    //    6.5 4.3 6.2
    //    5.1 4.2 8.1
    //    8.0 9.0 10.0
    public static void main(String[] args) {
        Util.message("Digite a quantidade de casos de teste:");
        int scan = Util.scanInteger();

        for (var i = 0; i < scan; i++) {
            var a = Util.scanDouble();
            var b = Util.scanDouble();
            var c = Util.scanDouble();
            var media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
            System.out.printf("%.1f%n", media);
        }
    }
}
