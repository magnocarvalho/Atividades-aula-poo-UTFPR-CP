/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe2;

/**
 *(g) Para a classe Gerente herdado de Funcionario, implemente um construtor
    que inicialize seus atributos (bonus), al ˆ em dos atributos da sua classe ´
    base. O salarioFinal() deve calcular da mesma forma que o sal ´ ario do ´
    Funcionario com acrescimo de um percentual de b ´ onus.
 * @author magno
 */
public class Gerente extends Funcionario{
    
    private double bonus;
    
    public Gerente(String nome, Data data, String cpf, double base, int vendas, String empresa, double bonus) 
    {
        super(nome, data, cpf, base, vendas, empresa);
        this.bonus = bonus;
    }
    
    public double salarioFinalG()
    {
        //calculo do salrio final * com porcentagem de bonus;
        return (((getBase() * getVendas())/100)*getBonus()) +(getBase()*getVendas());
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
