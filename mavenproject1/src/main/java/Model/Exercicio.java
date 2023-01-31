/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.Categorias;
import java.io.Serializable;

/**
 *
 * @author felipe.freitas_visag
 */
public class Exercicio implements Serializable{
    
    private String nome;

    private String descricao;

    private int qtdSerie;

    private int qtdRepeticoes;

    private int carga;

    private int esforco;
    
    private boolean concluido;
    
    private String comentario;
    
    private Categorias categorias;

    public Exercicio(String nome, String descricao, int qtdSerie, int qtdRepeticoes, int carga, Categorias categorias) {
        this.nome = nome;
        this.descricao = descricao;
        this.qtdSerie = qtdSerie;
        this.qtdRepeticoes = qtdRepeticoes;
        this.carga = carga;
        this.categorias = categorias;
        this.esforco = 0;
        this.comentario = "";
        this.concluido = false;
    }

    public void concluir(int esforco, String comentario){
        this.esforco = esforco;
        this.comentario = comentario;
        this.concluido = true;
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

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String imprimirExercicio(){
        String relatorio =  "\nNome: " + nome +
                            "\nDescrição: " + descricao + 
                            "\nSéries: " + qtdSerie + 
                            "\nRepetições: " + qtdRepeticoes +
                            "\nCarga: " + carga +
                            "\nEsforço: " + esforco + 
                            "\nCategoria: " + categorias;
        return relatorio;
    }

}
