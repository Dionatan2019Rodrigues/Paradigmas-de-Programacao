package service;

import java.util.ArrayList;
import java.util.List;

public class AlunoGerenciaTreino {
    private String nome;
    private List<TreinoAtivoAluno> treinosAtivos;

    public AlunoGerenciaTreino(String nome) {
        this.nome = nome;
        this.treinosAtivos = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public List<TreinoAtivoAluno> getTreinosAtivos() {
        return treinosAtivos;
    }

    public void iniciarTreino(String nomeTreino) {
        TreinoAtivoAluno treinoAtivo = new TreinoAtivoAluno(nomeTreino);
        treinosAtivos.add(treinoAtivo);
    }

    public void encerrarTreino(TreinoAtivoAluno treinoAtivo) {
        treinosAtivos.remove(treinoAtivo);
    }

}
