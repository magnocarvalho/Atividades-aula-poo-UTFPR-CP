/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ex.aluno;

public class Aluno {
	private int ra;	
	private String nome;
	private double nota[];
	private double media;
	
	Aluno() {
		System.out.println("Construtor 1");
		this.nota = new double[4];
	}
	
	Aluno(int ra, String nome) {
		System.out.println("Construtor 2");
		this.nota = new double[4];
		this.ra = ra;
		this.nome = nome;
	}
	
	void atribuiNota(double n1, double n2, double n3, double n4) {
		double soma = 0;
                this.getNota()[0] = n1;
                this.getNota()[1] = n2;
                this.getNota()[2] = n3;
                this.getNota()[3] = n4;

		for (int i=0; i<this.getNota().length; i++) {
			soma+=this.getNota()[i];
		}
                this.setMedia(soma/this.getNota().length);
	}
	
		

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota
     */
    public double[] getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double[] nota) {
        this.nota = nota;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
    
    public double getMedia() {
		return this.media;
	}
	
   /**
    * b) Um método para imprimir 
    * todos os dados do aluno - RA, nome, suas 4 notas
    * e sua média final em uma única linha. 
    */
    public void imprimirNota(int ra)
    {
        System.out.println("RA: "+ ra + ", Aluno: " + this.getNome() + "notas "+ this.getNota()[0] +" " + "notas "+ this.getNota()[1] +" " +"notas "+ this.getNota()[2] +" " +"notas "+ this.getNota()[4] +" Teve media: " + this.getMedia() );
    }
}
