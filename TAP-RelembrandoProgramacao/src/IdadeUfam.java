/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição:Crie uma classe em Java chamada IdadeUfam que leia o ano atual do teclado e imprima "A UFAM tem X anos de fundacao",
 *  trocando o X pela idade da UFAM.
*/

import java.util.Scanner;


public class IdadeUfam {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anoAtual= entrada.nextInt();
		int idadeUfam = anoAtual - 1909;
		System.out.printf("A Ufam tem %d anos de fundacao",idadeUfam);

	}

}
