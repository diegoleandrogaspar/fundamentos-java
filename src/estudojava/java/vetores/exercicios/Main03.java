package vetores.exercicios;

import vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
        Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
        de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[x];

        for (int i=0; i< pessoas.length; i++){
         System.out.println(" Dados da " + (1+ i)+"a pessoa:");
            Pessoa pessoa = new Pessoa();

            System.out.println("Nome:");
            pessoa.nome = sc.nextLine();
            System.out.println("Idade:");
            pessoa.idade = sc.nextInt();
            System.out.println("Altura:");
            pessoa.altura = sc.nextDouble();
            pessoas[i] = pessoa;
        }

        double media = 0.0;
        int countIdade = 0;

        for (int i=0; i< pessoas.length; i++) {
            media += pessoas[i].altura;
            if (pessoas[i].idade < 16){
                countIdade++;
            }
        }


        double altura = media /x;
        double porcentagem = (countIdade / (double) x * 100);

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].idade < 16) {
                System.out.println(pessoas[i].nome);
            }
        }

        sc.close();
    }
}
