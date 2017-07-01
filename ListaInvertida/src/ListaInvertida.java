/*
 * Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Descricao:Questão 1 – Classe ListaInvertida
 */

import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
	private Hashtable<String,LinkedList<String> > tabela;
	
	
	public ListaInvertida() {
		tabela= new Hashtable<String,LinkedList<String>>();
	}
	
	public boolean insere(String palavra, String documento){
		boolean condicao=false;
		
		
		LinkedList<String> atual= tabela.get(palavra);
		
		if(atual!=null){
			boolean aux= atual.contains(documento);
			if(aux== false){
				atual.addLast(documento);
				condicao=true;
			}else
				condicao= false;
		}else{
			LinkedList<String> novoDocumento= new LinkedList<String>();
			novoDocumento.add(documento);
			tabela.put(palavra, novoDocumento);
			
			condicao= true;
		}
		return condicao;
	}
		
	public LinkedList<String> busca(String palavra){
		LinkedList<String> novaTabela= tabela.get(palavra);
		
		return novaTabela;
	}
	
	public String toString(){
		return tabela.toString();
	}

}
