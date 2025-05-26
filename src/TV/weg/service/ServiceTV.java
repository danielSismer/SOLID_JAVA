package br.java.service;

import br.java.model.TV;
import br.java.view.ViewTV;
import java.util.ArrayList;

public class ServiceTV {

    private ArrayList<TV> tvs = new ArrayList<>();

    public void cadastrarTV(TV tv) {
        tvs.add(tv);
        System.out.println("\nUma nova TV foi cadastrada!!!\n");
    }

    public void imprimirTVs() {
        System.out.println("TVs Disponíveis:");
        for (TV tv : tvs) {
            System.out.println(tv);
            System.out.println("----------------------------");
        }
    }

    public void pesquisarTV(String marca) {
        for (TV tv : tvs) {
            if (tv.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(tv);
                return;
            }
        }
        System.out.println("TV não encontrada.");
    }

    public void excluirTV(String marca) {
        for (int i = 0; i < tvs.size(); i++) {
            if (tvs.get(i).getMarca().equalsIgnoreCase(marca)) {
                tvs.remove(i);
                System.out.println("TV excluída.");
                return;
            }
        }
        System.out.println("TV não encontrada.");
    }

    public void editarTV(String marca, ViewTV interacao) {
        for (TV tv : tvs) {
            if (tv.getMarca().equalsIgnoreCase(marca)) {
                System.out.println("Editando TV...");
                TV atualizada = interacao.viewInteracao();
                tv.setMarca(atualizada.getMarca());
                tv.setTamanho(atualizada.getTamanho());
                tv.setResolucao(atualizada.getResolucao());
                tv.setPreco(atualizada.getPreco());
                System.out.println("TV atualizada.");
                return;
            }
        }
        System.out.println("TV não encontrada.");
    }
}