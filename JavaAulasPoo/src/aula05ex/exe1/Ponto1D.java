/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe1;

/**
 *  1. Implemente uma classe chamada Ponto1D, que contem somente um atributo x, ´
com seu getter e setter. Em seguida implemente outras classes.
(a) Classe Ponto2D que herda de Ponto1D, com acrescimo de um atributo y. ´
(b) Classe Ponto3D que herda de Ponto2D, com acrescimo de um atributo z. ´
(c) Classe Ponto4D que herda de Ponto3D, com acrescimo de um atributo w. ´
Para todas as classes acima, implemente os getters e setters e o metodo toString() ´
sobreposto.

 * @author magno
 */
public class Ponto1D {
    
    private int x;

    public Ponto1D(int a)//metodo contrutor
    {
        this.x = a;
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
}
