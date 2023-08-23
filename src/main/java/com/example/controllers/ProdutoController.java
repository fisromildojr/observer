package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.interfaces.Observer;
import com.example.models.Produto;

public class ProdutoController {
    private List<Observer> observers = new ArrayList<>();

    public void save(Produto produto) {
        // System.out.println("Produto salvo com sucesso");
        notifyListeners(produto, "Produto salvo com sucesso");
    }

    public void update(Produto produto) {
        // System.out.println("Produto salvo com sucesso");
        notifyListeners(produto, "Produto atualizado com sucesso");
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyListeners(Object object, String message) {
        observers.forEach(observer -> observer.update(object, message));
    }

}
