package com.empresa.andrahotel.model;

import java.util.ArrayList;
import java.util.List;

public class Recepcionista extends Funcionario{

    private String turno;
    private List<String> idiomasAtendimento;

    public Recepcionista(String matricula, String nome, String cpf, double salarioBase, boolean ativo, String turno) {
        super(matricula, nome, cpf, salarioBase);
        this.turno = turno;
        this.idiomasAtendimento = new ArrayList<>();
    }

    public String getTurno() {
        return turno;
    }

    public List<String> getIdiomasAtendimento() {
        return idiomasAtendimento;
    }

    public void adicionarIdioma (String idioma){
        this.idiomasAtendimento.add(idioma);
    }

    @Override
    public double calcularSalarioLiquido() {
        double descontoINSS = getSalarioBase() * 0.11;
        double descontoIR = getSalarioBase() * 0.075;
        return getSalarioBase() - descontoINSS - descontoIR;
    }

    @Override
    public String getCargo() {
        return "Recepcionista";
    }

    @Override
    public String toString() {
        return "\n==============" +
                "\nRecepcionista" +
                "\n==============" +
                super.toString() +
                "\nTurno: " + turno +
                "\nIdiomas Atendimento: " + idiomasAtendimento;
    }
}
