package entidade;

import java.sql.Date; // usado no tipo Date do atributo dataInicio

public class PlanoAtivo {
    private String cpfAluno;
    private Integer opcaoPlano;
    private Date dataInicio;
    private String dadosCartao;

    // Encapsulamento *******************/
    public String getAluno() {
        return cpfAluno;
    }
    public void setAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }
    /* ******************************** */
    public Integer getOpcao_plano() {
        return opcaoPlano;
    }
    public void setOpcao_plano(Integer opcaoPlano) {
        this.opcaoPlano = opcaoPlano;
    }
    /* ******************************** */
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
