/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex.exe4;

import java.util.Scanner;

/**
 *4) Na teoria de sistemas, define-se como elemento
 * minimax de uma matriz o menor elemento da linha a qual
 * encontra o maior elemento da matriz. Construa uma classe 
 * Java para encontrar o minimax numa 
 * matriz de 5 linhas e 5 colunas. Os dados serão informados 
 * pelo usuário.
 * @author magno
 */
public class exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double m[][] =  new double[5][5];
        double min, max;
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                m[i][j] = sc.nextDouble(); //lendo dados do usuario
            }       
        }
        min = m[0][0];
        max = m[0][0];
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
               if(m[i][j] < min)
               {
                   min = m[i][j];
               }
               if(m[i][j] > max)
               {
                   max = m[i][j];
               }
            }       
        }
        System.out.println("Valor minimo informado pelo usuario = " + min);
        System.out.println("Valor maximo informado pelo usuario = " + max);
    }
    
}
