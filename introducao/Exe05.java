import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Float n = entrada.nextFloat();
        Float terca = (n/3);
        System.out.println("Sua terça parte é:"+terca);
        entrada.close();
    }
}
