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
        private double frequencia;
	
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
     * @return the frequencia
     */
    public double getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    
   /**
    * b) Um método para imprimir 
    * todos os dados do aluno - RA, nome, suas 4 notas
    * e sua média final em uma única linha. 
    */
    public void imprimirNota(int ra)
    {
        ra = this.getRa();
        System.out.println("RA: "+ ra + ", Aluno: " + this.getNome() + "notas "+ this.getNota()[0] +" " + "notas "+ this.getNota()[1] +" " +"notas "+ this.getNota()[2] +" " +"notas "+ this.getNota()[3] +" Teve media: " + this.getMedia() );
    }

    /**
     * c) Acrescente um atributo do tipo double na classe Aluno chamado frequência, 
     * que deve ser uma escala de 0 a 100 (em percentual). Em seguida crie um método 
     * de retorno booleano para verificar se o aluno foi aprovado ou reprovado. 
     * Lembrando que para o aluno ser aprovado, sua média deve ser superior a 6.0 e sua 
     * frequência acima de 75%.
     * 
     */
    public boolean verificarFrequencia(double frequencia, double media )
    {
        frequencia = this.getFrequencia();
        media = this.getMedia();
        
        if(frequencia > 75 && media > 6 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
