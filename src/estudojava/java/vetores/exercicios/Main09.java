package vetores.exercicios;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.

        Exemplo:
        Quantas pessoas voce vai digitar? 5
        Dados da 1a pessoa:
        Nome: Joao
        Idade: 16
        Dados da 2a pessoa:
        Nome: Maria
        Idade: 21
        Dados da 3a pessoa:
        Nome: Teresa
        Idade: 15
        Dados da 4a pessoa:
        Nome: Carlos
        Idade: 23
        Dados da 5a pessoa:
        Nome: Paulo
        Idade: 17
        PESSOA MAIS VELHA: Carlos
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar ?");
        int x = sc.nextInt();

        String[] nome = new String[x];
        int[] idade = new int[x];

        for (int i=0; i < nome.length; i++){
            System.out.println("Dados da " + (1+i) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maior = idade[0];
        int indice =0;

        for (int i=0; i< idade.length; i++){
            if (idade[i] > maior){
                maior = idade[i];
                indice = i;        ;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[indice]);

        sc.close();
    }
}
