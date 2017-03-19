/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex.exe5;

import java.util.Scanner;

/**
 *5) 
 * Faça uma aplicação Java que receba do usuário uma frase. Identifique o tamanho da frase
 * e imprima esta frase tantas vezes quanto for a quantidade de caracteres.
 * Ex: para a frase: “programar em java”, ela deverá aparecer 17 vezes na tela, 
 * pois tem 17 caracteres (incluindo espaços).  
 * @author magno
 */
public class exe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicaton logic here
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();// lendo linha de caracteres do usuario
        int a = frase.length();//metodo para leitura de quantas letras a frase possui
        System.out.println("Frase possui total de " + a + " Letras;");
        for (int i = 0; i < a; i++)
        {
            System.out.println((1+i) + "-" +frase);//imprimindo resultado 
        }
    }
    
}
