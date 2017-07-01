/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: Escreva programa em Java (classe OperacoesInteiros) que leia do teclado um vetor de inteiros. 
 * Em seguida, o programa deve imprimir na ordem:
*/
import java.util.ArrayList;
import java.util.Scanner;
public class OperacoesInteiros {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int valor= entrada.nextInt();
		int quantidadePar = 0,quantidadeImpar = 0;
		int i=0,soma=0;
		double media=0f;
		ArrayList<Integer> lista= new ArrayList();
		while(valor!=-1){
			while(valor>0){
				lista.add(valor);
				soma+=lista.get(i);
			
				if(lista.get(i)%2==0)
					quantidadePar++;
				else
					quantidadeImpar++;
				
				i++;
				valor= entrada.nextInt();			
			}
			int maior= lista.get(0);
			int menor=lista.get(0);
			i=0;
			while(i<lista.size()){
				if(lista.get(i)>maior){
					maior=lista.get(i);
				if(lista.get(i)<menor){
					menor=lista.get(i);
				}
					
				}else	
					i++;	
			}
			
		
		System.out.println(lista.size());
		System.out.println(quantidadePar);
		System.out.println(quantidadeImpar);
		System.out.println(soma);
		media=(double)(soma)/lista.size();
		lista.clear();	
		System.out.printf("%.2f\n", media);
		System.out.println(maior);
		System.out.println(menor);
		quantidadeImpar=quantidadePar=i=0;
		soma=0;
		media=0f;
		valor= entrada.nextInt();
			
		}
		
	}

}
