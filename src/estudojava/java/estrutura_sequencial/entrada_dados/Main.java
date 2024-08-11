package estrutura_sequencial.entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //String x;
        //x = scanner.next();

        //int number;
        //number = scanner.nextInt();

        //double number2;
        //number2 = scanner.nextDouble();

        //char letra;
        //letra = scanner.next().charAt(0);

        // Para ler vários dados na mesma linha
        String x;
        int y;
        double z;

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();

        System.out.println(" O " + x + " tem " + y + " anos de idade " + " e tirou nota "  + z + " na prova " );

        //System.out.println("Você digitou: " + letra);


        scanner.close();
    }

}
