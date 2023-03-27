package selecao;
import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números");
        Double n1 = entrada.nextDouble();
        Integer n2 = entrada.nextInt();
        Integer n3 = entrada.nextInt();

        if(n1 >= 0){
            Double raiz = Math.sqrt(n1);
            System.out.println("A raiz de "+n1+"é:"+raiz);
        }else{
            Double pot = Math.pow(n1, 2);
            System.out.println("O quadrado de "+n1+"é:"+pot);
        }

        if((n2>10)&&(n2<100))
            System.out.println("Número está entre 10 e 100  intervalo permitido");

        if(n3<n2){
            Integer diferenca = n2 - n3;
            System.out.println("Diferença:"+diferenca);
        }else{
            n3 += 1;
            System.out.println("Incrementado:"+n3);
        }
            
        entrada.close();
    }
}
