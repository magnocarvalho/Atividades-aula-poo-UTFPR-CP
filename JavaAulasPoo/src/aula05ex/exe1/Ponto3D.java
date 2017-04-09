/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe1;

/**
 *
 *  1. Implemente uma classe chamada Ponto1D, que contem somente um atributo x, ´
com seu getter e setter. Em seguida implemente outras classes.
(a) Classe Ponto2D que herda de Ponto1D, com acrescimo de um atributo y. ´
(b) Classe Ponto3D que herda de Ponto2D, com acrescimo de um atributo z. ´
(c) Classe Ponto4D que herda de Ponto3D, com acrescimo de um atributo w. ´
Para todas as classes acima, implemente os getters e setters e o metodo toString() ´
sobreposto.
 * @author magno
 */
public class Ponto3D extends Ponto2D{
    
   
    private int z;
    
    
    public Ponto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
}
