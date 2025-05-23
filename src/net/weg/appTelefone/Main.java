package net.weg.appTelefone;

import java.util.Scanner;
import net.weg.model.*;
import net.weg.view.*;
import net.weg.service.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ViewTelefone interacao = new ViewTelefone();
        ServiceTelefone service = new ServiceTelefone();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Telefone");
            System.out.println("2. Pesquisar Telefone");
            System.out.println("3. Editar Telefone");
            System.out.println("4. Excluir Telefone");
            System.out.println("5. Listar Telefones");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    Telefone novoTelefone = interacao.viewInteracao();
                    service.cadastrarTelefone(novoTelefone);
                    break;
                case 2:
                    System.out.print("\nDigite a marca do telefone para pesquisar: ");
                    String marcaPesquisa = input.nextLine();
                    service.pesquisarTelefone(marcaPesquisa);
                    break;
                case 3:
                    System.out.print("\nDigite a marca do telefone para editar: ");
                    String marcaEditar = input.nextLine();
                    service.editarTelefone(marcaEditar, interacao);
                    break;
                case 4:
                    System.out.print("\nDigite a marca do telefone para excluir: ");
                    String marcaExcluir = input.nextLine();
                    service.excluirTelefone(marcaExcluir);
                    break;
                case 5:
                    service.imprimirTelefone();
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