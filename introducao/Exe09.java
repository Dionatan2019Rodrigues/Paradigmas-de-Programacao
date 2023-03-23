import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        Float raio = entrada.nextFloat();
        Float pi = Float.valueOf(3.1415f);

        Float area = pi * raio * raio;
        Float perimetro = 2 * pi * raio;
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Área: "+area);
        
        entrada.close();
    }
}
