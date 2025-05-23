package net.weg.model;

public class Telefone {

    String marca, modelo;
    double preco, memoria;

    public Telefone () {

        this .marca = "";
        this.memoria = 0;
        this.modelo = "";
        this.preco = 0;
    }

    public Telefone (String marca, String modelo, double preco, double memoria) {

        this.marca = marca;
        this.memoria = memoria;
        this.modelo = modelo;
        this.preco = preco;

    }

    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }



    public double getMemoria() {
        return memoria;
    }



    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String toString () {

        return "Marca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nPreço : " + this.preco
                + "\nMemória : " + this.memoria;
    }




}
