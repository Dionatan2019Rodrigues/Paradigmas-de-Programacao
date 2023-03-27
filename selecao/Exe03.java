package selecao;
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer n1 = entrada.nextInt();
        System.out.println("Digite outro número");
        Integer n2 = entrada.nextInt();

        if(n1 == n2)
            System.out.println("Números iguais");
        else{
            if( n1 > n2)
                System.out.println(n1+" é o maior");
            else 
                System.out.println(n2+" é o maior");

        }
            
        entrada.close();
    }
}
