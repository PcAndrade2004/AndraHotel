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
        double adicional = 0;

        if (quarto.isPossuiVaranda()) {
            adicional += (valorBase * 10) / 100;
        }
        if (quarto.isPossuiArCondicionado()) {
            adicional += (valorBase * 8) / 100;
        }
        if (incluiCafeDaManha) {
            adicional += (valorBase * 5) / 100;
        }

        double total = valorBase + adicional;
        double totalFinal = total;

        if (quarto.isPossuiVaranda() && quarto.isPossuiArCondicionado() && isIncluiCafeDaManha()) {
            double pacoteCompleto = total * getDesconto() / 100;
            totalFinal = total - pacoteCompleto;
        }

        return totalFinal;
    }

    @Override
    public String gerarDescrisaoFatura() {
        return
                "Check-In: " + getDataCheckIn() +
                        " Check-Out: " + getDataCheckOut() +
                        " Numéro de pessoas: " + getNumeroPessoas() +
                        " Diárias: " + calcularNumeroDiarias() + " x R$ " + getValorDiaria() +
                        " Café da manha: " + isIncluiCafeDaManha() +
                        " Status: " + getStatusReserva() +
                        " Total: R$ " + calcularTotal();
    }
}
