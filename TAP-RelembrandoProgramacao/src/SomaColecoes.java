/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao:calcular a soma de várias coleções de valores digitados pelo usuário
*/

import java.util.Scanner;
public class SomaColecoes {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int somaColecao=0,numero;
		numero= entrada.nextInt();
		while(numero!=-1){
			while(numero>0){
				somaColecao+=numero;
				numero= entrada.nextInt();
			}
			System.out.println(somaColecao);
			somaColecao=0;
			numero= entrada.nextInt();
			
		}
		
	}

}
