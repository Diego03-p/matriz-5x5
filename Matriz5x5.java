package matriz5x5;

import java.util.Scanner;

public class Matriz5x5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Ingreso de datos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz ingresada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}