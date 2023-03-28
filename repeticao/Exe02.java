package repeticao;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float flag =1,n ,soma=0,cont=0;
        float media =0;
        
        while(flag==1){
            System.out.println("Digite o valor:");
            n = entrada.nextFloat();
            if(n<1){
                flag =0;
            }
            else{
                soma += n;
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("Média:"+media);
            
        entrada.close();
    }
}

