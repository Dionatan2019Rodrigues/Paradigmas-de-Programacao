package entidade;

public class ExercicioAtivo extends Exercicio {
    private Integer numeroSeries;
    private Integer minRepeticoes;
    private Integer maxRepeticoes;
    private Double carga;
    private Integer tempoDescanso;

    //*    Encapsulamento ******************/
    public Integer getNumeroSeries() {
        return numeroSeries;
    }
    public void setNumeroSeries(Integer numeroSeries) {
        this.numeroSeries = numeroSeries;
    }
    /***************************************/
    public Integer getMinRepeticoes() {
        return minRepeticoes;
    }
    public void setMinRepeticoes(Integer minRepeticoes) {
        this.minRepeticoes = minRepeticoes;
    }
    /***************************************/
    public Integer getMaxRepeticoes() {
        return maxRepeticoes;
    }
    public void setMaxRepeticoes(Integer maxRepeticoes) {
        this.maxRepeticoes = maxRepeticoes;
    }
    /***************************************/
    public Double getCarga() {
        return carga;
    }
    public void setCarga(Double carga) {
        this.carga = carga;
    }
    /***************************************/
    public Integer getTempoDescanso() {
        return tempoDescanso;
    }
    public void setTempoDescanso(Integer tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

}
