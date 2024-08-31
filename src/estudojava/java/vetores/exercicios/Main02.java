package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        double[] num = new double[x];

        for (int i=0; i < num.length; i++){
            System.out.print("Digite um número:");
            num[i] = sc.nextDouble();
        }

        double soma = 0.0;

        System.out.print("VALORES = ");
        for (int i=0; i< num.length; i++){
            System.out.printf("%.1f " , num[i]);
            soma += num[i];
        }
        System.out.println();
        double media = soma / num.length;
        System.out.printf("SOMA = %.2f\n ", soma);
        System.out.printf("MEDIA = %.2f\n ", media);

        sc.close();
    }
}
