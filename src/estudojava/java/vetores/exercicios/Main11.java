package vetores.exercicios;

import vetores.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.
        Exemplo:
        Quantas pessoas serao digitadas? 5
        Altura da 1a pessoa: 1.70
        Genero da 1a pessoa: F
        Altura da 2a pessoa: 1.83
        Genero da 2a pessoa: M
        Altura da 3a pessoa: 1.54
        Genero da 3a pessoa: M
        Altura da 4a pessoa: 1.61
        Genero da 4a pessoa: F
        Altura da 5a pessoa: 1.75
        Genero da 5a pessoa: F
        Menor altura = 1.54
        Maior altura = 1.83
        Saída:
        Media das alturas das mulheres = 1.69
        Numero de homens = 2
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serao digitadas ?");
        int x = sc.nextInt();

        People[] people = new People[x];

        for (int i=0; i< people.length; i++) {
            System.out.print("Altura da " +  (1+i) + "a pessoa \n");
            People people1 = new People();
            sc.nextLine();
            people1.altura = sc.nextDouble();
            System.out.printf("Genero da " + (1+i) + "a pessoa \n");
            people1.genero = sc.next().charAt(0);
            people[i] = people1;
        }

        double menor = people[0].altura;

        for (int i=0; i< people.length; i++){
              if (people[i].altura < menor){
                  menor = people[i].altura;
              }
        }

        double maior = people[0].altura;

        for (int i=0; i< people.length; i++){
            if (people[i].altura > maior){
                maior = people[i].altura;
            }
        }

        double soma = 0.0;
        int count =0;
        int countM =0;
        for (int i=0; i < people.length; i++){
            if (people[i].genero == 'F'){
                soma += people[i].altura;
                count++;
            }
            else {
                countM++;
            }
        }
        double media = soma/count;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + countM);

        sc.close();
    }
}