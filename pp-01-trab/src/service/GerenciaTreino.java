package service;

import java.util.ArrayList;
import java.util.List;

public class GerenciaTreino {
    private List<Treino> treinos;

    // construtor
    public GerenciaTreino() {
        this.treinos = new ArrayList<>();
    }
    
    // métodos criados 
    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    public void removerTreino(String nomeTreino) {
        treinos.removeIf(t -> t.getNome().equalsIgnoreCase(nomeTreino));
    }

    public void listarTreinos() {
        treinos.forEach(System.out::println);
    }

    public Treino buscarTreino(String nomeTreino) {
        return treinos.stream()
                .filter(t -> t.getNome().equalsIgnoreCase(nomeTreino))
                .findFirst()
                .orElse(null);
    }

    public void alterarTreino(String nomeTreino, Treino treinoAtualizado) {
        Treino treino = buscarTreino(nomeTreino);
        if (treino != null) {
            int index = treinos.indexOf(treino);
            treinos.set(index, treinoAtualizado);
        }
    }
    
}
