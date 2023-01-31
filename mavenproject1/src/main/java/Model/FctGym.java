/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Enums.Categorias;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author felipe.freitas_visag
 */
public final class FctGym {
    
    private static ArrayList<Usuario> usuarios = new ArrayList();
        
    public FctGym(){
        
    }
        
    public void alterarTreino(String treino, String email, int carga, int repeticoes,
                            String plano, String exercicio){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                if(repeticoes != 0){
                   usuario.findPlano(plano).findTreino(treino).findExercicio(exercicio).setQtdRepeticoes(repeticoes);
                }
                if(carga != 0){
                    usuario.findPlano(plano).findTreino(treino).findExercicio(exercicio).setCarga(carga);
                }
            }
        }
    }
    
    public void cadastrarUsuario(String nome, String email, String senha, String academia){
        Usuario usuario = new Usuario(nome, email, senha, academia);
        FctGym.usuarios.add(usuario);
    }
    
    public void cadastrarPlano(String nome, String email){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                usuario.criarPlano(nome);
            }
        }
    }
    
    public void cadastrarTreino(String nome, int ciclo, String nomePlano, String email){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                usuario.findPlano(nomePlano).criarTreino(ciclo, nome);
            }
        }
    }
    
    public void cadastrarExercicio(String nomeTreino, String descricao, int qtdSerie, int qtdRepeticoes, 
            int carga, Categorias categoria, String nome, int ciclo, String nomePlano, String email){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                usuario.findPlano(nomePlano).findTreino(nomeTreino)
                        .criarExercicio(nome, descricao, categoria, qtdSerie, qtdRepeticoes, carga);
            }
        }
    }
    
    public void concluirExercicio(String nomeExercicio, String email, int esforco, String comentario,
            String nomePlano,  String nomeTreino){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                usuario.findPlano(nomePlano).findTreino(nomeTreino).findExercicio(nomeExercicio)
                        .concluir(esforco, comentario);
            }
        }
    }
    
    public void concluirTreino(String email, int esforco, String comentario,
            String nomePlano,  String nomeTreino){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email)){
                usuario.findPlano(nomePlano).findTreino(nomeTreino).concluirTreino(esforco, comentario);
            }
        }
    }
    
    public String visualizarTreinos(String email){
        System.out.println("Todos treinos cadastrados:");
        ArrayList<Plano> planos = new ArrayList();
        int contador = 1;
        String relatorio = "";
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                planos = usuario.getPlanos();
                for (Plano plano : planos){
                    for (Treino treino : plano.getTreinos()){
                        relatorio += "\n\n#" + contador;
                        relatorio += treino.imprimirTreino();
                        contador++;
                    }
                }
            }
        }
        if(relatorio.isEmpty() || relatorio.equals("")){
            relatorio = "Nenhum treino cadastrado";
        }
        return relatorio;
    }
    
    public String visualizarPlanos(String email){
        System.out.println("Todos planos cadastrados:");
        int contador = 1;
        String relatorio = "";
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                for (Plano plano : usuario.getPlanos()){
                    relatorio += "\n\n#" + contador;
                    relatorio += plano.imprimirPlano();
                    contador++;
                }
            }
        }
        if(relatorio.isEmpty() || relatorio.equals("")){
            relatorio = "Nenhum plano cadastrado";
        }
        return relatorio;
    }
    
    public String visualizarExercicios(String email){
        System.out.println("Todos exercícios cadastrados:");
        ArrayList<Plano> planos = new ArrayList();
        ArrayList<Treino> treinos = new ArrayList();
        int contador = 1;
        String relatorio = "";
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                planos = usuario.getPlanos();
                for (Plano plano : planos){
                    treinos = plano.getTreinos();
                    for (Treino treino : treinos){
                        for(Exercicio exercicio : treino.getExercicios()){
                            relatorio += "\n\n#" + contador;
                            relatorio += exercicio.imprimirExercicio();
                            contador++;
                        }
                    }
                }
            }
        }
        if(relatorio.isEmpty() || relatorio.equals("")){
            relatorio = "Nenhum exercicio cadastrado";
        }
        return relatorio;
    }
    
    public static void salvarDados() {
        try {
            FileOutputStream fileOut = new FileOutputStream("dados.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(usuarios);
            out.close();
            fileOut.close();

        }
        catch (IOException i) {
            i.printStackTrace();
        }
    }


    public static void carregarDados() {

        try {
             FileInputStream fileIn = new FileInputStream("dados.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn);

             usuarios = (ArrayList<Usuario>)in.readObject();
             
             in.close();
             fileIn.close();

        } catch (IOException | ClassNotFoundException i) {
             i.printStackTrace();
          }

    
    }
}
