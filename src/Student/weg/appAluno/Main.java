package org.br.appAluno;

import java.util.Scanner;
import org.br.model.Aluno;
import org.br.view.ViewAluno;
import org.br.service.ServiceAluno;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ViewAluno interacao = new ViewAluno();
        ServiceAluno service = new ServiceAluno();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Pesquisar Aluno");
            System.out.println("3. Editar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("5. Listar Alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    Aluno novoAluno = interacao.viewInteracao();
                    service.cadastrarAluno(novoAluno);
                    break;
                case 2:
                    System.out.print("\nDigite a matrícula do Aluno para pesquisar: ");
                    String matriculaPesquisa = input.nextLine();
                    service.pesquisarAluno(matriculaPesquisa);
                    break;
                case 3:
                    System.out.print("\nDigite a matrícula do Aluno para editar: ");
                    String matriculaEditar = input.nextLine();
                    service.editarAluno(matriculaEditar, interacao);
                    break;
                case 4:
                    System.out.print("\nDigite a matrícula do Aluno para excluir: ");
                    String matriculaExcluir = input.nextLine();
                    service.excluirAluno(matriculaExcluir);
                    break;
                case 5:
                    service.imprimirAlunos();
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        input.close();
    }
}