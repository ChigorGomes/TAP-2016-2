/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descri��o:Desenvolva um programa (classe SomaDigitos) que leia um n�mero inteiro a partir do teclado e exiba a soma dos d�gitos do n�mero.
*/
import java.util.Scanner;
public class SomaDigitos {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String numero= entrada.next();
		int soma = 0;
		for(int i=0;i<numero.length();i++){
			soma+= Character.getNumericValue((numero.charAt(i)));
		}
		System.out.println(soma);
	}

}
