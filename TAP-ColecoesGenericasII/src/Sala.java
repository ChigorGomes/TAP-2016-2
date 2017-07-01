/**@author Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:4 de nov de 2016
 * Descrição: Sala
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
			acesso="acessível";
		}else{
			acesso="não acessível";
		}
		return "Bloco " + bloco+", Sala "+ sala +" ("+capacidade+" lugares, "+acesso+")"; 
	}
	
}
