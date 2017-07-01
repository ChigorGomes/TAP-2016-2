
/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição: Converter uma temperatura em graus celsius em Fahrenheit 
*/
import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		float graus= entrada.nextFloat();
		float fahrenheit=(9*graus)/5+32;
		System.out.printf("%.1f", fahrenheit);
	}

}
