/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao:informar o valor aproximado dessa série para a soma dos seus k primeiros termos
*/
import java.util.Scanner;
public class NumeroNeperiano {
	int fatorial(double num){
		int fat=1;
		for(int i=2;i<=num;i++)
			fat*=i;
	return fat;
			
	}
		
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double numero= entrada.nextDouble();
		NumeroNeperiano fat= new NumeroNeperiano();
		double soma=0;
		for(int i=0;i<numero;i++){
			soma+=(1.0/fat.fatorial(i));
		}
		System.out.printf("%.6f",soma);
	}

}
