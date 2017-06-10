/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades5.exe2;

/**
 *
 * @author Aluno
 */
public abstract class  FiguraGeometrica {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    
}
