package service;
import entidade.ExercicioTreino;

import java.util.ArrayList;

public class TreinoAtivoAluno {
    private String nome;
    private ArrayList<ExercicioTreino> lista;

    //constructor
    public TreinoAtivoAluno(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    // getter's e setter's
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // métodos criados 
    public void marcarExercicioConcluido(String nomeExercicio) {
        for (ExercicioTreino et : lista) {
            if (et.getNome().equalsIgnoreCase(nomeExercicio)) {
                et.setConcluido(true);
            }
        }
    }

    public void alterarCargaExercicio(String nomeExercicio, double novaCarga) {
        for (ExercicioTreino et : lista) {
            if (et.getNome().equalsIgnoreCase(nomeExercicio)) {
                et.setCarga(novaCarga);
            }
        }
    }

}
