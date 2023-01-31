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
public class Usuario implements Serializable {
    
    private String nome;

    private String email;

    private String senha;

    private String academia;

    private ArrayList<Plano> planos = new ArrayList();

    public Usuario(String nome, String email, String senha, String academia) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.academia = academia;
    }

    public void criarPlano(String nome){
        Plano plano = new Plano(nome);
        this.planos.add(plano);
    }
            
    public Plano findPlano(String nome){
        for(Plano plano : this.getPlanos()){
            if(plano.getNome().equals(nome)){
                return plano;
            }
        }
        
        return null;
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
