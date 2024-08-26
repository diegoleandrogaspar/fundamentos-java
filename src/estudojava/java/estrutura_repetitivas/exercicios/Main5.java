package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial.
        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.

        Exemplos:
        Entrada: Saída:
        4
        Saída:24
        Entrada:
        1
        Saída:1
        Entrada:
        5
        Saída: 120
        Entrada:
        0
        Saída: 1
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x ==0){
            x =1;
        }
        else {
            int fatorial = x;
            for (int y = x; y > 1; y--) {
                fatorial--;
                x *= fatorial;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
