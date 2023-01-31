package com.company;

import Enum.Categorias;

public class Exercicio {

    private String nome;

    private String descricao;

    private int qtdSerie;

    private int  qtdRepeticoes;

    private int carga;

    private int esforco;

    private Categorias categorias;

    public Exercicio(String nome, String descricao, int qtdSerie, int qtdRepeticoes, int carga, Categorias categorias) {
        this.nome = nome;
        this.descricao = descricao;
        this.qtdSerie = qtdSerie;
        this.qtdRepeticoes = qtdRepeticoes;
        this.carga = carga;
        this.categorias = categorias;
        this.esforco = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdSerie() {
        return qtdSerie;
    }

    public void setQtdSerie(int qtdSerie) {
        this.qtdSerie = qtdSerie;
    }

    public int getQtdRepeticoes() {
        return qtdRepeticoes;
    }

    public void setQtdRepeticoes(int qtdRepeticoes) {
        this.qtdRepeticoes = qtdRepeticoes;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getEsforco() {
        return esforco;
    }

    public void setEsforco(int esforco) {
        this.esforco = esforco;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
}
