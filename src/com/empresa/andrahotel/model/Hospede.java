package com.empresa.andrahotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hospede {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String nacionalidade;
    private List<Hospedagem> historicoReservas;

    public Hospede() {

    }

    public Hospede(String nome, String cpf, String email, String telefone, String nacionalidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nacionalidade = nacionalidade;
        this.historicoReservas = new ArrayList();
    }

    public void adicionarReserva(Hospedagem hospedagem){
        this.historicoReservas.add(hospedagem);
    }

//    public double calcularTotalGasto(Hospedagem cal) {
//        return cal.calcularTotal();
//    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Hospedagem> getHistoricoReservas() {
        return historicoReservas;
    }


}
