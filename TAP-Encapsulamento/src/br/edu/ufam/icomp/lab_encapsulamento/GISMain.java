/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Data: 25/11/2016
 * Descrição: Questão 6  – CClasse GISMain
 * 
 */
package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		Localizavel loca[]= new Localizavel[2];
		Celular celular = new Celular(3, 5, 999999999);
		CarroLuxuoso carro= new CarroLuxuoso("AAAAAA");
		
		loca[0]= celular;
		loca[1]= carro;
		
		for(int i=0;i<loca.length;i++){
			System.out.println(loca[i].getPosicao());
		}

	}

}
