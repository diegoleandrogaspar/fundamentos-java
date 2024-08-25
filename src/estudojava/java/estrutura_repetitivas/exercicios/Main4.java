package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler um número N.
        Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
        Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Exemplo:
        Entrada:
        3
        3 -2
        -8 0
        0 8
        Saída:
        -1.5
        divisao impossivel
        0.0

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int y=0; y < x; y++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double z = a /b;
            System.out.println(z);

            if (b == 0){
                System.out.println("Divisão impossivel");
            }
        }

        sc.close();

    }
}
