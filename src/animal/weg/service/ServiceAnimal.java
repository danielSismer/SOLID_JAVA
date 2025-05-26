package AI.weg.service;

import AI.weg.Animal;
import AI.weg.view.ViewAnimal;
import java.util.ArrayList;

public class ServiceAnimal {

    private ArrayList<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("\nUm novo Animal foi cadastrado!!!\n");
    }

    public void imprimirAnimais() {
        System.out.println("Animais Cadastrados:");
        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("----------------------------");
        }
    }

    public void pesquisarAnimal(String especie) {
        for (Animal animal : animais) {
            if (animal.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(animal);
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public void excluirAnimal(String especie) {
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getEspecie().equalsIgnoreCase(especie)) {
                animais.remove(i);
                System.out.println("Animal excluído.");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public void editarAnimal(String especie, ViewAnimal interacao) {
        for (Animal animal : animais) {
            if (animal.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println("Editando Animal...");
                Animal atualizado = interacao.viewInteracao();
                animal.setEspecie(atualizado.getEspecie());
                animal.setRaca(atualizado.getRaca());
                animal.setIdade(atualizado.getIdade());
                animal.setPeso(atualizado.getPeso());
                System.out.println("Animal atualizado.");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }
}