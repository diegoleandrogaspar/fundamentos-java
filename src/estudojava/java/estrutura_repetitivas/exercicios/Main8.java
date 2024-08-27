package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em fahrenheit. Perguntar se o usuário
        deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        double f = 9.0 * c / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
        System.out.print("Deseja repetir(s/n)? ");
        resp = sc.next().charAt(0);
        }
        while (resp != 'n');

        sc.close();
    }
}
