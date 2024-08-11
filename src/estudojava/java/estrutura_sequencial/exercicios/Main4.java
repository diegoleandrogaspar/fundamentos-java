package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.

        Exemplos:
        Entrada:
        25
        100
        5.50
        Saída:
        NUMBER = 25
        SALARY = U$ 550.00
        Entrada:
        1
        200
        20.50
        Saída:
        NUMBER = 1
        SALARY = U$ 4100.00
        Entrada:
        6
        145
        15.55
        Saída:
        NUMBER = 6
        SALARY = U$ 2254.75
         */

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        double salary = b * c;
        
        System.out.printf("NUMBER = %d\nSALARY = %.2f "  , a ,salary);

        sc.close();
    }
}
