package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        /*
        Expressão condicinal ternária
        Estrutura opcional ao if-else quando se deseja deciddir um valor com base em uma condição
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

       String mensagem = (x >= y) ? "X é maior ou igual a y"  : "y é maior que x";

       System.out.println(mensagem);

        sc.close();


    }
}
