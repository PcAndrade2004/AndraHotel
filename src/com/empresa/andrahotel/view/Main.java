package com.empresa.andrahotel.view;

import com.empresa.andrahotel.model.Gerente;
import com.empresa.andrahotel.model.Recepcionista;

public class Main {
    public static void main(String[] args) {
        Recepcionista rec = new Recepcionista("M001", "Ana Lima", "1232.4536.78439-00", 2500.0, true, "Manhã");

        rec.adicionarIdioma("Português");
        rec.adicionarIdioma("Italia");
        rec.adicionarIdioma("Rio de Janeiro");


        System.out.println(rec);
        System.out.println( "Salário Liquido: " + String.format("%.2f ", rec.calcularSalarioLiquido()));
        System.out.println(rec.getCargo());


        Gerente g = new Gerente("M002", "Carlos Eduardo", "4564-664-223-2212", 1200.00, "Hospedaria", 10);

        System.out.println(g);
        System.out.println("Salário liquido: " + String.format("%.2f", g.calcularSalarioLiquido()));
        System.out.println("Departamento: " + g.getCargo());
    }
}
