package curso.application;

import java.util.Scanner;

public class ProgramMatriz {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var lines = sc.nextInt();
        var columns = sc.nextInt();

        var matriz = new int[lines][columns];

        for (var l = 0; l < matriz.length; l++) {
            for (var c = 0; c < matriz.length; c++) {
                matriz[l][c] = sc.nextInt();
            }
        }

        var x = sc.nextInt();

        for (var l = 0; l < matriz.length; l++) {
            for (var c = 0; c < matriz.length; c++) {
                if (matriz[l][c] == x) {
                    System.out.println("Position: " + l + "," + c);

                    if (c > 0) {
                        System.out.println("Left: " + (matriz[l][c - 1]));
                    }

                    if (l > 0) {
                        System.out.println("Up: " + (matriz[l - 1][c]));
                    }

                    if (c < matriz[l].length - 1) {
                        System.out.println("Right: " + (matriz[l][c + 1]));
                    }

                    if (l < matriz.length - 1) {
                        System.out.println("Down: " + (matriz[l][c + 1]));
                    }
                }
            }
        }
        sc.close();
    }
}
