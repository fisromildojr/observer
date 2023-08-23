package com.example.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.example.interfaces.Observer;

public class MeuLogProduto implements Observer {

    @Override
    public void update(Object object, String mensagem) {

        // Aqui poderia escrever em um arquivo
        System.out.println("Log Produto => "
                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + " | "
                + object.getClass().getName() + " | " + mensagem);
    }

}
