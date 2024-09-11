package set.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main05 {
    public static void main(String[] args) {
        /*
        Em um portal de cursos online, cada usuário possui um código único, representado por
        um número inteiro.
        Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
        matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
        é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
        alunos repetidos em mais de um curso.
        O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
        Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
        quantidade total e alunos dele, conforme exemplo.

        Exemplo:
        Quantos estudantes são para o curso A? 3
        21
        35
        22
        Quantos estudantes são para o curso B? 2
        21
        50
        Quantos estudantes são para o curso C? 3
        42
        35
        13
        Total de estudantes: 6
         */
        Scanner sc = new Scanner(System.in);

        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();

        System.out.print("Quantos estudantes são para o curso A?");
        int x = sc.nextInt();
        for (int i=0; i < x; i++){
            cursoA.add(sc.nextInt());
        }

        System.out.print("Quantos estudantes são para o curso B ?");
        int y = sc.nextInt();
        for (int i=0; i < y; i++){
            cursoB.add(sc.nextInt());
        }

        System.out.print("Quantos estudantes são para o curso C ?");
        int z = sc.nextInt();
        for (int i=0; i < z; i++){
            cursoC.add(sc.nextInt());
        }

        Set<Integer> todosAlunos = new HashSet<>();
        todosAlunos.addAll(cursoA);
        todosAlunos.addAll(cursoB);
        todosAlunos.addAll(cursoC);

        System.out.println("Total de estudantes únicos " + todosAlunos.size());

        sc.close();
    }
}