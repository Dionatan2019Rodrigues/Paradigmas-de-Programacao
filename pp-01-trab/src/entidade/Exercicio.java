package entidade;

public class Exercicio {
    private Integer numero;
    private String nome;
    private String musculos_ativados;

    //*    Encapsulamento ******************/
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    /***************************************/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    /***************************************/
    public String getMusculos_ativados() {
        return musculos_ativados;
    }
    public void setMusculos_ativados(String musculos_ativados) {
        this.musculos_ativados = musculos_ativados;
    }
}
