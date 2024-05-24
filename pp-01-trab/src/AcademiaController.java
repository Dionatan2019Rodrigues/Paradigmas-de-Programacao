import DAO.AlunoDAO; // importa a classe AlunoDAO onde estão os métodos do CRUD
import DAO.ExercicioDAO; // importa a classe ExercicioDAO onde estão os métodos do CRUD

import entidade.Aluno; // importa a classe Aluno
import entidade.Exercicio; // importa a classe Exercicio

import java.sql.Date;  //usado para converter tipo string em tipo Date
import java.util.ArrayList; // usado para mostrar a lista do buscarAluno

public class AcademiaController {
    public static void main(String[] args)  throws ClassNotFoundException  {

    // Área de teste CRUD dos alunos
    /*
        Aluno a = new Aluno();
        ArrayList<Aluno> lista = new ArrayList<>();

     
        //INSERT DE ALUNOS NO DATABASE
        a.setCpf("03681398092");
        a.setNome("Rodrigues");
        a.setData_nasc(Date.valueOf("2001-03-01"));

        //Testando inserção no DB 
        //new AlunoDAO().cadastrarAluno(a);
         
        //Testando busca no DB
        String busca = "diego";
        lista = new AlunoDAO().buscaAluno(busca);

        for(int i=0;i<lista.size();i++){
            System.out.println("cpf: "+lista.get(i).getCpf()+", nome: "+lista.get(i).getNome()+", data_nasc: "+lista.get(i).getData_nasc());
        }

        //Testando update no DB
        String novo_nome = "Dioninha"; 
        String teste_cpf = "03681398089";
        new AlunoDAO().updateAluno(novo_nome,teste_cpf);

        //Testando delete no DB 
        String nome_delete = "eduardo";
        new AlunoDAO().deleteAluno(nome_delete);
    */

    // Área de teste CRUD dos exercicios
    /* 
        Exercicio e = new Exercicio();

        // INSERT de exercicios no DB 
        e.setNome("supino-reto");
        e.setMusculos_ativados("ombro-peito-triceps");

        //Testando inserção no DB 
        new ExercicioDAO().cadastrarExercicio(e);
    */

    
    }
}