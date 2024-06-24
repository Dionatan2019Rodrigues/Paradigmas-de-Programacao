package exe04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContagemIntervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        long countIntervalo1 = contarNumerosNoIntervalo(numeros, 0, 25);
        long countIntervalo2 = contarNumerosNoIntervalo(numeros, 26, 50);
        long countIntervalo3 = contarNumerosNoIntervalo(numeros, 51, 75);
        long countIntervalo4 = contarNumerosNoIntervalo(numeros, 76, 100);

        System.out.println("Quantidade de números no intervalo [0, 25]: " + countIntervalo1);
        System.out.println("Quantidade de números no intervalo [26, 50]: " + countIntervalo2);
        System.out.println("Quantidade de números no intervalo [51, 75]: " + countIntervalo3);
        System.out.println("Quantidade de números no intervalo [76, 100]: " + countIntervalo4);

        scanner.close();
    }

    private static long contarNumerosNoIntervalo(List<Integer> numeros, int inicio, int fim) {
        return numeros.stream()
                .filter(num -> num >= inicio && num <= fim)
                .count();
    }
}

