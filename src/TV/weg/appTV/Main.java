package br.java.appTV;

import java.util.Scanner;
import br.java.model.TV;
import br.java.view.ViewTV;
import br.java.service.ServiceTV;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ViewTV interacao = new ViewTV();
        ServiceTV service = new ServiceTV();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar TV");
            System.out.println("2. Pesquisar TV");
            System.out.println("3. Editar TV");
            System.out.println("4. Excluir TV");
            System.out.println("5. Listar TVs");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    TV novaTV = interacao.viewInteracao();
                    service.cadastrarTV(novaTV);
                    break;
                case 2:
                    System.out.print("\nDigite a marca da TV para pesquisar: ");
                    String marcaPesquisa = input.nextLine();
                    service.pesquisarTV(marcaPesquisa);
                    break;
                case 3:
                    System.out.print("\nDigite a marca da TV para editar: ");
                    String marcaEditar = input.nextLine();
                    service.editarTV(marcaEditar, interacao);
                    break;
                case 4:
                    System.out.print("\nDigite a marca da TV para excluir: ");
                    String marcaExcluir = input.nextLine();
                    service.excluirTV(marcaExcluir);
                    break;
                case 5:
                    service.imprimirTVs();
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