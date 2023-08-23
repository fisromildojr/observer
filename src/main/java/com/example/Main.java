package com.example;

import com.example.controllers.ProdutoController;
import com.example.models.MeuLogGeral;
import com.example.models.MeuLogProduto;
import com.example.models.Produto;

public class Main {
    public static void main(String[] args) {
        // Crio uma instancia do MeuLog
        MeuLogProduto logProduto = new MeuLogProduto();
        MeuLogGeral logGeral = new MeuLogGeral();
        // Crio a instancia do controller do produto
        ProdutoController pc = new ProdutoController();
        pc.addObserver(logProduto);
        pc.addObserver(logGeral);

        // Crio um produto
        Produto p1 = new Produto("Sabonete");
        Produto p2 = new Produto("Farinha de Trigo");
        Produto p3 = new Produto("Carne");
        Produto p4 = new Produto("Munição 9mm");

        // Salvo o produto
        pc.save(p1);
        pc.save(p2);
        pc.save(p3);
        pc.save(p4);
        pc.update(p2);
    }
}