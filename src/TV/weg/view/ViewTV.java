package br.java.view;

import java.util.Scanner;
import br.java.model.TV;

public class ViewTV {

    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    Scanner input = new Scanner(System.in);

    public TV viewInteracao() {
        System.out.print("\nQual a Marca da TV?\nInsira aqui: ");
        marca = input.nextLine();

        System.out.print("\nQual o Tamanho da TV (em polegadas)?\nInsira aqui: ");
        tamanho = input.nextDouble();
        input.nextLine(); // Consumir quebra de linha

        System.out.print("\nQual a Resolução da TV?\nInsira aqui: ");
        resolucao = input.nextLine();

        System.out.print("\nQual o Preço da TV?\nInsira aqui: ");
        preco = input.nextDouble();

        return new TV(marca, tamanho, resolucao, preco);
    }
}