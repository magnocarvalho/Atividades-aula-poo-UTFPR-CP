/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades5.exe1;

/**
 *
 * @author Aluno
 */
public class Vetor {
    private int[] a;
    private int n;

    public Vetor()
    {
        this.a = null;
        this.n = 0;
    }
    public Vetor(int[] a, int n) {
        this.a = a;
        this.n = n;
    }
    //metodos 
    public void inserir(int x, int n)
    {
        a[n] = x;
    }
    public int calcular()
    {
        int retorno = 0;
        for (int i = 0; i < n; i++) 
        {
            retorno += a[i];
        }
        return retorno;
    }
    public void inverte()
    {
        int[] retorno = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i++) 
        {
            retorno[j] = a[i];
            j--;
        }
        for (int i = 0; i < n; i++) 
        {
            a[i] = retorno[i];
        }
        
    }
    public void orderna()
    {
        int aux;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(a[i] < a[j])
                {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        
    }
    public void imprimir()
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println(a[i]);
        }
    }
    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
