/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex.exemploAluno;

/**
 *
 * @author magno
 */
public class aluno {
    int ra;	
	String nome;
	double nota[];
	double media;
	
	aluno() {
		System.out.println("Construtor 1");
		this.nota = new double[4];
	}
	
	aluno(int ra, String nome) {
		System.out.println("Construtor 2");
		this.nota = new double[4];
		this.ra = ra;
		this.nome = nome;
	}
	
	void atribuiNota(double n1, double n2, double n3, double n4) {
		double soma = 0;
		this.nota[0] = n1;
		this.nota[1] = n2;
		this.nota[2] = n3;
		this.nota[3] = n4;

		for (int i=0; i<this.nota.length; i++) {
			soma+=this.nota[i];
		}
		this.media = soma/this.nota.length;
	}
	
	double getMedia() {
		return this.media;
	}	
    
}
