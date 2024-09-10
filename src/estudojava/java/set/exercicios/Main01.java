package set.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        /*
        Peça ao usuário para inserir uma lista de números inteiros
        e remova os números duplicados usando a interface Set. Exiba a lista sem duplicatas.
         */
        Set<Integer> numeros = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=0; i<x; i++){
            numeros.add(sc.nextInt());
        }
        System.out.println("Números únicos " + numeros);
    }
}
