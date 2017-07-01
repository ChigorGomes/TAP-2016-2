/**
 * @author Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descrição: Turma
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos= new ArrayList<Aluno>();
	
	Turma(String disciplina, int ano,int semestre, Professor professor){
		this.disciplina= disciplina;
		this.ano= ano;
		this.semestre= semestre;
		this.professor= professor;
	}
	
void addAluno(Aluno aluno){
	if(getAluno(aluno.matricula)==null){
		alunos.add(aluno);
	}
}
	Aluno getAluno(int matricula){
		Iterator<Aluno> i=  alunos.iterator();
		while(i.hasNext()){
			Aluno alunoAtual= i.next();
			if(alunoAtual.matricula== matricula ){
				return alunoAtual;
			}
		}
		return null;
	}
	
	
	double getMediaIdade(){
		Iterator<Aluno> i= alunos.iterator();
		double media=0;
		double soma=0;
		int count=0;
		while(i.hasNext()){
			Aluno alunoAtual= i.next();
			soma+= alunoAtual.getIdade();
			count++;
		}
		media= soma/count;
		return media;
		
	}
	String getDescricao(){
		Iterator<Aluno> i= alunos.iterator();
		String turma= "Turma " + disciplina + "- " + ano+"/"+semestre +" (" + professor.getDescricao()+"):"+"\n";
		int j=0;
		while(i.hasNext()){
			Aluno alunoAtual= i.next();
			j++;
			turma+= "- Aluno " + j + ": " + alunoAtual.getDescricao() + "\n"; 
		}
		return turma;
				
	}
	
}
