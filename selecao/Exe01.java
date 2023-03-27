package selecao;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer n1 = entrada.nextInt();
        System.out.println("Digite outro número");
        Integer n2 = entrada.nextInt();
        if(n1>n2){
            Integer diferenca = n1 - n2;
            System.out.println(n1+" - "+n2+" = "+diferenca);
        }else{
            Integer diferenca = n2 - n1;
            System.out.println(n2+" - "+n1+" = "+diferenca);
        }
            
        entrada.close();
    }
}
