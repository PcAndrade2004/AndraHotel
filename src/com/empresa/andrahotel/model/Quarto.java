package com.empresa.andrahotel.model;

public class Quarto {

    private String numero;
    private int andar;
    private String tipo;
    private int capacidadePessoas;
    private double valorDiaria;
    private StatusQuarto status;
    private boolean possuiVaranda;
    private boolean possuiArCondicionado;


    public Quarto(String numero, int andar, String tipo, int capacidadePessoas, double valorDiaria, StatusQuarto status, boolean possuiVaranda, boolean possuiArCondicionado) {
        this.numero = numero;
        this.andar = andar;
        this.tipo = tipo;
        this.capacidadePessoas = capacidadePessoas;
        this.valorDiaria = valorDiaria;
        this.status = status;
        this.possuiVaranda = possuiVaranda;
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public String getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public StatusQuarto getStatus() {
        return status;
    }

    public void setStatus(StatusQuarto status) {
        this.status = status;
    }

    public boolean isPossuiVaranda() {
        return possuiVaranda;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero='" + numero + '\'' +
                ", andar=" + andar +
                ", tipo='" + tipo + '\'' +
                ", capacidadePessoas=" + capacidadePessoas +
                ", valorDiaria=" + valorDiaria +
                ", status=" + status +
                ", possuiVaranda=" + possuiVaranda +
                ", possuiArCondicionado=" + possuiArCondicionado +
                '}';
    }
}
