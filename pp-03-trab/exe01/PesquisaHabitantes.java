package exe01;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class PesquisaHabitantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Habitante> habitantes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();
            if (salario < 0) break;
            
            System.out.print("Digite o número de filhos: ");
            int numFilhos = scanner.nextInt();
            
            habitantes.add(new Habitante(salario, numFilhos));
        }

        double mediaSalario = habitantes.stream()
            .mapToDouble(Habitante::getSalario)
            .average()
            .orElse(0);

        double mediaFilhos = habitantes.stream()
            .mapToInt(Habitante::getNumFilhos)
            .average()
            .orElse(0);

        double maiorSalario = habitantes.stream()
            .mapToDouble(Habitante::getSalario)
            .max()
            .orElse(0);

        long countSalarioAteMil = habitantes.stream()
            .filter(h -> h.getSalario() <= 1000)
            .count();

        double percentualSalarioAteMil = (countSalarioAteMil * 100.0) / habitantes.size();

        System.out.printf("Média de salário: %.2f%n", mediaSalario);
        System.out.printf("Média de número de filhos: %.2f%n", mediaFilhos);
        System.out.printf("Maior salário: %.2f%n", maiorSalario);
        System.out.printf("Percentual de pessoas com salário até 1000 reais: %.2f%%%n", percentualSalarioAteMil);

        scanner.close();
    }
}
