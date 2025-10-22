package service;

import model.Pedido;
import model.Produto;
import repository.RepositorioGenerico;
import io.ArquivoUtil;
import io.Serializador;

public class LojaService {

    private RepositorioGenerico<Produto> produtos = new RepositorioGenerico<>();
    private RepositorioGenerico<Pedido> pedidos = new RepositorioGenerico<>();

    public void cadastrarProduto(Produto p) {
        produtos.adicionar(p);
    }

    public void salvarProdutosEmArquivo(String caminho) {
        ArquivoUtil.salvarEmArquivoTexto(caminho, produtos.listar());
    }

    public void salvarPedidoSerializado(Pedido pedido, String caminho) {
        Serializador.salvarObjeto(pedido, caminho);
    }

    public void listarProdutos() {
        produtos.listar().forEach(System.out::println);
    }
}
