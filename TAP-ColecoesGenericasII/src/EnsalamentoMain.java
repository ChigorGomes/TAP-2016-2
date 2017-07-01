/**@author: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:4 de nov de 2016
*/
public class EnsalamentoMain {

	public static void main(String[] args) {
		
		Turma turma = new Turma("Técnicas de Programação", "Horácio Fernandes", 25, true);
		turma.addHorario(1);
		turma.addHorario(15);
		turma.addHorario(29);
		System.out.println(turma.getDescricao()+"\n");
		Turma turma2= new Turma("Turma: Laboratório de Programação C", "Edson Nascimento", 25, true);
		turma2.addHorario(2);
		turma2.addHorario(14);
		turma.addHorario(28);
		System.out.print(turma2.getDescricao());
		

	}
}