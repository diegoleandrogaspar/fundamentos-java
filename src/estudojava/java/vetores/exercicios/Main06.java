package vetores.exercicios;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada.
        Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
        elementos correspondentes de A e B. Imprima o vetor C gerado.

        Exemplo:
        Quantos valores vai ter cada vetor? 6
        Digite os valores do vetor A:
        8
        2
        11
        14
        13
        20
        Digite os valores do vetor B:
        5
        10
        3
        1
        10
        7
        VETOR RESULTANTE:
        13
        12
        14
        15
        23
        27
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor ?");
        int x = sc.nextInt();

        int[] vetorA = new int[x];
        int[] vetorB = new int[x];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i< vetorA.length; i++){
            int a = sc.nextInt();
            vetorA[i] = a;
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i< vetorB.length; i++){
            int b = sc.nextInt();
            vetorB[i] = b;
        }

        int[] vetorC = new int[x];

        System.out.println("Vetor Resultante:");
        for (int i=0; i< vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}
