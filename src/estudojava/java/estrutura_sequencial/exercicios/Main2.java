package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159

        Exemplos:
        Entrada:
        2.00
        Saída A=12.5664
        Entrada:
        100.64
        Saída A=31819.3103
        Entrada:
        150.00
        Saída A=70685.7750
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double A,B, C;
        double pi = 3.14159;

        A = Math.pow(x, 2.0) * pi;
        B = Math.pow(y, 2.0) * pi;
        C = Math.pow(z, 2.0) * pi;

        System.out.println("Area= " + A );
        System.out.println("Area= " + B );
        System.out.println("Area= " + C );


        sc.close();
    }
}
