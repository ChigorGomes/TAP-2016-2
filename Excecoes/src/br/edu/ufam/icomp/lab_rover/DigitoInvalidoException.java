/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções DigitoInvalidoException
 * 
 */

package br.edu.ufam.icomp.lab_rover;

public class DigitoInvalidoException extends RoverCoordenadaException {
	private static final long serialVersionUID = 1L;
	public DigitoInvalidoException(){
		this("Digito da coordenada inválido");
		
	}
	public DigitoInvalidoException(String txt){
		super(txt);
	}
}
