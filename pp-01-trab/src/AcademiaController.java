import DAO.AlunoDAO; // importa a classe AlunoDAO onde estão os métodos do CRUD
import DAO.ExercicioDAO; // importa a classe ExercicioDAO onde estão os métodos do CRUD
import DAO.PlanoDAO;  // importa a classe PlanoDAO onde estão os métodos do CRUD

import entidade.Aluno; // importa a classe Aluno
import entidade.Exercicio; // importa a classe Exercicio
import entidade.ExercicioTreino; 
import entidade.Plano;  // importa a classe Plano
import entidade.PlanoAtivo; // importa a classe Plano Ativo
import service.AlunoGerenciaTreino;
import service.GerenciaPlano; // importa a classe GerenciaPlano
import service.GerenciaTreino;
import service.Treino;
import service.TreinoAtivoAluno;

import java.sql.Date;  //usado para converter tipo string em tipo Date
import java.time.LocalDate; 
import java.util.ArrayList; // usado para mostrar a lista do buscarAluno
import java.util.Scanner; // usado para obter os input's do usuário 

public class AcademiaController {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Alterar Aluno");
            System.out.println("3. Excluir Aluno");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Buscar Aluno por CPF");
            System.out.println("6. Cadastrar Plano Fixo");
            System.out.println("7. Cadastrar Exercicio");
            System.out.println("8. Cadastrar Plano Ativo");
            System.out.println("9. Cadastrar Opções de Treino");
            System.out.println("10. Aluno inicia treino,altera carga, encerra treino");
            System.out.println("11. Datas comparecidas e Histórico de carga");
            System.out.println("12. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            try {
                switch (opcao) {
                    case 1:
                        Aluno a = new Aluno();
            
                        //INSERT DE ALUNOS NO DATABASE
                        a.setCpf("03681398092");
                        a.setNome("Rodrigues");
                        a.setData_nasc(Date.valueOf("2001-03-01"));
            
                        //Testando inserção no DB 
                        //new AlunoDAO().cadastrarAluno(a);
                        break;
                    case 2:
                        //Testando update no DB
                        String novoNome = "Diona02"; 
                        String testeCpf = "03681398089";
                        new AlunoDAO().updateAluno(novoNome,testeCpf);
                        break;
                    case 3:
                        //Testando delete no DB 
                        String nomeDelete = "eduardo";
                        new AlunoDAO().deleteAluno(nomeDelete);
                        break;
                    case 4:
                        ArrayList<Aluno> listaAlunos = new ArrayList<>();
                        //Testando a listagem dos alunos do DB 
                        listaAlunos = new AlunoDAO().listarAlunos(); 

                        for(int i=0;i<listaAlunos.size();i++){
                            System.out.println("cpf: "+listaAlunos.get(i).getCpf()+
                                                ", nome: "+listaAlunos.get(i).getNome()+
                                                ", data_nasc: "+listaAlunos.get(i).getData_nasc());
                        }
                        break;
                    case 5:
                        ArrayList<Aluno> listaBusca = new ArrayList<>();
                        //Testando busca por nome OR cpf no DB
                        String dadoBuscado = "03681398089"; // pode ser um nome OR cpf a ser buscado
                        String atributoBuscado = "cpf";     // pode ser um nome OR cpf a ser buscado
                        // busca por nome OR cpf
                        listaBusca = new AlunoDAO().buscaAluno(atributoBuscado,dadoBuscado); 

                        for(int i=0;i<listaBusca.size();i++){
                            System.out.println("cpf: "+listaBusca.get(i).getCpf()+
                                                ", nome: "+listaBusca.get(i).getNome()+
                                                ", data_nasc: "+listaBusca.get(i).getData_nasc());
                        }
                        break;
                    case 6:
                        Plano p = new Plano();

                        // INSERT de planos no DB 
                        p.setNome("premium-pro");
                        p.setVal_mensal(99.90);
            
                        //Testando inserção no DB 
                        new PlanoDAO().cadastrarPlano(p);
                        break;
                    case 7:
                        Exercicio e = new Exercicio();

                        // INSERT de exercicios no DB 
                        e.setNome("supino-reto");
                        e.setMusculos_ativados("ombro-peito-triceps");

                        //Testando inserção no DB 
                        new ExercicioDAO().cadastrarExercicio(e);
                        break;
                    case 8:
                        GerenciaPlano g = new GerenciaPlano();
                        PlanoAtivo pa = new PlanoAtivo(Date.valueOf("2024-03-18"), "senha-codigo");
                        g.adicionarPlano(pa);
                        break;
                    case 9:
                        GerenciaTreino gt = new GerenciaTreino();
                        Treino t = new Treino("treino-peito");
                        gt.adicionarTreino(t);
                        gt.listarTreinos();
                        gt.buscarTreino("treino-peito");
                        break;
                    case 10:
                        AlunoGerenciaTreino agt = new AlunoGerenciaTreino("Dionatan");
                        agt.iniciarTreino("treino-perna");
                        agt.getTreinosAtivos();
                        TreinoAtivoAluno treinoAtivo = new TreinoAtivoAluno("treino-perna");
                        treinoAtivo.alterarCargaExercicio("leg-press", 50.00);
                        agt.encerrarTreino(treinoAtivo);
                        break;
                    case 11:
                        AlunoGerenciaTreino agtr = new AlunoGerenciaTreino("Eduardo");
                        agtr.getPresencasEntreDatas(LocalDate.parse("2024-01-01"),LocalDate.now());
                        ExercicioTreino etr = new ExercicioTreino();
                        etr.getHistoricoCargas();
                        break;
                    case 12:
                        running = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }

}