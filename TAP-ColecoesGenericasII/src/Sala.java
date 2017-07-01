/**@author Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:4 de nov de 2016
 * Descri��o: Sala
*/
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	Sala(){
		
	}
	
	Sala(int bloco,int sala,int capacidade, boolean acessivel){
		this.bloco= bloco;
		this.sala= sala;
		this.capacidade= capacidade;
		this.acessivel= acessivel;
	}
	
	String getDescricao(){
		String acesso=null;
		if(acessivel==true){
			acesso="acess�vel";
		}else{
			acesso="n�o acess�vel";
		}
		return "Bloco " + bloco+", Sala "+ sala +" ("+capacidade+" lugares, "+acesso+")"; 
	}
	
}
