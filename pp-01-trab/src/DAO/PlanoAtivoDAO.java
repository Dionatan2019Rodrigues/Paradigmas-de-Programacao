package DAO;
import conexao.Conexao;  // importa a classe Conexao
import entidade.PlanoAtivo; // importa a classe PlanoAtivo

import java.sql.PreparedStatement; // usado para conectar com DB
import java.sql.SQLException; // usado nos cath(exceções)


public class PlanoAtivoDAO {
    PreparedStatement ps = null;
    
    public void cadastrarPlanoAtivo(PlanoAtivo planoAtivo){
        String sql = "INSERT INTO planosAtivos (id_aluno,id_plano,data_inicio,dados_cartao) VALUES (?,?,?,?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            //ps.setString(1, planoAtivo.getAluno());
            //ps.setInt(2, planoAtivo.getOpcao_plano());
            ps.setDate(3, planoAtivo.getData_inicio());
            ps.setString(4, planoAtivo.getDados_cartão());
            
            ps.execute();

        } catch (SQLException e) {
            System.out.println("Erro no insert de planos Ativos"+e.getMessage());
            e.printStackTrace();
        }
    }

}
