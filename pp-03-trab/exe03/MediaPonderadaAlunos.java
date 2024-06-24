package exe03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MediaPonderadaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o código do aluno: ");
            int codigo = scanner.nextInt();

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            List<Double> notas = Arrays.asList(nota1, nota2, nota3);
            double mediaPonderada = calcularMediaPonderada(notas);

            String status = mediaPonderada >= 5 ? "APROVADO" : "REPROVADO";

            System.out.println("Código do aluno: " + codigo);
            System.out.println("Notas: " + notas);
            System.out.printf("Média ponderada: %.2f%n", mediaPonderada);
            System.out.println("Status: " + status);
            System.out.println();
        }

        scanner.close();
    }

    private static double calcularMediaPonderada(List<Double> notas) {
        List<Double> sortedNotas = notas.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        double maiorNota = sortedNotas.get(0);
        double nota2 = sortedNotas.get(1);
        double nota3 = sortedNotas.get(2);

        return (maiorNota * 4 + nota2 * 3 + nota3 * 3) / 10;
    }
}

