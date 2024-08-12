package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo.
        A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Exemplos:
        Entrada:
        16 2
        Saída: O JOGO DUROU 10 HORA(S)
        Entrada:
        0 0
        Saída: O JOGO DUROU 24 HORA(S)
        Entrada:
        2 16
        Saída: O JOGO DUROU 14 HORA(S)

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int inicial = sc.nextInt();
        int fim = sc.nextInt();
        
        int resultado = 0;
        int positivo =0;

        int result = fim - inicial;
        if (result < 0){
         positivo =  Math.abs(result);
             resultado = positivo - 24;
        }
        int jogo = Math.abs(resultado);

        System.out.println("O JOGO DUROU " + jogo + " HORA(S)");

        sc.close();

    }
}
