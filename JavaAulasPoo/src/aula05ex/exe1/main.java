/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe1;


import java.util.Scanner;


/**
 *
 * @author magno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X, Y, Z e W");
        int _x = sc.nextInt();
        int _y = sc.nextInt();
        int _z = sc.nextInt();
        int _w = sc.nextInt();
        
        Ponto4D p4 = new Ponto4D(_x, _y, _z, _w);
        
        System.out.println("valores x, y, z, w");
        System.out.println(p4.getX());
        System.out.println(p4.getY());
        System.out.println(p4.getZ());
        System.out.println(p4.getW());
        
        
         
       
        
        
    }
    
}
