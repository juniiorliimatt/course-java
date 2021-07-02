package curso.exercicios.estrutura.repetitiva.para;

import curso.util.Util;

public class Exercise06 {
    public static void main(String[] args) {
        int n = Util.scanInteger();
        for (var i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
