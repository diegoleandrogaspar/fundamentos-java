package poo;

import poo.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        /*
        Faça um programa para ler a cotação do dólar, e depois um valor em dólares
        a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
        considerando ainda que a pessoa terá que pagar ¨% de IOF sobre o valor em dólar. Criar uma classe currencyConverter para ser responsável pelos cálculos.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price ?");
        currencyConverter.price = sc.nextDouble();

        System.out.print("How many dollars will be bought ? ");
        currencyConverter.buy = sc.nextDouble();

        System.out.print(currencyConverter.toString());

        sc.close();
    }
}
