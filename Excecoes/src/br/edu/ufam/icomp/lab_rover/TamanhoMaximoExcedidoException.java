/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções TamanhoMaximoExcedidoException
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException{
	private static final long serialVersionUID = 1L;
	public TamanhoMaximoExcedidoException(){
		this("Quantidade máxima de coordenadas excedida");
	}
	public TamanhoMaximoExcedidoException(String txt){
		super(txt);
	}
}
