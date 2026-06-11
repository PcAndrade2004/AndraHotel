package com.empresa.andrahotel.model;

public enum StatusReserva {
    CONFIRMADO("Reserva: Confirmado"),
    PENDENTE("Reserva: Pendente"),
    CANCELADA("Reserva; Cancelada"),
    CONCLUIDA("Reserva: Concluida"),;

    private String descricao;

    StatusReserva(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
