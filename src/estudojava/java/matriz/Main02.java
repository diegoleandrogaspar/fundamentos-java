package matriz;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        /*
         Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas
         contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence á matriz.
         Para cada ocorrência de X, mostrar os valores á esquerda, acima, á direita e abaixo de X, quando houver,
         conforme exemplo abaixo:

          Exemplo: 3 linhas e 4 colunas
          3 4

          10  8 15 12
          21 11 23 8
          14  5  13 19

           encontrar o número 8

           position 0,1:
           left: 10
           Right: 15
           Down: 11
           Position 1,3:
           Left: 23
           Up: 12
           Down: 19
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int x = 3;
        int y = 4;

        int[][] num = new int[x][y];

        for (int i=0; i < num.length; i++){
            for (int j =0; j <num[i].length; j++){
                num[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i < num.length; i++){
            for (int j =0; j <num[i].length; j++){
                if (num[i][j] == a){
                    System.out.println("Position " + i + "," + j);

                    if (j > 0){
                        System.out.println("Left: " + num[i][j-1]);
                    }
                    if (j < num[i].length -1){
                        System.out.println("Right: " + num[i][j+1]);
                    }

                    if (i >0){
                        System.out.println("Up " + num[i-1][j]);
                    }

                    if (i < num.length -1){
                        System.out.println("Down : " + num[i + 1][j]);
                    }
                }

            }
        }




        sc.close();


    }
}
