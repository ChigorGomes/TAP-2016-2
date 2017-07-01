/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao:calcular o volume de ar (opção 1) ou o volume de combustível no tanque (opcao 2)
*/

import java.util.Scanner;
public class TanqueCombustivel {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double raio,altura,volumeEsfera,volumeCalota = 0;
		int opcao;
		raio= entrada.nextDouble();
		altura= entrada.nextDouble();
		opcao= entrada.nextInt();
		volumeCalota= (Math.PI/3.0)*Math.pow(altura,2)*(3*raio-altura);
		if(opcao==1){
			System.out.printf("%.4f", volumeCalota);
		}else
			if(opcao==2){
				volumeEsfera=((4.0/3.0)*Math.PI*Math.pow(raio, 3)) - volumeCalota;
				System.out.printf("%.4f", volumeEsfera);
			}
			
			
		
	}

}
