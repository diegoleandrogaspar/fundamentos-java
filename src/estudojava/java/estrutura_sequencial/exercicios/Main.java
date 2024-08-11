package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.

        Exemplos:
        Entrada:
        10
        30
        Saída: SOMA = 40
        Entrada:
        -30
        10
        Saída: SOMA = -20
        Entrada:
        0
        0
        Saída: SOMA = 0
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;

        System.out.println("SOMA = " + soma);


        sc.close();


    }
}
