import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        Integer base = entrada.nextInt();
        System.out.println("Digite a altura do retângulo: ");
        Integer altura = entrada.nextInt();

        Integer perimetro = (2 * base) + (2 * altura);
        Integer area = base * altura;
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Área: "+area);
        entrada.close();
    }
}
