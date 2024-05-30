package entidade;

public class ExercicioTreino extends ExercicioAtivo {
    private boolean concluido;
    private Double cargaAtual;

    // getter's e setter's 
    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public Double getCarga() {
        return cargaAtual;
    }

    public void setCarga(double carga) {
        this.cargaAtual = carga;
    }
}