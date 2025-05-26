package org.br.service;

import org.br.model.Aluno;
import org.br.view.ViewAluno;
import java.util.ArrayList;

public class ServiceAluno {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("\nUm novo Aluno foi cadastrado!!!\n");
    }

    public void imprimirAlunos() {
        System.out.println("Alunos Cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("----------------------------");
        }
    }

    public void pesquisarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println(aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void excluirAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                alunos.remove(i);
                System.out.println("Aluno excluído.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void editarAluno(String matricula, ViewAluno interacao) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Editando Aluno...");
                Aluno atualizado = interacao.viewInteracao();
                aluno.setNome(atualizado.getNome());
                aluno.setIdade(atualizado.getIdade());
                aluno.setMatricula(atualizado.getMatricula());
                aluno.setAnoIngresso(atualizado.getAnoIngresso());
                System.out.println("Aluno atualizado.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }
}