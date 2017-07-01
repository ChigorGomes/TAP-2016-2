/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição:Crie uma classe em Java chamada RaizQuadrada que calcule e imprima a raiz quadrada de um número inteiro lido do teclado.
 * Sua saída deverá ter 4 casas decimais.
*/
import java.util.Scanner;



public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero= entrada.nextInt();
		float raiz= (float) Math.sqrt(numero);
		System.out.printf("%.4f", raiz);
	}

}
