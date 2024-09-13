package programacao_funcional_e_lambdas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {

        /*
        Filtre os números de 1 a 10 que são pares atráves de uma lista
         */

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usando Predicate para filtrar os números pares
        Predicate<Integer> isPar = n -> n % 2 ==0;
        List<Integer> pares = numeros.stream()
                .filter(isPar)
                .collect(Collectors.toList());

        System.out.println(pares);

    }
}
