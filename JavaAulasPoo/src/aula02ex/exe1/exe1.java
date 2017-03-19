/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex.exe1;

import java.util.Scanner;

/**
 * 1) Faça um aplicativo que leia o valor do raio de um círculo como um inteiro (via Scanner
 * e imprima seu diâmetro, sua circunferência e sua área. Utilize o valor de ponto flutuante 
 * de 3.14159 para o valor de PI. Utilize as seguintes fórmulas (r é o raio):

Diâmetro = 2 * r

Circunferência = 2 * PI * r

Área = PI * r2
* 
 * @author magno
 */
public class exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //variavel scanner ensinada em sala.
        int raio = sc.nextInt();
        //calculos do exercicio
        double diamentro = 2 * raio;
        double pi = 3.14159; 
        double circuferencia =  2 * pi * raio;
        double area = pi * diamentro;
        System.out.printf("Diametro = %.2f\nCircuferencia = %.2f\nArea = %.2f\n", diamentro, circuferencia ,area);

    }
    
}
