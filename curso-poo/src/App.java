import aula02.AgendamentoRU;
import aula02.FerroPassar;

public class App {
    public static void main(String[] args) throws Exception {
        //AULA 02
        FerroPassar f1 = new FerroPassar();
        f1.ligado = false;
        f1.cor = "vermelho";
        f1.tamanho = "grande";
        f1.temperatura = 0d;
        f1.tipo_tecido = "algodão";
        f1.ligar_tomada();
        f1.desligar_tomada();
        f1.esquentar(30d);

        AgendamentoRU a1 = new AgendamentoRU();
        a1.dia = 8;
        a1.refeicao = "almoço";
        a1.restaurante = "RU I";
        a1.agendado = true;
        a1.cancelar_agendamento();
    }
}
