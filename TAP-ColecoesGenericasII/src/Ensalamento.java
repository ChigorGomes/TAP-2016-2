
/**@author: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:17 de nov de 2016
 * Descrição: Ensalamento
*/
import java.util.ArrayList;
import java.util.Iterator;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	int espacoLivre;

	Ensalamento() {

	}

	void addSala(Sala sala) {
		salas.add(sala);
	}

	void addTurma(Turma turma) {
		turmas.add(turma);
	}

	Sala getSala(Turma turma) {
		Sala auxSala = null;

		for (TurmaEmSala auxEnsa : this.ensalamento) {
			if (auxEnsa.turma == turma) {
				auxSala = auxEnsa.sala;
				break;
			}

		}
		return auxSala;
	}

	boolean salaDisponivel(Sala sala, int horario) {
		boolean disponivel = true;
		Iterator<TurmaEmSala> auxEn = ensalamento.iterator();
		TurmaEmSala auxEnsa;
		Turma auxTurma;

		while (auxEn.hasNext()) {
			auxEnsa = auxEn.next();

			if (sala == auxEnsa.sala) {
				auxTurma = auxEnsa.turma;
				ArrayList<Integer> auxHorarios = auxTurma.horarios;
				Iterator<Integer> iterator = auxHorarios.iterator();
				Integer aux;

				while (iterator.hasNext()) {
					aux = iterator.next();
					if (horario == aux) {
						return false;
					}
				}
			}
		}
		return disponivel;
	}

	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		Iterator<Integer> iterator = horarios.iterator();
		Integer auxHorario;
		boolean status = true;
		while (iterator.hasNext()) {
			auxHorario = iterator.next();
			status = salaDisponivel(sala, auxHorario);
			if (status == false) {
				return status;
			}
		}
		return status;

	}

	boolean alocar(Turma turma, Sala sala) {
		TurmaEmSala emSala = new TurmaEmSala();

		if ((turma.acessivel == sala.acessivel) && (turma.numAlunos <= sala.capacidade)
				&& (salaDisponivel(sala, turma.horarios) == true)) {
			emSala.sala = sala;
			emSala.turma = turma;
			ensalamento.add(emSala);
			this.espacoLivre += sala.capacidade - turma.numAlunos;
			return true;
		} else if ((turma.acessivel == false) && (turma.numAlunos <= sala.capacidade)
				&& (salaDisponivel(sala, turma.horarios) == true)) {
			emSala.sala = sala;
			emSala.turma = turma;
			ensalamento.add(emSala);
			this.espacoLivre += sala.capacidade - turma.numAlunos;
			return true;
		} else {
			return false;
		}
	}

	void alocarTodas() {
		ArrayList<Sala> salas = this.salas;
		ArrayList<Turma> turmas = this.turmas;

		Iterator<Turma> i = turmas.iterator();

		Iterator<Sala> j = salas.iterator();

		while (i.hasNext()) {
			Turma turmaAtual = i.next();
			j = salas.iterator();
			while (j.hasNext()) {
				Sala salaAtual = j.next();

				if (alocar(turmaAtual, salaAtual) == true) {
					break;
				}

			}

		}

	}

	int getTotalTurmasAlocadas() {
		return ensalamento.size();
	}

	int getTotalEspacoLivre() {
		return espacoLivre;
	}

	String relatorioResumoEnsalamento() {
		String frase = "Total de Salas: " + salas.size() + "\nTotal de Turmas: " + turmas.size() + "\nTurmas Alocadas: "
				+ ensalamento.size() + "\nEspaços Livres: " + getTotalEspacoLivre();
		;
		return frase;
	}

	String relatorioTurmasPorSala() {
		Iterator<Sala> auxSala = salas.iterator();
		Iterator<TurmaEmSala> iterador = ensalamento.iterator();
		String frase = relatorioResumoEnsalamento() + "\n";

		while (auxSala.hasNext()) {
			Sala salaAtual = auxSala.next();
			frase += "\n--- " + salaAtual.getDescricao() + " ---\n\n";
			iterador = ensalamento.iterator();
			while (iterador.hasNext()) {
				TurmaEmSala atual2 = iterador.next();
				if (salaAtual.sala == atual2.sala.sala) {
					frase += atual2.turma.getDescricao() + "\n\n";
				}
			}
		}
		return frase;
	}

	String relatorioSalasPorTurma() {

		String frase = relatorioResumoEnsalamento() + "\n\n";
		Iterator<Turma> itera = this.turmas.iterator();

		while (itera.hasNext()) {
			Turma turmaAtual = itera.next();

			frase += turmaAtual.getDescricao() + '\n';

			String frase2 = "Sala: SEM SALA\n\n";
			for (TurmaEmSala ensalamentoAtual : this.ensalamento) {
				Turma turmaCorrente = ensalamentoAtual.turma;
				if (turmaCorrente == turmaAtual) {
					if (ensalamentoAtual.sala != null) {
						frase2 = "Sala: " + ensalamentoAtual.sala.getDescricao() + "\n\n";
						break;
					}
				}
			}
			frase += frase2;
		}

		return frase;
	}
}
