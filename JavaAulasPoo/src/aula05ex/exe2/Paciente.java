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
public class Paciente extends Pessoa{
    
    private double altura;
    private double peso;
    private String tipo_sangue;
    
    public Paciente(String nome, Data data, String cpf, double altura, double peso, String tipo) {
        super(nome, data, cpf);
        this.tipo_sangue = tipo;
        this.peso = peso;
        this.altura = altura;
    }   
    //imc 
    
    public double calculaIMC()
    {        
        double imc = getPeso() / (getAltura() * getAltura());
        double maxM = 26.4f;
        double minF = 19.1f;
        if(imc >= minF && imc <= maxM )
        {
            return 0;
        }
        if(maxM < imc)
        {
            return 1;
        }
        else
        {
            return -1;
        }      
    }
    
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tipo_sangue
     */
    public String getTipo_sangue() {
        return tipo_sangue;
    }

    /**
     * @param tipo_sangue the tipo_sangue to set
     */
    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }
    
}
