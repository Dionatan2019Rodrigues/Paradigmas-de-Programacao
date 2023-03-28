package repeticao;

public class Exe01 {
    public static void main(String[] args) {
        float j = 1, soma=0;

        for(float i=1;i<51;i++){
            soma += (j/i);
            j += 2;
        }
        System.out.println("Resultado:"+soma);
    }
}
