/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição:Questão 3 – Classe Caminho
 * 
 */
package br.edu.ufam.icomp.lab_rover;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;
	
	public Caminho(int tamMax){
		this.caminho = new Coordenada[tamMax];
	}
 
	public int tamanho(){
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada)throws TamanhoMaximoExcedidoException,DistanciaEntrePontosExcedidaException{
		if(this.tamanho== this.caminho.length ) throw new TamanhoMaximoExcedidoException();	
		if(this.tamanho>0 && this.caminho[tamanho-1].distancia(coordenada)>15) throw new DistanciaEntrePontosExcedidaException();	
	
		this.caminho[tamanho]=coordenada;
		tamanho++;
	}


	public void reset(){
		for(int i=0;i<this.caminho.length;i++){
			this.caminho[i]= null;
		}
		this.tamanho=0;
	}
	
	public String toString(){
		String frase="Dados do caminho: \n";
		String frase2= "  - Quantidade de pontos: "+tamanho+"\n";
		String frase3= "  - Pontos: \n";
		for(int i=0;i<tamanho;i++){
			frase3+="   -> "+caminho[i].toString()+"\n";
		}
		return frase+frase2+frase3;
	}
}