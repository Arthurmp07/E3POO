package repository;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public List<T> listar() {
        return itens;
    }

    public void limpar() {
        itens.clear();
    }
}
