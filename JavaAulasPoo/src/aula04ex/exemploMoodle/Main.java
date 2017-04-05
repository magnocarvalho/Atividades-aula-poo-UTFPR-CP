/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04ex.exemploMoodle;

/**
 *
 * @author magno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancia objetos
		Produto tenis = new Produto("Nike", 180, 2);
		
		// Variaveis auxiliares
		double preco_total;
		double preco_desconto;
		
		// Aplica cupom de desconto
		tenis.setDesconto(15);
		
		// Obtem os precos ajustados
		// Nao eh necessario fazer todas essas operacoes caso as responsabilidades tenham sido definidas adequadamente
		preco_total = tenis.getQuantidade()*tenis.getPreco();
		preco_desconto = preco_total - preco_total*(tenis.getDesconto()/100);
		
		System.out.println("Preco original: " + tenis.getPrecoTotal());
		System.out.println("Preco com desconto: " + tenis.getPrecoDesconto());
    }
    
}
