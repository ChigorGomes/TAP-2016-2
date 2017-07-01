/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:4 de nov de 2016
*/

public class Professor {
	String titulacao;
	String nome;
	int matricula;
	
	Professor(){
		
	}
	
	Professor(String titulacao,String nome,int matricula){
		this.titulacao= titulacao;
		this.nome= nome;
		this.matricula= matricula;
	}
	
	String getDescricao(){
		return "Prof. " + titulacao+" " + nome + " -mat " + matricula;
	}
}
