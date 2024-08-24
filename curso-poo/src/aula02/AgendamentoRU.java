package aula02;

public class AgendamentoRU {
    public Integer dia;
    public String refeicao;
    public String restaurante;
    public Boolean agendado;

    public void escolher_dia(Integer data){
        this.dia = data;
    }

    public void escolher_refeicao(String refeicao){
        this.refeicao = refeicao;
    }

    public void escolher_restaurante(String restaurante){
        this.restaurante = restaurante;
    }

    public void cancelar_agendamento(){
        this.agendado = false;
        System.out.println("Agendamento cancelado");
    }
}
