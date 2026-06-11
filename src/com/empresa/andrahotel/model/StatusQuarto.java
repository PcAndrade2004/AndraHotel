package com.empresa.andrahotel.model;

public enum StatusQuarto {
    DISPONIVEL("DISPONIVEL"),
    OCUPADO("OCUPADO"),
    EM_LIMPEZA("EM_LIMPEZA"),
    MANUTENCAO("MANUTENCAO");

    private String descricao;

    StatusQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
