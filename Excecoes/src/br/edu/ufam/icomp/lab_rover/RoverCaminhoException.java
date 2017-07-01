/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções RoverCaminhoException
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class RoverCaminhoException extends RoverException {
	private static final long serialVersionUID = 1L;
	public RoverCaminhoException(){
		this("Exceção geral de caminho do rover");
	}
	public RoverCaminhoException(String txt){
		super(txt);
	}
}
