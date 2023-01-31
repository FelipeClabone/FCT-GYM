/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author felipe.freitas_visag
 */
public class Plano implements Serializable{
    private String nome;

    private ArrayList<Treino> treinos = new ArrayList();

    public Plano(String nome) {
        this.nome = nome;
    }

    public void criarTreino(int ciclo, String nome){
        Treino treino = new Treino(ciclo, nome);
        this.treinos.add(treino);
    }
    
    public Treino findTreino(String nome){
        for(Treino treino : this.getTreinos()){
            if(treino.getNome().equals(nome)){
                return treino;
            }
        }
        
        return null;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(ArrayList<Treino> treinos) {
        this.treinos = treinos;
    }
    
    public String imprimirPlano(){
        String relatorio =  "\nNome: " + nome;
        return relatorio;
    }

}
