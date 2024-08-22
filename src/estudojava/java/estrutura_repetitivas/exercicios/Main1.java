package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        /*
        Leia um valor inteiro X (1 <= X <= 1000).
        Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.

        Exemplo:
        Entrada:
        8
        Saída:
        1
        3
        5
        7
        */

        Scanner sx = new Scanner(System.in);
        int x = sx.nextInt();

        for (int y =1; y < x; y++){
            if (y % 2 !=0){
                System.out.println(y);
            }
        }
    }
}
