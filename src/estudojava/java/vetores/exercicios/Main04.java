package vetores.exercicios;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor.
        Em seguida, mostre na tela todos os números pares,
        e também a quantidade de números pares.

        Exemplo de Entrada e Saída:

        Quantos numeros voce vai digitar? 6
        Digite um numero: 8
        Digite um numero: 2
        Digite um numero: 11
        Digite um numero: 14
        Digite um numero: 13
        Digite um numero: 20

        NUMEROS PARES:
        8 2 14 20
        QUANTIDADE DE PARES = 4
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ?");
        int x = sc.nextInt();
        sc.nextLine();

        int[] num = new int[x];

        for (int i=0; i< num.length; i++){
            System.out.print("Digite um numero: ");
            int j = sc.nextInt();
            num[i] = j;
        }

        int count =0;
        System.out.println("Numeros pares: ");
        for (int i=0; i< num.length; i++){
            if (num[i] % 2 ==0){
                count++;
                System.out.print(num[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares = " + count);
        sc.close();
    }
}
