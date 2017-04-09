/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe1;

/**
 *
 * @author magno
 */
public class Ponto4D extends Ponto3D{
    
    private int w;

    public Ponto4D(int x, int y, int z, int w) {
        super(x, y, z);
        this.w = w;
    }
    
   

    /**
     * @return the w
     */
    public int getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(int w) {
        this.w = w;
    }
    
    
    
    
}
