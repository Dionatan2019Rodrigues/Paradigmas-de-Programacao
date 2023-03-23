import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um saldo de aplicação:");
        Float n = entrada.nextFloat();
        Float res = n * Float.valueOf(1.01f);
        System.out.println("Saldo de aplicação de 1%: "+res);
        entrada.close();
    }   
}
