/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição: Calcular a area do triangulo
*/

import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int ladoA,ladoB,ladoC;
		ladoA= entrada.nextInt();
		ladoB= entrada.nextInt();
		ladoC= entrada.nextInt();
		
		if((ladoA+ladoB)>ladoC){
			double s=(ladoA+ladoB+ladoC)/2;
			double area= Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
			System.out.printf("%.2f",area);
		}else
			System.out.println("Triangulo invalido");
		
	}

}
