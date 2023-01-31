/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Enums.Categorias;
import Model.FctGym;

/**
 *
 * @author felipe.freitas_visag
 */
public class Controlador {
       
    private final FctGym fctGym = new FctGym();
        
    public void salvarDados(){
        fctGym.salvarDados();
    }
            
    public void carregarDados(){
        fctGym.carregarDados();
    }     
            
    public void cadastrarUsuario(String nome, String email, String senha, String academia){
        fctGym.cadastrarUsuario(nome, email, senha, academia);
        System.out.println("Cadastrou Usuario");
    }
    
    public void cadastrarPlano(String nome, String email){
        fctGym.cadastrarPlano(nome, email);
                System.out.println("Cadastrou plano");
    }
    
    public void cadastrarTreino(String nome, int ciclo, String nomePlano, String email){
        fctGym.cadastrarTreino(nome, ciclo, nomePlano, email);
                System.out.println("Cadastrou trein");
    }
    
    public void cadastrarExercicio(String nomeTreino, String descricao, int qtdSerie, int qtdRepeticoes, 
            int carga, Categorias categoria, String nome, int ciclo, String nomePlano, String email){
        fctGym.cadastrarExercicio(nomeTreino, descricao, qtdSerie, qtdRepeticoes, carga, categoria, nome, ciclo, nomePlano, email);
            System.out.println("Cadastrou exer");
    }
    
    public void concluirExercicio(String nomeExercicio, String email, int esforco, String comentario,
            String nomePlano, String nomeTreino){
        fctGym.concluirExercicio(nomeExercicio, email, esforco, comentario, nomePlano, nomeTreino);
            System.out.println("Concluiu exec");
    }
    
    public void concluirTreino(String email, int esforco, String comentario,
            String nomePlano, String nomeTreino){
        fctGym.concluirTreino(email, esforco, comentario, nomePlano, nomeTreino);
           System.out.println("Concluiu treino");
    }
    
    public String visualizarTreinos(String email){
        return fctGym.visualizarTreinos(email);
    }
    
    public String visualizarPlanos(String email){
        return fctGym.visualizarPlanos(email);
    }
    
    public String visualizarExercicios(String email){
        return fctGym.visualizarExercicios(email);
    }
    
    public void alterarTreino(String treino, String email, int cargaInt, int repeticoesInt,
                            String plano, String exercicio){
        fctGym.alterarTreino(treino, email, cargaInt, repeticoesInt, plano, exercicio);
    }
}
