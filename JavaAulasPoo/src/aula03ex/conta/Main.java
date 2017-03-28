/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex.conta;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c = new Conta();
        Scanner sc = new Scanner(System.in);
        int a = 0;
        
        do{
            System.out.println("Para depositos digite 1\n\n\nSacar digite 2\n\n\nexit 0\n");
            a = sc.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("digite o valor para deposito valido:");
                    double aux = sc.nextDouble();
                    c.depositar(aux);
                    System.out.println("Deposito realizado com sucesso:");
                    break;
                case 2:
                    System.out.println("digite o valor para saque valido:");
                    double saque = sc.nextDouble();
                    c.sacar(saque);
                    System.out.println("saque realizado com sucesso:");
                    break;
            }
        }while(a == 0); 
      
    }
    
}
