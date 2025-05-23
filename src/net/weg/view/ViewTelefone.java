package net.weg.view;

import java.util.Scanner;

import net.weg.model.Telefone;

public class ViewTelefone {

    private String marca;
    private String modelo;
    private double preco;
    private double memoria;

    Scanner input = new Scanner(System.in);

    public String ViewMarca() {
        return marca;
    }

    public String ViewModelo() {
        return modelo;
    }

    public double ViewPreco() {
        return preco;
    }

    public double ViewMemoria() {
        return memoria;
    }

    public Telefone viewInteracao() {
        System.out.print("\nQual a Marca do Telefone?\nInsira aqui: ");
        marca = input.nextLine();

        System.out.println();

        System.out.print("Qual o Modelo do Telefone?\nInsira aqui: ");
        modelo = input.nextLine();

        System.out.println();

        System.out.print("Qual o Preço do Telefone?\nInsira aqui: ");
        preco = input.nextDouble();

        System.out.println();

        System.out.print("Qual a Memória do Telefone ( GB ) ?\nInsira aqui: ");
        memoria = input.nextDouble();

        return new Telefone(marca, modelo, preco, memoria);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public double getMemoria() {
        return memoria;
    }
}