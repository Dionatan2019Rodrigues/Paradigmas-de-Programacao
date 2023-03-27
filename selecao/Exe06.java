package selecao;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite duas notas");
        Double nota1 = entrada.nextDouble();
        Double nota2 = entrada.nextDouble();
        System.out.println("Digite o total de aulas ministradas");
        Double total_aulas = entrada.nextDouble();
        System.out.println("Digite o total de aulas assistidas");
        Integer total_vistas = entrada.nextInt();
        Integer aprov = 0;

        Double media = (nota1 + nota2)/2;
        Double presenca = total_aulas * 0.75;
        if(presenca <= total_vistas)
            aprov = 1;

        if((media >=6) && (aprov==1))
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno reprovado!");

            
        entrada.close();
    }
}

