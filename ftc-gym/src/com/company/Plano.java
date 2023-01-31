package com.company;

import java.util.ArrayList;

public class Plano {

    private int ciclo;

    private String nome;

    private int totalDias;

    private ArrayList<Treino> treinos;

    public Plano(int ciclo, String nome, int totalDias) {
        this.ciclo = ciclo;
        this.nome = nome;
        this.totalDias = totalDias;
    }

    public void criarTreino(int ciclo){
        Treino treino = new Treino(ciclo);
        this.treinos.add(treino);
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    public ArrayList<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(ArrayList<Treino> treinos) {
        this.treinos = treinos;
    }
}
