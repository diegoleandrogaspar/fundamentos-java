package vetores.exercicios;

import vetores.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).

        Exemplo:
        Quantos alunos serao digitados? 4
        Digite nome, primeira e segunda nota do 1o aluno:
        Joao Silva
        7.0
        8.5
        Digite nome, primeira e segunda nota do 2o aluno:
        Maria Teixeira
        9.2
        6.5
        Digite nome, primeira e segunda nota do 3o aluno:
        Carlos Carvalho
        5.0
        6.0
        Digite nome, primeira e segunda nota do 4o aluno:
        Teresa Pires
        5.5
        6.5
        Saída:
        Alunos aprovados:
        Joao Silva
        Maria Teixeira
        Teresa Pires
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados ?");
        int x = sc.nextInt();

        Aluno[] alunos = new Aluno[x];

        for (int i=0; i< alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " +(1+i) + "o aluno:");
            Aluno aluno = new Aluno();
            sc.nextLine();
            aluno.nome = sc.nextLine();
            aluno.nota1 = sc.nextDouble();
            aluno.nota2 = sc.nextDouble();
            alunos[i] = aluno;
        }
        double media = 6.0;

        System.out.println("Alunos Aprovados:");
        for (int i=0; i< alunos.length; i++){
            if ((alunos[i].nota1 + alunos[i].nota2) / 2 >= media){
                System.out.println(alunos[i].nome);
            }
        }
        sc.close();
    }
}