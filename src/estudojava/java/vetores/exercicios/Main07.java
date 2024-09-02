package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
        Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais.
        Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

        Exemplo:
        Quantos elementos vai ter o vetor? 4
        Digite um numero: 10.0
        Digite um numero: 15.5
        Digite um numero: 13.2
        Digite um numero: 9.8
        MEDIA DO VETOR = 12.125
        ELEMENTOS ABAIXO DA MEDIA:
        10.0
        9.8
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor ?");
        int x = sc.nextInt();

        double[] vetor = new double[x];

        double soma = 0.0;

        for (int i=0; i< vetor.length; i++){
            System.out.print("Digite um número: ");
            double j = sc.nextDouble();
            soma += j;
            vetor[i] = j;
        }
        double media = soma / x;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTO ABAIXO DA MEDIA:");

        for (int i=0; i< vetor.length; i++){
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
