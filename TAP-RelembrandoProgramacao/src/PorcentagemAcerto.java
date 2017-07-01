/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:24 de out de 2016
 * 
 * Descricao: Porcentagem de Acerto
*/

import java.util.Scanner;
public class PorcentagemAcerto {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int resposta[]= new int[100];
		int gabarito[]= new int[100];
		double porcentagem=0.0;
		double acertos=0;
		int i=0;
		resposta[i]= entrada.nextInt();
			while(resposta[i]!=-1){
			i++;
			resposta[i]= entrada.nextInt();
			}
		i=0;
		
		gabarito[i]= entrada.nextInt();
			while(gabarito[i]!=-1){
			i++;
			gabarito[i]=entrada.nextInt();
			}
			
			for(int j=0;resposta[j]!=-1;j++){
				if(resposta[j]==gabarito[j]){
					acertos++;
				}	
			}
		
		porcentagem= (acertos*100)/i;
		System.out.printf("%.2f",porcentagem);
	}
}
