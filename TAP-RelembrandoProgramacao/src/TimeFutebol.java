/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:19 de out de 2016
 * 
 * Descricao:Time de Futebol
*/
import java.util.Scanner;
public class TimeFutebol {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int[] numeroGolsPartida= new int[100];
		int[] numeroGolsAdversario= new int[100];
		int numeroVitorias=0,numeroEmpates=0,numeroDerrotas=0,i=0;
		
		numeroGolsPartida[i]= entrada.nextInt();
		while(numeroGolsPartida[i]!=-1){
			i++;
			numeroGolsPartida[i]= entrada.nextInt();
		}
		i=0;
		
		numeroGolsAdversario[i]= entrada.nextInt();
		while(numeroGolsAdversario[i]!=-1){
			i++;
			numeroGolsAdversario[i]= entrada.nextInt();
		}
		
		for(int j=0;numeroGolsAdversario[j]!=-1;j++){
			if(numeroGolsPartida[j]> numeroGolsAdversario[j]){
				numeroVitorias++;
			}else
				if(numeroGolsPartida[j]== numeroGolsAdversario[j]){
					numeroEmpates++;
				}else
					numeroDerrotas++;
		}
		
		System.out.printf("%d %d %d",numeroVitorias,numeroEmpates,numeroDerrotas);
		
	}
	

}
