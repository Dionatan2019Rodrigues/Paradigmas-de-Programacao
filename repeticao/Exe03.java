package repeticao;
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cont_impar=0, media=0, cont_par=0, soma=0, num;

        System.out.println("Digite 10 números:");
        for(int i=1;i<11;i++){
            System.out.print(i+"º numero:");
            num = entrada.nextFloat();

            if(num%2==0){
                cont_par++;
                soma += num;
            }
            else {
                cont_impar++;
                media += num;
            }   
                
        }
        media /= cont_impar;
        System.out.println("Soma dos pares:"+soma);
        System.out.println("Media dos impares:"+media);
            
        entrada.close();
    }
}

