package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item
        e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total = 0.0;

        if (codigo ==1){
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}
