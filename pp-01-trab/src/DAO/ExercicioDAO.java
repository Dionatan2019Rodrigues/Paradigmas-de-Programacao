package DAO; // nome do pacote ou seja a pasta
import conexao.Conexao; // importa a classe de conexao
import entidade.Exercicio; //importa a classe Exercicio

import java.sql.PreparedStatement; // usado para conectar com DB
import java.sql.SQLException; // usado nos cath(exceções)

public class ExercicioDAO {
    PreparedStatement ps = null;

    public void cadastrarExercicio(Exercicio exercicio){
        String sql = "INSERT INTO exercicios (nome,musculos_ativados) VALUES (?,?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, exercicio.getNome());
            ps.setString(2, exercicio.getMusculos_ativados());

            ps.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro no insert de exercicios"+e.getMessage());
            e.printStackTrace();
        }
    }
}
