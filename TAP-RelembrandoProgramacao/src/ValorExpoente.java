/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: determinar qual o menor valor de k necessário para que o valor da seguinte soma ultrapasse um número informado pelo usuário
*/
import java.util.Scanner;
public class ValorExpoente {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero= entrada.nextInt();
		int valor= entrada.nextInt();
		int i=0,soma=0;
		while(i<numero){
			if(soma>numero){
				break;
				
			}else
				soma+=Math.pow(valor, i);
			i++;
			
		}
		System.out.println(i);

	}

}
