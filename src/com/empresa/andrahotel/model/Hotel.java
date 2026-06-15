package com.empresa.andrahotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private String cnpj;
    private String endereco;
    private int categoria;
    private List<Quarto> quartos;
    private List<Funcionario> funcionarios;
    private List<Hospede> hospedes;

    public Hotel() {

    }

    public Hotel(String nome, String cnpj, String endereco, int categoria) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.categoria = categoria;
        this.quartos = new ArrayList();
        this.funcionarios = new ArrayList();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public boolean removerQuarto(String numero){
        return quartos.removeIf(quarto -> quarto.getNumeroQuarto().equals(numero));
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(String numeroMatricula){
        return funcionarios.removeIf(funcionario -> funcionario.getMatricula().equals(numeroMatricula));
    }

    public void adicionarHospede(Hospede h) {
        hospedes.add(h);
    }

    public List<Quarto> buscarQuartoDisponivel() {
        for (Quarto quarto : quartos) {
            if(quarto.getStatus() == StatusQuarto.DISPONIVEL) {
                quartos.add(quarto);
            }

        }
        return quartos;
    }

    public Quarto buscarQuartoPorNumero(String numero) {

        for (Quarto quarto : quartos) {
            if(quarto.getNumeroQuarto().equals(numero)) {
                return quarto;
            }
        }

        return null;
    }

    public List<Funcionario> buscarFuncionariosAtivos() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.isAtivo()) {
                return funcionarios;
            }
        }
        return null;
    }





    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCategoria() {
        return categoria;
    }
}
