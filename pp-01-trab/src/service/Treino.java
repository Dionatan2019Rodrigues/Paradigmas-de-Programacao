package service; // // nome do pacote ou seja a pasta
import entidade.ExercicioAtivo; // importa entidade ExercicioAtivo

import java.util.ArrayList; // importa classe ArrayList
import java.util.List;

public class Treino {
    private String nome;
    private ArrayList<ExercicioAtivo> lista;

    //constructor
    public Treino(String nome) {
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
    public void adicionarExercicio(ExercicioAtivo exercicio) {
        lista.add(exercicio);
    }

    public void removerExercicio(String nomeExercicio) {
        lista.removeIf(e -> e.getNome().equalsIgnoreCase(nomeExercicio));
    }

    public void listarExercicios() {
        lista.forEach(System.out::println);
    }

    public List<ExercicioAtivo> getExercicios() {
        return lista;
    }

}
