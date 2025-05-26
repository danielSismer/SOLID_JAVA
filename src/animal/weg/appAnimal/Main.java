package AI.weg.appAnimal;

import java.util.Scanner;
import AI.weg.Animal;
import AI.weg.view.ViewAnimal;
import AI.weg.service.ServiceAnimal;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ViewAnimal interacao = new ViewAnimal();
        ServiceAnimal service = new ServiceAnimal();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Pesquisar Animal");
            System.out.println("3. Editar Animal");
            System.out.println("4. Excluir Animal");
            System.out.println("5. Listar Animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    Animal novoAnimal = interacao.viewInteracao();
                    service.cadastrarAnimal(novoAnimal);
                    break;
                case 2:
                    System.out.print("\nDigite a espécie do Animal para pesquisar: ");
                    String especiePesquisa = input.nextLine();
                    service.pesquisarAnimal(especiePesquisa);
                    break;
                case 3:
                    System.out.print("\nDigite a espécie do Animal para editar: ");
                    String especieEditar = input.nextLine();
                    service.editarAnimal(especieEditar, interacao);
                    break;
                case 4:
                    System.out.print("\nDigite a espécie do Animal para excluir: ");
                    String especieExcluir = input.nextLine();
                    service.excluirAnimal(especieExcluir);
                    break;
                case 5:
                    service.imprimirAnimais();
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