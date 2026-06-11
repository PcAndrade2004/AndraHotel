package com.empresa.andrahotel.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva extends Hospedagem{

    private int numeroPessoas;
    private boolean incluiCafeDaManha;
    private StatusReserva statusReserva;

    public Reserva(String id, LocalDate dataCheckIn, LocalDate dataCheckOut, double valorDiaria, double desconto, String observacoes, int numeroPessoas, boolean incluiCafeDaManha, StatusReserva statusReserva){
        super(id, dataCheckIn, dataCheckOut, valorDiaria, desconto, observacoes);
        this.numeroPessoas = numeroPessoas;
        this.incluiCafeDaManha = incluiCafeDaManha;
        this.statusReserva = statusReserva;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public boolean isIncluiCafeDaManha() {
        return incluiCafeDaManha;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
    }

    @Override
    public double calcularTotal() {
        long dias = ChronoUnit.DAYS.between(getDataCheckIn(), getDataCheckOut());

        double valorTotalSemCafe = dias * getValorDiaria();
        return valorTotalSemCafe;
    }

    public double calcularComCafeDaManha() {
        long dias  = ChronoUnit.DAYS.between(getDataCheckIn(), getDataCheckOut());

        double valorDiaria = dias * getValorDiaria();
        double valorComCafeDaManha = valorDiaria * 5 / 100;

        double total = valorComCafeDaManha + valorDiaria;

        return total;
    }

    @Override
    public String gerarDescrisaoFatura() {
        return "";
    }
}
