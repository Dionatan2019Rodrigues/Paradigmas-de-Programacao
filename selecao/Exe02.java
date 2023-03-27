package selecao;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer num = entrada.nextInt();
        if(num < 0)
            System.out.println("Este número é negativo");
        else 
            System.out.println("Este número é positivo");

        if(num%2==0)
            System.out.println("Este número é par");
        else
            System.out.println("Este número é ímpar");
            
        entrada.close();
    }
}
