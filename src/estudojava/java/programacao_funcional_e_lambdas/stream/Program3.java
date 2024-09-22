package programacao_funcional_e_lambdas.stream;

import programacao_funcional_e_lambdas.stream.entities.Produto;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) throws IOException {
        /*
        Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv(suponha que exista pelo menos um produto)

        Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.
        Exemplo:
        Entrada de arquivo:
        Tv,900.00
        Mouse,50.00
        Tablet,350.00
        HD Case,80.90
        Computer,850.00
        Monitor,290.00

        Saída:
        Entre com o caminho do arquivo
        preco: 420.23
        Tablet
        Mouse
        Monitor
        HD Case
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPreco())
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Preços: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPreco() < avg)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);


        } catch (IIOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();



    }
}
