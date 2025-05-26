package org.br.view;

import java.util.Scanner;
import org.br.model.Aluno;

public class ViewAluno {

    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;

    Scanner input = new Scanner(System.in);

    public Aluno viewInteracao() {
        System.out.print("\nQual o Nome do Aluno?\nInsira aqui: ");
        nome = input.nextLine();

        System.out.print("\nQual a Idade do Aluno?\nInsira aqui: ");
        idade = input.nextInt();
        input.nextLine(); // Consumir quebra de linha

        System.out.print("\nQual a Matrícula do Aluno?\nInsira aqui: ");
        matricula = input.nextLine();

        System.out.print("\nQual o Ano de Ingresso do Aluno?\nInsira aqui: ");
        anoIngresso = input.nextInt();

        return new Aluno(nome, idade, matricula, anoIngresso);
    }
}