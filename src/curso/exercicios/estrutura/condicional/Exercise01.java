package curso.exercicios.estrutura.condicional;

import curso.utils.Util;

public class Exercise01 {
    public static void main(String[] args) {
        Util.message("Digite um número NEGATIVO ou POSITIVO: ");
        var numero = Util.scanInteger();
        if (numero > 0) {
            Util.message("POSITIVO");
        } else {
            Util.message("NEGATIVO");
        }
    }
}
