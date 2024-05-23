package DAO; // nome do pacote ou seja a pasta
import conexao.Conexao; // importa a classe de conexao
import entidade.Aluno; //importa a classe Aluno 

import java.sql.PreparedStatement; // usado para conectar com DB
import java.sql.ResultSet;  // usado em buscarAluno
import java.sql.SQLException; // usado nos cath(exceções)
import java.util.ArrayList; // usado para montar a lista do buscarAluno

public class AlunoDAO {

    PreparedStatement ps = null;
    ResultSet rs;
    ArrayList<Aluno> lista = new ArrayList<>(); 

    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (cpf, nome, data_nascimento) VALUES (?, ?, ?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getData_nasc());

            ps.execute();

        } catch (SQLException e) {
            System.out.println("Erro de inserção no DB: "+ e.getMessage());
        }
    }

    public ArrayList<Aluno> buscaAluno(String busca){
        String sql = " SELECT * FROM alunos WHERE nome = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, busca);
            rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCpf(rs.getString("cpf")); 
                aluno.setNome(rs.getString("nome"));
                aluno.setData_nasc(rs.getString("data_nascimento"));

                lista.add(aluno);

            }

        } catch (SQLException e) {
            System.out.println("Erro de busca do DB: "+ e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    public void updateAluno(String nome , String cpf){
        String sql = "UPDATE alunos SET nome = ? WHERE cpf = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, cpf);

            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro de update no DB: "+ e.getMessage());
        }
    }

    public void deleteAluno(String nome){
        String sql = "DELETE FROM alunos WHERE nome = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);

            ps.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro ao tentar deletar no DB: "+ e.getMessage());
        }

    }


}
