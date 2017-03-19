/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex.exe3;

import java.util.Scanner;

/**
 * 3) Escreva uma aplicação Java que receba 
 * e armazene em um vetor o salário de 10 pessoas.
 * Ao final mostre todos os salários maiores que a média salarial desse grupo.
 *
 * @author magno
 */
public class exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a[] = new double[10]; //vetor double
        double media = 0; // media inciada com valor 0 para eviar erros no calculo 
        for (int i = 0; i < 10; i++) 
        {
            a[i] = sc.nextDouble();
            media += a[i]; //media e incrementada a cada leitura de um novo valor 
        }
        media = media / 10; // media e divida entre 10 
        System.out.println("Salarios maiores que a media;");
        for (int i = 0; i < 10; i++) 
        {
           if(a[i] > media)
           {
               System.out.println((i + 1) +" = " + a[i]); // print realizado da possição lida do salario + o valor 
           }
        }
        
    }
    
}
