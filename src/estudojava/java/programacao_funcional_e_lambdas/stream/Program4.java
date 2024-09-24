package programacao_funcional_e_lambdas.stream;

import programacao_funcional_e_lambdas.stream.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) throws IOException {
        /*
        Fazer um programa para ler os dados(nome, email e salário) de funcionários a partir de um arquivo em formato .csv
        Em seguida mostrar, em ordem alfabética, e email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário

        Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'

        Exemplo arquivo de entrada:
        Maria,maria@gmail.com,3200.00
        Alex,alex@gmail.com,1900.00
        Marco,marco@gmail.com,1700.00
        Bob,bob@gmail.com,3500.00
        Anna,anna@gmail.com,2800.00

        Saída:
        Entre com o caminho do arquivo:
        Entre com o salário: 2000.00
        Email das pessoas quando o salário é maior que aquele da entrada 2000.00:
        anna@gmail.com
        bob@gmail.com
        maria@gmail.com
        Soma dos salários das pessoas quando começam com a letra 'M': 4900.00
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Double salarioUsuario = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter( p -> p.getSalario() > salarioUsuario)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email das pessoas quando o salário é maior que aquele da entrada " + salarioUsuario + ":");
            emails.forEach(System.out::println);

            double salario = list.stream()
                    .filter( p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println(" Somatórios dos salários dos funcionários que começam com a letra 'M' " + String.format("%.2f", salario));

        }
        catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }


        sc.close();

    }
}
