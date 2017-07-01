import java.util.Calendar;

/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:4 de nov de 2016
*/
public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	
	
Aluno(){
		
}
	
Aluno(String nome,int matricula,int anoNascimento){
	this.nome=nome;
	this.matricula=matricula;
	this.anoNascimento= anoNascimento;
}

int getIdade(){
	int anoAtual= Calendar.getInstance().get(Calendar.YEAR);
	 return anoAtual-anoNascimento;
}

String getDescricao(){
	return nome+ " (mat="+matricula+", idade="+getIdade()+")";
}

}

