package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private final String cliente;
    private final List<Produto> produtos = new ArrayList<>();

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - Total: R$" + calcularTotal() + "\nProdutos: " + produtos;
    }
}
