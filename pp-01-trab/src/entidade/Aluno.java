package entidade; // nome do pacote ou seja da pasta 

import java.sql.Date; // usado no tipo Date do atributo data_nasc

public class Aluno {
    private String cpf;
    private String nome;
    private Date data_nasc;

    //*    Encapsulamento ******************/
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /***************************************/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    /***************************************/
    public Date getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }
}
