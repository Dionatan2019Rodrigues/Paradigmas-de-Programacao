package entidade; // nome do pacote ou seja da pasta 

public class Aluno {
    private String cpf;
    private String nome;
    private String data_nasc;

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
    public String getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
}
