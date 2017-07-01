/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções RoverCoordenadasException
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class RoverCoordenadaException extends RoverException{
	private static final long serialVersionUID = 1L;

	public RoverCoordenadaException(){
		this("Exceção geral de coordenada do rover");
	}
	
	public RoverCoordenadaException(String txt){
		super(txt);
	}
}
