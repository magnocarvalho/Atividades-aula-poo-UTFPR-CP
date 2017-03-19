/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex.exe2;

import java.util.Scanner;

/**
 *2) Escreva uma aplicação Java que receba 15 valores, do usuário, armazene em um vetor e depois 
 * apresente na tela a quantidade de valores pares.
 * @author magno
 */
public class exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        Scanner sc = new Scanner(System.in);
        int a[] = new int[15]; //variavel do tipo vetor para leitura dos valores de entrada
        for (int i = 0; i < 15; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for (int i = 0; i < 15; i++) {
            if(a[i]%2 == 0)// if para imprimir os numeros primos
            {
                System.out.println((i+1)+ " = " + a[i] + ";" );
            }
        }
    }
    
}
