package AI.weg.view;

import java.util.Scanner;
import AI.weg.Animal;

public class ViewAnimal {

    private String especie;
    private String raca;
    private int idade;
    private double peso;

    Scanner input = new Scanner(System.in);

    public Animal viewInteracao() {
        System.out.print("\nQual a Espécie do Animal?\nInsira aqui: ");
        especie = input.nextLine();

        System.out.print("\nQual a Raça do Animal?\nInsira aqui: ");
        raca = input.nextLine();

        System.out.print("\nQual a Idade do Animal?\nInsira aqui: ");
        idade = input.nextInt();

        System.out.print("\nQual o Peso do Animal?\nInsira aqui: ");
        peso = input.nextDouble();

        return new Animal(especie, raca, idade, peso);
    }
}