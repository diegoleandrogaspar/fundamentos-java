package programacao_funcional_e_lambdas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main02 {
    public static void main(String[] args) {
        /*
        Filtre os números de 1 a 20 que são pares e acima de 8 atráves de uma lista
         */

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20);


        Predicate<Integer> isPar = n -> n % 2 ==0;
        Predicate<Integer> isMaiorQueOito = n -> n > 8;

        Predicate<Integer> isParEisMaiorQueOito = isPar.and(isMaiorQueOito);

        List<Integer> result = numeros.stream()
                .filter(isParEisMaiorQueOito)
                .collect(Collectors.toList());


        System.out.println(result);
    }
}
