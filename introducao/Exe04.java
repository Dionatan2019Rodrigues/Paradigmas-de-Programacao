import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: "+soma);
        entrada.close();
    }
}
