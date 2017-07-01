/*
 * Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descricao:Questão 2 – Classe GoogleMain
 */
public class GoogleMain {

	public static void main(String[] args) {
		ListaInvertida lista= new ListaInvertida();
		lista.insere("force","document1.txt, document2.txt, document3.txt");
		lista.insere("always",	"document1.txt");
		lista.insere("one"	,"document3.txt");
		lista.insere("is",	"document2.txt, document3.txt");
		lista.insere("be",	"document1.txt");
		lista.busca("one");
		lista.toString();
	}

}
