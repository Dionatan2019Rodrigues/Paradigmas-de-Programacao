package entidade;

import java.time.LocalDate;
import java.util.List;

public class ExercicioTreino extends ExercicioAtivo {
    private boolean concluido;
    private Double cargaAtual;
    private List<CargaData> historicoCargas;

    // getter's e setter's  **********************/
    public boolean isConcluido() {
        return concluido;
    }
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    /*********************************************/
    public Double getCarga() {
        return cargaAtual;
    }
    public void setCarga(double carga) {
        this.cargaAtual = carga;
    }
    /*********************************************/
    public List<CargaData> getHistoricoCargas() {
        return historicoCargas;
    }
    
    // métodos criados
    public void alterarCarga(double novaCarga) {
        this.cargaAtual = novaCarga;
        this.historicoCargas.add(new CargaData(LocalDate.now(), novaCarga));
    }

    public void printEvolucaoCarga() {
        System.out.println("Evolução da carga para " + this.getNome() + ":");
        for (CargaData cargaData : historicoCargas) {
            System.out.println("Data: " + cargaData.getData() + ", Carga: " + cargaData.getCarga());
        }
    }
}