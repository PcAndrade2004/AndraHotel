package com.empresa.andrahotel.model;

public class Recepcionista extends Funcionario{

    private String turno;

    public Recepcionista(String matricula, String nome, String cpf, double salarioBase, String turno) {
        super(matricula, nome, cpf, salarioBase);
        this.turno = turno;
    }


}
