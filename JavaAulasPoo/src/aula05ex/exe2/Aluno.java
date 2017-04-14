/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe2;

/**
 *
 * @author magno
 */
public class Aluno extends Pessoa{
    
    private int notas[];
    private String instituto;
    private int ra;
    
    public Aluno(String nome, Data data, String cpf, int n[], String instituto, int ra) {
        super(nome, data, cpf);
        this.notas = n;
        this.instituto = instituto;
        this.ra = ra;        
    }
    public double media()
    {
        double soma = 0;
            
        for (int i = 0; i < 4; i++) 
        {
            soma += this.getNotas()[i];
        }
        return soma/4;
    }
    public boolean aprovado()
    {
        double m = media();
        
        if(m >= 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * @return the notas
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     * @return the instituto
     */
    public String getInstituto() {
        return instituto;
    }

    /**
     * @param instituto the instituto to set
     */
    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
