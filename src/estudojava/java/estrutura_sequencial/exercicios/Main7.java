package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
        (sendo 1=domingo, 2= segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.
         */


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2 :
                System.out.println("Dia da semana: Segunda");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Dia inexistente " + x);


        }

    }
}
