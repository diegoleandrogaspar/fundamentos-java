package estrutura_condicional.exercicios;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       Fazer um programa para ler um número inteiro,
       e depois dizer se este número é negativo ou não.
       Exemplos:
        Entrada:
        -10
        Saída:NEGATIVO
        Entrada:
        8
        Saída:NAO NEGATIVO
        Entrada:
        0
        Saída:NAO NEGATIVO
       */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if ( a < 0){
            System.out.println( a + " é NEGATIVO");
        }
        else{
            System.out.println( a + " NÃO NEGATIVO");
        }
        sc.close();

    }
}