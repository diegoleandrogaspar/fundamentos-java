package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.

        Exemplo:
        Entrada:
        3
        6.5 4.3 6.2
        5.1 4.2 8.1
        8.0 9.0 10.0
        Saída:
        5.7
        6.3
        9.3

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        double soma =0;
        double media =0;

        for (int i=0; i < x; i++){
            double y = sc.nextDouble();
            y *= 2;
            double z = sc.nextDouble();
            z *= 3;
            double t = sc.nextDouble();
            t *= 5;
            soma = y + z + t;
            media = soma / 10;

            //media = Math.round(media);

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
