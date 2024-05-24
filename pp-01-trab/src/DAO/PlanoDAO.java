package DAO; // nome do pacote ou seja a pasta
import conexao.Conexao; // importa a classe de conexao
import entidade.Plano; //importa a classe Plano

import java.sql.PreparedStatement; // usado para conectar com DB
import java.sql.SQLException; // usado nos cath(exceções)

public class PlanoDAO {
    PreparedStatement ps = null;

    public void cadastrarPlano(Plano plano){
        String sql = "INSERT INTO planos (nome,val_mensal) VALUES (?,?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, plano.getNome());
            ps.setDouble(2, plano.getVal_mensal());

            ps.execute();
            
        } catch (SQLException e) {
            System.out.println("Erro no insert de planos"+e.getMessage());
            e.printStackTrace();
        }
    }
    
}
