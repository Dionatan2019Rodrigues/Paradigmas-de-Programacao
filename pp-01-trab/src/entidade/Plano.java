package entidade;

public class Plano {
    private Integer codigo;
    private String nome;
    private Double valMensal;

    // Encapsulamento *******************/
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    /* ******************************** */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    /* ******************************** */
    public Double getVal_mensal() {
        return valMensal;
    }
    public void setVal_mensal(Double valMensal) {
        this.valMensal = valMensal;
    }

}
