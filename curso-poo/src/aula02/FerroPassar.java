package aula02;

public class FerroPassar {
    public String cor;
    public String tamanho;
    public Double temperatura;
    public String tipo_tecido;
    public Boolean ligado;

    public void status(){
        System.out.println("O estado de ligado   é: " + this.ligado);
        System.out.println("A cor é: " + this.cor);
        System.out.println("regulado para o tecido: " + this.tipo_tecido);
        System.out.println("Tem tamanho: " + this.tamanho);
        System.out.println("Com a temperatura: " + this.temperatura);
    }

    public void alterar_tipo_tecido(String tecido){
        this.tipo_tecido = tecido;
    }

    public void esquentar(Double temperatura){
        if(this.ligado)
            this.temperatura = temperatura;
        else 
            System.out.println("Não está ligado na tomada");
    }

    public void ligar_tomada(){
        this.ligado = true;
    }
    public void desligar_tomada(){
        this.ligado = false;
    }
}
