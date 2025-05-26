package org.br.model;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;

    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.anoIngresso = 0;
    }

    public Aluno(String nome, int idade, String matricula, int anoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nMatrícula: " + matricula +
                "\nAno de Ingresso: " + anoIngresso;
    }
}