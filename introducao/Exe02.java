import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int media = (n1+n2+n3)/3;
        System.out.println("Números digitados: "+n1+"/"+n2+"/"+n3);
        System.out.println("Média = "+media);
        entrada.close();
    }
}
