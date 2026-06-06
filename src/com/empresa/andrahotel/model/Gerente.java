package com.empresa.andrahotel.model;

public class Gerente extends Funcionario {

    private String departamento;
    private double percentualBonus;

    public Gerente (String matricula, String nome, String cpf, double salarioBase, boolean ativo, String departamento, double percentualBonus) {
        super(matricula, nome, cpf, salarioBase);
        this.departamento = departamento;
        this.percentualBonus = percentualBonus;
    }


    public String getDepartamento() {
        return departamento;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalarioLiquido() {

        double descontoINSS = 0.0;

        double salarioBruto = getSalarioBase() + (getSalarioBase() * percentualBonus / 100);
        if (salarioBruto <= 1412.00) {
            descontoINSS = salarioBruto * 7.5 / 100;
        } else if (salarioBruto <= 2666.68) {
            descontoINSS = salarioBruto * 9 / 100;
        } else if (salarioBruto <= 4000.03) {
            descontoINSS = salarioBruto * 12 / 100;
        } else {
            descontoINSS = salarioBruto * 14 / 100;
        }

        return salarioBruto - descontoINSS;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }

    @Override
    public String toString() {
        return "\n==============" +
                "\nGerente" +
                "\n==============" +
                super.toString() +
                "\nDepartamento: " + departamento;
    }
}
