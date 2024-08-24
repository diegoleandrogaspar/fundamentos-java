package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        Exemplo:
        Entrada:
        5
        14
        123
        10
        -25
        32
        Saída:
        2 in
        3 out

        */
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int in =0;
        int out = 0;

        for (int i=0; i < x; i++){
            int y = sc.nextInt();
            if (y >= 10 && y <=20){
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
