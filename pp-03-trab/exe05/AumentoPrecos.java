package exe05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AumentoPrecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o código do produto: ");
            int codigo = scanner.nextInt();
            if (codigo < 0) break;

            System.out.print("Digite o preço de custo do produto: ");
            double precoCusto = scanner.nextDouble();

            produtos.add(new Produto(codigo, precoCusto));
        }

        List<Produto> produtosComAumento = produtos.stream()
                .map(produto -> new Produto(produto.getCodigo(), produto.getPrecoCusto() * 1.20))
                .collect(Collectors.toList());

        produtosComAumento.forEach(produto -> 
            System.out.printf("Código: %d, Novo Preço: %.2f%n", produto.getCodigo(), produto.getPrecoCusto()));

        double mediaPreco = produtosComAumento.stream()
                .mapToDouble(Produto::getPrecoCusto)
                .average()
                .orElse(0.0);

        System.out.printf("Média dos novos preços: %.2f%n", mediaPreco);

        scanner.close();
    }
}

