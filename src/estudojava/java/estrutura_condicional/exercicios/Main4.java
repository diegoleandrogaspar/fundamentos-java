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
        
        int hora = 0;

        if (inicial == fim ){
             hora = 24;
        }
        else if(inicial > fim){
            hora = (24 - inicial) + fim;
        }
        else {
            hora = fim - inicial;
        }
        System.out.println("O JOGO DUROU " + hora + " HORA(S)");
        sc.close();
    }
}
