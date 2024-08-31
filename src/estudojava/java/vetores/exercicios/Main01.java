package vetores.exercicios;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10)
        e depois N números inteiros e armazene-os em um vetor.
        Em seguida, mostrar na tela todos os números negativos lidos.
         */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[] num = new int[x];

        for (int i=0; i< num.length; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");
        for (int i=0; i< num.length; i++){
            if (num[i] < 0 ){
                System.out.println(num[i]);
            }
        }

        sc.close();

    }
}
