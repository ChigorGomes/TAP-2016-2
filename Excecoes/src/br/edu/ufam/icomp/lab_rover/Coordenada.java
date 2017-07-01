/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 2 – Classes Coordenada
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX,int posY,int digito) throws CoordenadaNegativaException,CoordenadaForaDosLimitesException,DigitoInvalidoException{
		this.posX= posX;
		this.posY= posY;
		this.digito= digito;
		if(posX<0 || posY<0) throw new CoordenadaNegativaException();	
		if((posX<0 || posX>30000)) throw new CoordenadaForaDosLimitesException();
		if((posY<0 || posY>30000)) throw new CoordenadaForaDosLimitesException();
		if(digito<0 & digito>9)throw new DigitoInvalidoException();
		if((posX+posY)%10 !=digito) throw new DigitoInvalidoException();
		
		
			
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public double distancia(Coordenada coordenada){
		double ponto= Math.sqrt(Math.pow(coordenada.posX-posX, 2)+Math.pow(coordenada.posY-posY, 2));
		return ponto;
	}
	
	public String toString(){
		return posX+", "+posY;
	}
	
}
