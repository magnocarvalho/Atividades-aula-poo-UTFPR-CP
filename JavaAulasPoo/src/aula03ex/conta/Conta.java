/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex.conta;

/**
 *  2) Defina uma classe chamada Conta da seguinte forma: 
 * 
Conta
numero: int
nomeTitular: String
saldo: double
sacar(double): void
depositar(double): void
toString(): String
 * @author Magno carvalho 
 */
public class Conta {
    
    private int numero;
    private String nomeTitula;
    private double saldo;
    
    public void sacar(double valor)
    {
        if(valor > this.getSaldo() || valor <= 0 )
        {
            System.out.println("valor informado esta errado");
        }
        else
        {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    public void depositar(double valor)
    {
        if( valor > 0 )
        {
            this.setSaldo(this.getSaldo() + valor);
        }
    }
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nomeTitula
     */
    public String getNomeTitula() {
        return nomeTitula;
    }

    /**
     * @param nomeTitula the nomeTitula to set
     */
    public void setNomeTitula(String nomeTitula) {
        this.nomeTitula = nomeTitula;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
