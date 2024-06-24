package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoGerenciaTreino {
    private String nome;
    private List<TreinoAtivoAluno> treinosAtivos;
    private List<LocalDate> presencas;

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

    public void registrarPresenca(LocalDate data) {
        presencas.add(data);
    }

    public List<LocalDate> getPresencas() {
        return presencas;
    }

    public List<LocalDate> getPresencasEntreDatas(LocalDate inicio, LocalDate fim) {
        List<LocalDate> presencasFiltradas = new ArrayList<>();
        for (LocalDate data : presencas) {
            if ((data.isEqual(inicio) || data.isAfter(inicio)) && (data.isEqual(fim) || data.isBefore(fim))) {
                presencasFiltradas.add(data);
            }
        }
        return presencasFiltradas;
    }

    public void iniciarTreino(String nomeTreino) {
        TreinoAtivoAluno treinoAtivo = new TreinoAtivoAluno(nomeTreino);
        treinosAtivos.add(treinoAtivo);
    }

    public void encerrarTreino(TreinoAtivoAluno treinoAtivo) {
        treinosAtivos.remove(treinoAtivo);
    }

}
