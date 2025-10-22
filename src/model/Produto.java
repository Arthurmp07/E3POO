package model;

import java.io.Serializable;

public class Produto implements Serializable {
    private final String nome;
    private final double preco;
    private final Categoria categoria;

    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    public double getPreco() { return preco; }


    @Override
    public String toString() {
        return nome + " - " + this.categoria + " - R$" + preco;
    }
}
