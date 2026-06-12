package com.empresa.andrahotel.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva extends Hospedagem {

    private int numeroPessoas;
    private boolean incluiCafeDaManha;
    private StatusReserva statusReserva;
    private Quarto quarto;

    public Reserva(String id, LocalDate dataCheckIn, LocalDate dataCheckOut, double valorDiaria, double desconto, String observacoes, int numeroPessoas, boolean incluiCafeDaManha, StatusReserva statusReserva, Quarto quarto) {
        super(id, dataCheckIn, dataCheckOut, valorDiaria, desconto, observacoes);
        this.numeroPessoas = numeroPessoas;
        this.incluiCafeDaManha = incluiCafeDaManha;
        this.statusReserva = statusReserva;
        this.quarto = quarto;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public boolean isIncluiCafeDaManha() {
        return incluiCafeDaManha;
    }

    public boolean getIncluiCafeDaManha() {
        return incluiCafeDaManha;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    @Override
    public double calcularTotal() {
        long dias = ChronoUnit.DAYS.between(getDataCheckIn(), getDataCheckOut());

        double valorBase = dias * getValorDiaria();

        if (quarto.isPossuiVaranda()) {
            valorBase += (valorBase * 10) / 100;
        }
        if (quarto.isPossuiArCondicionado()) {
            valorBase += (valorBase * 8) / 100;
        }
        if (incluiCafeDaManha) {
            valorBase += (valorBase * 5) / 100;
        }
        return valorBase;
    }

    public double calcularComCafeDaManha() {
        long dias = ChronoUnit.DAYS.between(getDataCheckIn(), getDataCheckOut());

        double valorDiaria = dias * getValorDiaria();
        double valorComCafeDaManha = (valorDiaria * 5) / 100;

        double total = valorComCafeDaManha + valorDiaria;

        return total;
    }

    @Override
    public Long calcularNumeroDiarias() {
        return super.calcularNumeroDiarias();
    }

    @Override
    public String gerarDescrisaoFatura() {
        return
                "Check-In: " + getDataCheckIn() +
                        " Check-Out: " + getDataCheckOut() +
                        " Numéro de pessoas: " + getNumeroPessoas() +
                        " Diárias: " + calcularNumeroDiarias() + " x R$ " + getValorDiaria() +
                        " Café da manha: " + getIncluiCafeDaManha() +
                        " Status: " + getStatusReserva() +
                        " Total: R$ " + calcularTotal();
    }
}
