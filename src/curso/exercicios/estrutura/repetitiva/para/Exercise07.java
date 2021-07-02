package curso.exercicios.estrutura.repetitiva.para;

import curso.util.Util;

public class Exercise07 {
    public static void main(String[] args) {
        int numero = Util.scanInteger();
        for (var i = 1; i <= numero; i++) {
            System.out.println(i + " " + ((int) Math.pow(i, 2)) + " " + ((int) Math.pow(i,
                    3)));
        }
    }
}
