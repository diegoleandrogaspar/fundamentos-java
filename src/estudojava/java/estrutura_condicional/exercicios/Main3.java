package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
        ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
        Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

        Exemplos:
        Entrada:
        6 24
        Saída: Sao Multiplos
        Entrada:
        6 25
        Saída: Nao sao Multiplos
        Entrada:
        24 6
        Saída: Sao Multiplos
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b ==0 || b % a==0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }


        sc.close();
    }
}
