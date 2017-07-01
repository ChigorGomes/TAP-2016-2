

/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:27 de out de 2016
 * 
 * Descricao: Mediana de uma Coleção
*/
import java.util.Scanner;
public class Mediana {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int[] vetor= new int[100];
		int numero= entrada.nextInt();
		double mediana=0;
		int i=0;
		
		while(numero!=-1){
			vetor[i]=numero;
			i++;
			numero= entrada.nextInt();
		}
		if(i%2!=0){
			i=i/2;
			mediana= vetor[i];
		}else{
			i=i/2;
			mediana=(vetor[i]+vetor[i-1])/2.0;
		}
		
		System.out.printf("%.1f",mediana);
	}
}
