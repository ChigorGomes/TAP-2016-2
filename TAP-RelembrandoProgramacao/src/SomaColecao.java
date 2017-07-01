/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao:calcular a soma de uma coleção de valores digitados pelo usuário.
*/

import java.util.Scanner;
public class SomaColecao {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero= entrada.nextInt();
		int somaColecao=0;
		while(numero!=-1){
			somaColecao+=numero;
			numero= entrada.nextInt();
		}
		System.out.println(somaColecao);
	}

}
