/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.Categorias;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author felipe.freitas_visag
 */
public class Treino implements Serializable{
    private int ciclo;

    private String nome;
   
    private boolean concluido;

    private int esforco;
    
    private String comentario;

    private ArrayList<Exercicio> exercicios = new ArrayList();

    public Treino(int ciclo, String nome) {
        this.ciclo = ciclo;
        this.nome = nome;
        this.concluido = false;
        this.esforco = 0;
        this.comentario = "";
    }

    public void concluirTreino(int esforco, String comentario){
        this.esforco = esforco;
        this.concluido = true;
        this.comentario = comentario;
    }

    public void criarExercicio(String nome, String descricao, Categorias categoria,
                               int qtdSerie, int qtdRepeticoes, int carga){
        Exercicio exercicio = new Exercicio(nome, descricao, qtdSerie,
                qtdRepeticoes, carga, categoria);
        this.exercicios.add(exercicio);
    }

    public Exercicio findExercicio(String nome){
        for(Exercicio exercicio : this.getExercicios()){
            if(exercicio.getNome().equals(nome)){
                return exercicio;
            }
        }
        
        return null;
    }
    
    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public int getEsforco() {
        return esforco;
    }

    public void setEsforco(int esforco) {
        this.esforco = esforco;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }   
    
    public String imprimirTreino(){
        String relatorio =  "\nCiclo: " + ciclo +
                            "\nNome do treino: " + nome + 
                            "\nEsforco: " + esforco + 
                            "\nComentário: " + comentario;
        return relatorio;
    }    
}
