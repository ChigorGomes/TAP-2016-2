/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções RoverException
 * 
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class RoverException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public RoverException(){
		this("Exceção geral do rover");
	}
	
	public RoverException(String txt){
		super(txt);
	}
}
