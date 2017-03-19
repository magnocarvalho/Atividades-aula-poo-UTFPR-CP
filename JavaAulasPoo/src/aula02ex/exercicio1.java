/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02ex;

import java.util.Scanner;

/**
 *
 * @author magno carvalho
 * 1) Faça um aplicativo que leia o valor do raio de um círculo como um inteiro (via Scanner
 * e imprima seu diâmetro, sua circunferência e sua área. Utilize o valor de ponto flutuante 
 * de 3.14159 para o valor de PI. Utilize as seguintes fórmulas (r é o raio):

Diâmetro = 2 * r

Circunferência = 2 * PI * r

Área = PI * r2
 */
public class exercicio1 {
    
    Scanner sc = new Scanner(System.in);
    int raio = sc.nextInt();
    double diamentro = 2 * raio;
    double pi = 3.14159; 
    double circuferencia = 2 * pi * raio;
    double area = pi * diamentro;
    
}
