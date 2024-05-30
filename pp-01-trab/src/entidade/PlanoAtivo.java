package entidade;

import java.sql.Date; // usado no tipo Date do atributo dataInicio

public class PlanoAtivo extends Plano {
    private Date dataInicio;
    private String dadosCartao;

    // construtor 
    public PlanoAtivo(Date dataInicio, String dadosCartao){
        this.dataInicio = dataInicio;
        this.dadosCartao = dadosCartao;
    }

    // Encapsulamento *******************/
    public Date getData_inicio() {
        return dataInicio;
    }
    public void setData_inicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    /* ******************************** */
    public String getDados_cartão() {
        return dadosCartao;
    }
    public void setDados_cartão(String dadosCartao) {
        this.dadosCartao = dadosCartao;
    }

}
