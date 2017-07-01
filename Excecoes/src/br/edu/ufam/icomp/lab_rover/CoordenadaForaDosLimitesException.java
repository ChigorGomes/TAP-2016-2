/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções CoordenadaForaDosLimitesException
 * 
 */

package br.edu.ufam.icomp.lab_rover;

public class CoordenadaForaDosLimitesException extends RoverCoordenadaException{
	private static final long serialVersionUID = 1L;
	public CoordenadaForaDosLimitesException(){
		this("Coordenada com valores fora dos limites");
	}
	public CoordenadaForaDosLimitesException(String txt){
		super(txt);
	}
}
