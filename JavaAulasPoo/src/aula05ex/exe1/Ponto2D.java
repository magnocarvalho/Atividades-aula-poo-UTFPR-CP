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
public class Ponto2D extends Ponto1D{
    
    private int y;
    
    public Ponto2D(int x, int y)
    {
        super(x);
        this.y = y;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
}
