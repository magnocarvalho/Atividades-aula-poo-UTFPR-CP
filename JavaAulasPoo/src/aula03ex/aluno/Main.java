/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex.aluno;

import aula03ex.conta.Conta;
import java.util.Scanner;

/**
 *
 * @author Magno carvalho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o RA do aluno ");
        aluno.setRa(sc.nextInt());
                
        do{
            
            System.out.println(" 1 - imprimir todos os dados do aluno");
            System.out.println(" 2 - verificar se o aluno foi aprovado ou reprovado");
            System.out.println(" 3 - atribuir notas ao aluno");
            System.out.println(" 0 - sair ");
                  
            switch (a)
            {
                
                case 1:
                  aluno.imprimirNota(aluno.getRa());
                    
                        
            }
        }while(true);
        
    }
    
}
