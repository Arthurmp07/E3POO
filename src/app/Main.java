package app;

import model.*;
import service.LojaService;

public class Main {
    public static void main(String[] args) {
        LojaService loja = new LojaService();

        Produto p1 = new Produto("Arroz", 15.5, Categoria.ALIMENTO);
        Produto p2 = new Produto("Camiseta", 40.0, Categoria.ROUPA);
        Produto p3 = new Produto("Liquidificador", 180.0, Categoria.ELETRODOMESTICO);

        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);
        loja.cadastrarProduto(p3);

        loja.salvarProdutosEmArquivo("produtos.txt");


        Pedido pedido = new Pedido("Arthur");
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p3);

        loja.salvarPedidoSerializado(pedido, "pedido.dat");


        System.out.println("\n--- Produtos Cadastrados ---");
        loja.listarProdutos();
    }
}
