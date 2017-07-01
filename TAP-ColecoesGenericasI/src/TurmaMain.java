/**
 * 
 * @author Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descricao: Turma Main
 *
 */

public class TurmaMain {

	public static void main(String[] args) {
		Aluno aluno= new Aluno("Emmet L. Brown",7714,1996);
		Professor prof= new Professor("Dr.","Hubert J. Farnsworth",2208);
		System.out.println(aluno.getDescricao());
		System.out.println(prof.getDescricao());
	
	
	}

}
