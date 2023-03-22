import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int predecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("Predecessor:"+predecessor+"  Número:"+num+"  Sucessor:"+sucessor);
        entrada.close();
    }
}
