package curso.exercicios.estrutura.repetitiva.para;

import curso.utils.Util;

public class Exercise05 {
    public static void main(String[] args) {
        int numero = Util.scanInteger();
        var factorial = 1;
        for(var i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
