package br.com.exercicio.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Produto> produtos;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.produtos = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean adicionarProduto(Produto produto){
        if (produto.getValor() <= this.saldo){
            this.saldo -= produto.getValor();
            this.produtos.add(produto);
            return true;
        } else {
            return false;
        }
    }
}
