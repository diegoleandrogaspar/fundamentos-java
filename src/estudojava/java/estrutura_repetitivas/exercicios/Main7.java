package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
       /*
       Fazer um programa para ler um número inteiro positivo N.
       O programa deve então mostrar na tela N linhas,
       começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
       exemplo.

        Exemplo:
        Entrada: Saída:
        5
        Saída:
        1 1 1
        2 4 8
        3 9 27
        4 16 64
        5 25 125

        */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<= x; i++){

            double m =  Math.pow(i,2);
            double p =  Math.pow(i,3);

            System.out.printf("%d %.0f  %.0f%n", i, m, p);
        }

    }
}
