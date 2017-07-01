/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: calcular a média de várias coleções de valores digitados pelo usuário, com duas casas decimais
*/
import java.util.Scanner;
public class MediaColecoes {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numero,i=0;
		double soma = 0,media;
		numero= entrada.nextInt();
		while(numero!=-1){
			while(numero>0){
				soma+=numero;
				i++;
				numero= entrada.nextInt();
			}
			media=soma/i;
			System.out.printf("%.2f",media);
			media=soma=i=0;
			numero=entrada.nextInt();
			
		}
	}

}
