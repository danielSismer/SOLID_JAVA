package net.weg.service;

import net.weg.model.*;
import java.util.ArrayList;
import net.weg.view.ViewTelefone;

public class ServiceTelefone {

    private ArrayList<Telefone> telefones = new ArrayList<>();

    public void cadastrarTelefone(Telefone telefone) {
        telefones.add(telefone);
        System.out.println("\nUm novo telefone foi cadastrado!!!\n");
    }

    public void imprimirTelefone() {
        System.out.println("Telefones Disponíveis:");
        for (Telefone a : telefones) {
            System.out.println(a);
            System.out.println("----------------------------");
        }
    }
    public void pesquisarTelefone(String marca) {
        for (Telefone telefone : telefones) {
            if (telefone.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(telefone);
                return;
            }
        }
        System.out.println("Telefone não encontrado.");
    }

    public void excluirTelefone(String marca) {
        for (int cont = 0; cont < telefones.size(); cont++) {
            if (telefones.get(cont).getMarca().equalsIgnoreCase(marca)) {
                telefones.remove(cont);

            }
        }
        System.out.println("Telefone excluído, se existia.");
    }

    public void editarTelefone(String marca, ViewTelefone interacao) {
        for (Telefone telefone : telefones) {
            if (telefone.getMarca().equalsIgnoreCase(marca)) {
                System.out.println("Editando telefone...");
                Telefone atualizado = interacao.viewInteracao();
                telefone.setMarca(atualizado.getMarca());
                telefone.setModelo(atualizado.getModelo());
                telefone.setPreco(atualizado.getPreco());
                telefone.setMemoria(atualizado.getMemoria());
                System.out.println("Telefone atualizado.");
                return;
            }
        }
        System.out.println("Telefone não encontrado.");
    }



}