package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Exemplos:
        Entrada:
        12
        Saída: É PAR
        Entrada:
        -27
        Saída: É IMPAR
        Entrada:
        0
        Saída: É PAR
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(" É PAR ");
        }
        else {
            System.out.println("É IMPAR");
        }

        sc.close();

    }
}
