package com.company;

import java.util.ArrayList;

public class Usuario {

    private String nome;

    private String email;

    private String senha;

    private String academia;

    private ArrayList<Plano> planos;

    public Usuario(String nome, String email, String senha, String academia) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.academia = academia;
    }

    public void criarPlano(int ciclo, String nome, int totalDias){
        Plano plano = new Plano(ciclo, nome, totalDias);
        this.planos.add(plano);
    }

    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<Plano> planos) {
        this.planos = planos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }
}
