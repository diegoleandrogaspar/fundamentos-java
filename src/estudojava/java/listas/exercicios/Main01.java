package listas.exercicios;

import listas.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
    /*
    Fazer um programa para ler um número inteiro N e depois os dados os dados(id, nome e salario) de N funcionários.
    Não deve haver repetição de Id. Em seguida, efetuar o aumento de X por cento de no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação.
    Ao final final, mostrar a listagem atualizada dos funcionários, conforme exemplos abaixo:

    Quantos funcionários serão registrados? 3

    Funcionário #1
    Id: 333
    Name: Maria Brown
    Salario: 4000.00

    Funcionário #2
    Id: 536
    Name: Alex Grey
    Salario: 3000.00

    Funcionário #3
    Id: 772
    Name: Bob Green
    Salario: 5000.00

    Entre com o id do funcionário que terá aumento no salário: 536
    Entre com a porcentagem de aumento: 10.0

    Saída:
    Lista dos funcionários:
    333, Maria brown, 4000.00
    536, Alex Grey, 3300.00
    772, Bob Green, 5000.00
     */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados ?");
        int x = sc.nextInt();

        List<Funcionario> funcionarioList = new ArrayList<>(3);

        for (int i=0; i< x; i++){
            System.out.println("Funcionário #"+(1+i)+":");
            sc.nextLine();
            Funcionario funcionario = new Funcionario();

            System.out.print("Id: ");
            funcionario.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nome: ");
            funcionario.setNome(sc.nextLine());
            System.out.print("Salário: ");
            funcionario.setSalario(sc.nextDouble());

            funcionarioList.add(funcionario);
        }

        System.out.print("Entre com o id do funcionário que terá aumento no salário: ");
        int y = sc.nextInt();
        System.out.print("Entre com a porcentagem de aumento: ");
        double porcent = sc.nextDouble();

        List<Funcionario> result = funcionarioList.stream()
                .filter(z -> z.getId() == y)
                .collect(Collectors.toList());


        for (Funcionario r: result){
            r.setSalario(r.getSalario() * (1 + porcent /100));
        }

        System.out.println("Lista dos funcionários:");
        for (Funcionario f: funcionarioList){
            System.out.println(f.getId() + ", " + f.getNome() + ", " + String.format("%.2f", f.getSalario()));
        }

        sc.close();

    }
}
