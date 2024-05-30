package service;
import entidade.PlanoAtivo;

import java.util.ArrayList;

public class GerenciaPlano {
    private ArrayList<PlanoAtivo> lista;

    public GerenciaPlano(){
        this.lista = new ArrayList<>();
    }

    // métodos criados 
    public void adicionarPlano(PlanoAtivo plano) {
        lista.add(plano);
    }

}
