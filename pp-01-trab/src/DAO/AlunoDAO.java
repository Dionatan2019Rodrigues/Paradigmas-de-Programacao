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
            ps.setDate(3, aluno.getData_nasc());

            ps.execute();

        } catch (SQLException e) {
            System.out.println("Erro de inserção de aluno no DB: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<Aluno> buscaAluno(String atributo, String dadoBuscado){
        // Definição se o dado será buscado por cpf OR nome (por padrão será cpf)
        String sql = " SELECT * FROM alunos WHERE cpf = ?";
        if(atributo == "nome"){
            sql = " SELECT * FROM alunos WHERE nome = ?";
        }

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, dadoBuscado);
            rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCpf(rs.getString("cpf")); 
                aluno.setNome(rs.getString("nome"));
                aluno.setData_nasc(rs.getDate("data_nascimento"));

                lista.add(aluno);

            }

        } catch (SQLException e) {
            System.out.println("Erro de busca do aluno no DB: "+ e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Aluno> listarAlunos(){
        String sql = " SELECT * FROM alunos";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCpf(rs.getString("cpf")); 
                aluno.setNome(rs.getString("nome"));
                aluno.setData_nasc(rs.getDate("data_nascimento"));

                lista.add(aluno);

            }

        } catch (SQLException e) {
            System.out.println("Erro de listagem dos alunos no DB: "+ e.getMessage());
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
            System.out.println("Erro de update do aluno no DB: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    public void deleteAluno(String nome){
        String sql = "DELETE FROM alunos WHERE nome = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);

            ps.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro ao tentar deletar um aluno no DB: "+ e.getMessage());
            e.printStackTrace();
        }

    }

}
