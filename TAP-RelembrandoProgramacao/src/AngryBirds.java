/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: informar se o pássaro atingirá (saída 1) ou não o porco (saída 0).
*/

import java.util.Scanner;
public class AngryBirds {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double velocidadeInicial,angulo,distanciaHorizontal,alcanceMaximo;
		velocidadeInicial= entrada.nextDouble();
		angulo= Math.toRadians( entrada.nextDouble());
		distanciaHorizontal= entrada.nextDouble();
		double gravidade= 9.8;
		
		alcanceMaximo=(Math.pow(velocidadeInicial, 2)*Math.sin(2*angulo))/gravidade;
		
		if(Math.abs(alcanceMaximo-distanciaHorizontal)>0.1){
			System.out.println("0");
		}else
			System.out.println("1");
		
	}

}
