/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição: Crie uma classe em Java chamada ParImpar que fique lendo números inteiros do teclado até que o número -1 seja digitado. 
 * Para cada número, imprimir se ele é "PAR" ou "IMPAR".
*/
import java.util.Scanner;


public class ParImpar {

	public static void main(String[] args) {

			Scanner entrada= new Scanner(System.in);
			int numero= entrada.nextInt();
			while(numero!=-1){
				if(numero%2==0)
					System.out.println("PAR");
				else
					System.out.println("IMPAR");	
					
				numero= entrada.nextInt();
			}
			
	}

}
