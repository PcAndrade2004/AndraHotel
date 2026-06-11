package com.empresa.andrahotel.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Hospedagem {

    private String id;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private double valorDiaria;
    private double desconto;
    private String observacoes;

    public Hospedagem() {

    }

    public Hospedagem(String id, LocalDate dataCheckIn, LocalDate dataCheckOut, double valorDiaria, double desconto,String observacoes) {
        this.id = id;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckIn;
        this.valorDiaria = valorDiaria;
        this.desconto = desconto;
        this.observacoes = observacoes;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Long calcularNumeroDiarias() {
       LocalDate dataCheckIn = this.dataCheckIn;
       LocalDate dataCheckOut = this.dataCheckOut;

       long dias = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);

       return dias;
    }

    public void aplicarDesconto(double percentual) {
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularTotal();

    public abstract String gerarDescrisaoFatura();

    @Override
    public String toString() {
        return "Id: " + id +
                "Data CheckIn" + dataCheckIn +
                "Data CheckOut: " + dataCheckOut +
                "Valor diária: " + valorDiaria +
                "Desconto: " + desconto +
                "Observações: " + observacoes;
    }
}
