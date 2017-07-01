/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções CoordenadaNegativaException
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class CoordenadaNegativaException extends RoverCoordenadaException{
	private static final long serialVersionUID = 1L;

	public CoordenadaNegativaException(){
		this("Coordenada com valor negativo");
	}
	
	public CoordenadaNegativaException(String txt){
		super(txt);
	}
}
