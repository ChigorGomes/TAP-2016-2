/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Data: 25/11/2016
 * Descrição: Questão 4 – Classe Carro
 * 
 */

package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro {
	protected String placa;
	
	public Carro(String placa){
		this.placa= placa;
	}
	
	public String getPlaca(){
		return placa;
	}
	
	public void setPlaca(String placa){
		this.placa= placa;
	}
}
