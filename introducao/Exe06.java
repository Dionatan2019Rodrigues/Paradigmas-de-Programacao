import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 4 números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int med = ((n1*1)+(n2*2)+(n3*3)+(n4*4))/10;
        System.out.println("Média ponderada:"+med);
        entrada.close();
    }
}
