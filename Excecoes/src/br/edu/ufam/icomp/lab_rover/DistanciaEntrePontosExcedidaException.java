/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 1 – Classes de Exceções DistanciaEntrePontosExcedidaException
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException {
	private static final long serialVersionUID = 1L;
	public DistanciaEntrePontosExcedidaException(){
		this("Distância máxima entre duas coordenadas vizinhas excedida");
	}
	public DistanciaEntrePontosExcedidaException(String txt){
		super(txt);
	}
}
