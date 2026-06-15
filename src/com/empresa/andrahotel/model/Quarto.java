package com.empresa.andrahotel.model;

public class Quarto {

    private String numeroQuarto;
    private int andar;
    private String tipo;
    private int capacidadePessoas;
    private double valorDiaria;
    private StatusQuarto status;
    private boolean possuiVaranda;
    private boolean possuiArCondicionado;


    public Quarto(String numeroQuarto, int andar, String tipo, int capacidadePessoas, double valorDiaria, StatusQuarto status, boolean possuiVaranda, boolean possuiArCondicionado) {
        this.numeroQuarto = numeroQuarto;
        this.andar = andar;
        this.tipo = tipo;
        this.capacidadePessoas = capacidadePessoas;
        this.valorDiaria = valorDiaria;
        this.status = status;
        this.possuiVaranda = possuiVaranda;
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
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
        return "Quarto: " +
                " Numéro: " + numeroQuarto + '\'' +
                " Andar: " + andar +
                " Tipo; " + tipo + '\'' +
                " Capacidade Pessoas: " + capacidadePessoas +
                " Valor Diária: " + valorDiaria +
                " Status: " + status +
                " Possui Varanda: " + possuiVaranda +
                " Possui Ar-condicionado: " + possuiArCondicionado;
    }
}
