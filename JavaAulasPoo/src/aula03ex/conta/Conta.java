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
    
    Conta(int numConta, String nome, double saldoInicial)
    {
        this.setNomeTitula(nome);
        this.setNumero(numConta);
        this.setSaldo(saldoInicial);
    }
    Conta(int id) //c) Incluir construtores sobrecarregados para construir os objetos personalizados e definir diferentes formas de inicialização.
    {
        this.setNumero(id);
        this.setNomeTitula("MATSUNAGA");
        this.setSaldo(25000);
    }
    
    /**
     * a) O método sacar() deverá subtrair do saldo do cliente o 
     * valor passado como argumento. Não existe saldo negativo. 
     * Crie uma nova classe e teste a implementação da classe Conta.
     * @param valor 
     */
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
    /**
     * b) O Método depositar() acresce no saldo o valor passado como argumento. 
     * @param valor 
     */
    public void depositar(double valor)
    {
        if( valor > 0 )
        {
            this.setSaldo(this.getSaldo() + valor);
        }
    }
    public String tostring()
    {
        //D: O método toString serve para retornar uma String com os dados atuais da conta, em uma única linha (número - titular - saldo).
        return ("Conta numero: " + getNumero()+ "\n Cliente: " + getNomeTitula() + "\nSaldo atual: " + getSaldo() + "\nConta pronta para deposito ou saque");
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
