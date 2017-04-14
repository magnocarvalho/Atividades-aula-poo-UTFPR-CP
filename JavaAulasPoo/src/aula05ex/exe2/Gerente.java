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
public class Gerente extends Funcionario{
    
    private double bonus;
    
    public Gerente(String nome, Data data, String cpf, double base, int vendas, String empresa) 
    {
        super(nome, data, cpf, base, vendas, empresa);
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
