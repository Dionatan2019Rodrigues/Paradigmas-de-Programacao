package exe02;

import java.util.ArrayList;
import java.util.Scanner;

public class EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> votos = new ArrayList<>();

        System.out.println("Digite o código do voto (0 para encerrar):");

        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) break;
            if (voto >= 1 && voto <= 6) votos.add(voto);
            else System.out.println("Código inválido, digite novamente:");
        }

        long totalCandidato1 = contarVotos(votos, 1);
        long totalCandidato2 = contarVotos(votos, 2);
        long totalCandidato3 = contarVotos(votos, 3);
        long totalCandidato4 = contarVotos(votos, 4);
        long totalNulo = contarVotos(votos, 5);
        long totalBranco = contarVotos(votos, 6);

        System.out.println("Total de votos para o candidato 1: " + totalCandidato1);
        System.out.println("Total de votos para o candidato 2: " + totalCandidato2);
        System.out.println("Total de votos para o candidato 3: " + totalCandidato3);
        System.out.println("Total de votos para o candidato 4: " + totalCandidato4);
        System.out.println("Total de votos nulos: " + totalNulo);
        System.out.println("Total de votos em branco: " + totalBranco);

        scanner.close();
    }

    private static long contarVotos(ArrayList<Integer> votos, int codigo) {
        return votos.stream().filter(v -> v == codigo).count();
    }
}
