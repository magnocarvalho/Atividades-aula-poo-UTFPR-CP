/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe2;

import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author magno
 */
public class Pessoa {
    
    private String nome;
    private Data dataNasc;
    private String cpf;
    
    public Pessoa(String nome, Data data, String cpf)
    {
        this.cpf = cpf;
        this.dataNasc = data;
        this.nome = nome;
    }
    
    public int calculaIdade()
    {

        int anoNasc = getDataNasc().getAno();
        int mesNasc = getDataNasc().getMes();
        int diaNasc = getDataNasc().getDia();
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoNasc;
        if( cal.get(Calendar.MONTH) > mesNasc)
        {//se o mes atual for menor que o mes do nascimento
            idade--;
        }
        if( cal.get(Calendar.MONTH) == mesNasc)
        {
            if(cal.get(Calendar.DAY_OF_MONTH) > diaNasc)
            {
                idade--;
            }
        }
        return idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNasc
     */
    public Data getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
