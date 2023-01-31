package com.company;

import java.util.ArrayList;
import Enum.Categorias;
public class Treino {

    private int ciclo;

    private boolean concluido;

    private int esforco;

    private ArrayList<Exercicio> exercicios;

    public Treino(int ciclo) {
        this.ciclo = ciclo;
        this.concluido = false;
        this.esforco = 0;
    }

    public void concluirDiaDeTreino(){
        this.ciclo = ciclo - 1;
        if (this.ciclo == 0){

        }
    }

    public void criarExercicio(String nome, String descricao, Categorias categoria,
                               int qtdSerie, int qtdRepeticoes, int carga){
        Exercicio exercicio = new Exercicio(nome, descricao, qtdSerie,
                qtdRepeticoes, carga, categoria);
        this.exercicios.add(exercicio);
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

}
