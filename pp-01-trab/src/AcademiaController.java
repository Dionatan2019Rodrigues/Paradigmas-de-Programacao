import DAO.AlunoDAO; // importa a classe AlunoDAO onde estão os métodos do CRUD
import DAO.ExercicioDAO; // importa a classe ExercicioDAO onde estão os métodos do CRUD
import DAO.PlanoDAO;  // importa a classe PlanoDAO onde estão os métodos do CRUD
//import DAO.PlanoAtivoDAO;  // importa a classe PlanoAtivoDAO onde estão os métodos do CRUD

//import service.Treino; // importa a classe OpcaoTreino 

import entidade.Aluno; // importa a classe Aluno
import entidade.Exercicio; // importa a classe Exercicio
import entidade.Plano;  // importa a classe Plano
import entidade.PlanoAtivo;  // importa a classe Plano

import java.sql.Date;  //usado para converter tipo string em tipo Date
import java.util.ArrayList; // usado para mostrar a lista do buscarAluno

public class AcademiaController {
    public static void main(String[] args)  {

    // Área de teste CRUD dos alunos
    /* 
        Aluno a = new Aluno();
        ArrayList<Aluno> listaBusca = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        //INSERT DE ALUNOS NO DATABASE
        a.setCpf("03681398092");
        a.setNome("Rodrigues");
        a.setData_nasc(Date.valueOf("2001-03-01"));

        //Testando inserção no DB 
        //new AlunoDAO().cadastrarAluno(a);
         
        //Testando busca por nome OR cpf no DB
        String dadoBuscado = "03681398089"; // pode ser um nome OR cpf a ser buscado
        String atributoBuscado = "cpf";     // pode ser um nome OR cpf a ser buscado
        listaBusca = new AlunoDAO().buscaAluno(atributoBuscado,dadoBuscado); // busca por nome OR cpf

        for(int i=0;i<listaBusca.size();i++){
            System.out.println("cpf: "+listaBusca.get(i).getCpf()+", nome: "+listaBusca.get(i).getNome()+", data_nasc: "+listaBusca.get(i).getData_nasc());
        }

        //Testando a listagem dos alunos do DB 
        listaAlunos = new AlunoDAO().listarAlunos(); 

        for(int i=0;i<listaAlunos.size();i++){
            System.out.println("cpf: "+listaAlunos.get(i).getCpf()+", nome: "+listaAlunos.get(i).getNome()+", data_nasc: "+listaAlunos.get(i).getData_nasc());
        }

        //Testando update no DB
        String novoNome = "Dioninha"; 
        String testeCpf = "03681398089";
        new AlunoDAO().updateAluno(novoNome,testeCpf);

        //Testando delete no DB 
        String nomeDelete = "eduardo";
        new AlunoDAO().deleteAluno(nomeDelete);
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

    // Área de teste CRUD dos planos 
    /* 
        Plano p = new Plano();

        // INSERT de exercicios no DB 
        p.setNome("premium-pro");
        p.setVal_mensal(99.90);

        //Testando inserção no DB 
        new PlanoDAO().cadastrarPlano(p);
    */

    // Área de teste de insert de planos por parte do Instrutor 
    /*     
        PlanoAtivo pa = new PlanoAtivo();
        String cpfAluno = "03681398089";
        Integer codigoPlano = 2;

        // INSERT de Planos Ativos no DB
        pa.setAluno(cpfAluno);
        pa.setOpcao_plano(codigoPlano);
        pa.setData_inicio(Date.valueOf("2024-05-23"));
        pa.setDados_cartão("numero-bandeira-codigo");

        //Testando insert no DB 
        new PlanoAtivoDAO().cadastrarPlanoAtivo(pa);
    */

    // Área de teste de insert de opcoes de treino
            

    }
}