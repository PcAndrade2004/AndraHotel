package com.empresa.andrahotel.view;

import com.empresa.andrahotel.model.Recepcionista;

public class Main {
    public static void main(String[] args) {
        Recepcionista rec = new Recepcionista("M001", "Ana Lima", "123.456.789-00", 2500.0, "Manhã");

        rec.adicionarIdioma("Português");
        rec.adicionarIdioma("Italia");
        rec.adicionarIdioma("Rio de Janeiro");


        System.out.println(rec);
        System.out.println( "Salário Liquido: " + String.format("%.2f ", rec.calcularSalarioLiquido()));
        System.out.println(rec.getCargo());
    }
}
