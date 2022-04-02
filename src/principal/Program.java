package principal;

import entities.Aluno;
import helpers.InputHelper;
import repositories.AlunoRepository;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
            System.out.println("(1) Cadastrar aluno");
            System.out.println("(2) Atualizar aluno");
            System.out.println("(3) Excluir aluno");
            System.out.println("(4) Consultar alunos");
            System.out.println("(5) Obter aluno");

            Integer opcao = InputHelper.lerNumeroInteiro("\nEntre com uma opção: ");

            AlunoRepository alunoRepository = null;
            Aluno aluno = null;

            switch (opcao) {

                case 1:

                    System.out.println("\nCadastro de aluno:");

                    aluno = new Aluno();
                    aluno.setNome(InputHelper.lerTexto("Nome do aluno: "));
                    aluno.setCpf(InputHelper.lerTexto("CPF do aluno: "));
                    aluno.setMatricula(InputHelper.lerTexto("Matrícula do aluno: "));

                    alunoRepository = new AlunoRepository();
                    alunoRepository.create(aluno);

                    System.out.println("\nCadastro realizado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nAtualização de aluno:");

                    aluno = new Aluno();
                    aluno.setIdAluno(InputHelper.lerNumeroInteiro("Id do aluno: "));
                    aluno.setCpf(InputHelper.lerTexto("CPF do aluno: "));
                    aluno.setMatricula(InputHelper.lerTexto("Matrícula do aluno: "));

                    alunoRepository = new AlunoRepository();
                    alunoRepository.update(aluno);

                    System.out.println("\nAtualização realizada com sucesso!");

                    break;

                case 3:

                    System.out.println("\nExclusão de aluno:");

                    aluno = new Aluno();
                    aluno.setIdAluno(InputHelper.lerNumeroInteiro("Id do aluno: "));

                    alunoRepository = new AlunoRepository();
                    alunoRepository.delete(aluno);

                    System.out.println("\nExclusão realizada com sucesso!");

                    break;

                case 4:

                    System.out.println("\nConsulta de alunos:");

                    alunoRepository = new AlunoRepository();
                    List<Aluno> lista = alunoRepository.findAll();

                    for(Aluno item : lista) {
                        System.out.println(item.toString());
                    }

                    break;

                case 5:

                    System.out.println("\nObter aluno:");

                    Integer idAluno = InputHelper.lerNumeroInteiro("Id do aluno: ");

                    alunoRepository = new AlunoRepository();
                    aluno = alunoRepository.findById(idAluno);


                    if(aluno != null) {
                        System.out.println(aluno.toString());
                    }
                    else {
                        System.out.println("Nenhum registro foi encontrado.");
                    }

                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;

            }


        }catch (Exception e ){

            System.out.println("Ocorreu um erro: " +e.getMessage());

        }


    }
}
