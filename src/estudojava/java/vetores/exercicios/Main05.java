package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
        Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).

        Exemplo:
        Quantos numeros voce vai digitar? 6
        Digite um numero: 8.0
        Digite um numero: 4.0
        Digite um numero: 10.0
        Digite um numero: 14.0
        Digite um numero: 13.0
        Digite um numero: 7.0

        MAIOR VALOR = 14.0
        POSICAO DO MAIOR VALOR = 3
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ? ");
        int x = sc.nextInt();
        double[] num = new double[x];

        for (int i=0; i< num.length; i++){
            System.out.print("Digite um numero: ");
            double j = sc.nextDouble();
            num[i] = j;
        }
        System.out.println();

        double maior = 0.0;
        int indice = 0;

        for (int i=0; i< num.length; i++){
            if (num[i] > maior){
                maior = num[i];
                indice = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n ", maior);
        System.out.println("Posição do maior valor = " + indice);
        sc.close();
    }
}