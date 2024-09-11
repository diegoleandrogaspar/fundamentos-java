package map;

import set.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program3 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Na contagem de votos de uma eleição, são gerados vários registros
        de votação contendo o nome do candidato e a quantidade de votos
        (formato .csv) que ele obteve em uma urna de votação. Você deve
        fazer um programa para ler os registros de votação a partir de um
        arquivo, e daí gerar um relatório consolidado com os totais de cada
        candidato.
         */

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votacao = new LinkedHashMap<>();

        System.out.print("Entre com o arquivo");

        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votacao.containsKey(nome)) {
                    int votos = votacao.get(nome);
                    votacao.put(nome, count + votos);
                } else {
                    votacao.put(nome, count);
                }

                line = br.readLine();
            }

            for (String key : votacao.keySet()) {
                System.out.println(key + ": " + votacao.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}