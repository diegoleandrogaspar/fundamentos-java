package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.

        Exemplos:
        Entrada:
        12 1 5.30
        16 2 5.10
        Saída:
        VALOR A PAGAR: R$ 15.50
        Entrada:
        13 2 15.30
        161 4 5.20
        Saída:
        VALOR A PAGAR: R$ 51.40
        Entrada:
        1 1 15.10
        2 1 15.10
        Saída:
        VALOR A PAGAR: R$ 30.20
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int num1 = sc.nextInt();
        double val1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double result = (val1 * num1) + (num2 * val2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);



        sc.close();
    }
}
