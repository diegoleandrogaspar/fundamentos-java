package matriz;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e uma matriz de ordem N
        contendo números inteiros. Em seguida, mostrar a diagonal principal e
        a quantidade de valores negativos da matriz
        Exemplo:
        Entrada
        3
        5 -3 10
        15 8  2
        7  9 -4
        Saída:
        diagonal principal
        5 8 -4
        numeros negativos = 2
         */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[][] num = new int[x][x];

        for (int i=0; i< num.length; i++) {
           for (int j=0; j<num[i].length; j++) {
               num[i][j] = sc.nextInt();
           }
        }

        System.out.println("Diagonal Principal");
        for (int i=0; i< num.length; i++) {
            System.out.print(num[i][i] + " ");
        }
        System.out.println();

        int count =0;
        for (int i=0; i< num.length; i++){
            for (int j=0; j<num[i].length; j++){
                if (num[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Números negativos = " + count);



        sc.close();
    }
}
