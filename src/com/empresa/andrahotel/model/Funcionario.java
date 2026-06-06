package com.empresa.andrahotel.model;

public abstract class Funcionario {

    private String matricula;
    private String nome;
    private String cpf;
    private double salarioBase;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cpf, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.ativo = true;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public abstract double calcularSalarioLiquido();

    public abstract String getCargo();

    @Override
    public String toString() {
        return
                "\nMatricula: " + matricula +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nSalário: R$ : " + String.format("%.2f ", salarioBase) +
                "\nAtivo: " + ativo;
    }
}
