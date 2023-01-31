/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enums;

/**
 *
 * @author felipe.freitas_visag
 */
public enum Categorias {
    TRAPEZIO, OMBROS, BICEPS, TRICEPS, PUNHOS, PEITO, ABDOMEN,
    GLUTEOS, COXAS, PANTURRILHAS;
    
    public static Categorias getCategoria(String dbm) {
        return switch (dbm.toLowerCase()) {
            case "trapezio" -> TRAPEZIO;
            case "ombros" -> OMBROS;
            case "biceps" -> BICEPS;
            case "triceps" -> TRICEPS;
            case "punhos" -> PUNHOS;
            case "peito" -> PEITO;
            case "abdomen" -> ABDOMEN;
            case "gluteos" -> GLUTEOS;
            case "coxas" -> COXAS;
            case "panturrilhas" -> PANTURRILHAS;
            default -> null;
        };
    }
}
