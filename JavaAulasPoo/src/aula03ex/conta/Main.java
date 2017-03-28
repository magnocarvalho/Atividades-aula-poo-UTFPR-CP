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
       
        Scanner sc = new Scanner(System.in);
        Scanner stringN = new Scanner(System.in); //scanner a mais foi necessario por causa de erro dentro do java caso de duvida retire esse scanner e untilize apenas o sc que vai da um bug na leitura do nextline:
        System.out.println("Digite numero da conta");
        int id = sc.nextInt();
        System.out.println("Digite saldo inicial");
        double inicial = sc.nextDouble();
        System.out.println("Digite nome do cliente");
        String nome = stringN.nextLine();
        Conta c = new Conta(id, nome, inicial);

        int a = 0;
        
        // do while utilizado para manipular diversas vezes o metodo; 
        do{
            String tostring = c.tostring();
            System.out.println(tostring); //D: O método toString serve para retornar uma String com os dados atuais da conta, em uma única linha (número - titular - saldo).
            System.out.println("\nPara depositos digite 1\nSacar digite 2\nPara conta 666 - digite 3\nexit 0\n");
            a = sc.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("Deposito para Conta numero: " + c.getNumero() + "\nCliente: " + c.getNomeTitula() + "\nSaldo atual: " + c.getSaldo());
                    System.out.println("digite o valor para deposito valido:");
                    double aux = sc.nextDouble();
                    c.depositar(aux);
                    System.out.println("Deposito realizado com sucesso:");
                    break;
                case 2:
                    System.out.println("Saque para Conta numero: " + c.getNumero() + "\nCliente: " + c.getNomeTitula() + "\nSaldo atual: " + c.getSaldo());
                    System.out.println("digite o valor para saque valido:");
                    double saque = sc.nextDouble();
                    c.sacar(saque);
                    System.out.println("saque realizado com sucesso:\n");
                    break;
                case 3:
                    c = new Conta(666);
                default:
                    System.out.println("Opção invalida\n");
            }
        }while(a != 0); 
      
    }
    
}
