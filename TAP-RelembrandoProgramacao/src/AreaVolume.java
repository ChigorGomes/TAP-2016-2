/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição:O programa deverá mostrar a área de um círculo com o raio  e o volume de uma esfera com raio;
 *  
*/
import java.util.Scanner;
public class AreaVolume {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double raio= entrada.nextDouble();
		double areaCirculo,volumeEsfera;
		areaCirculo=Math.PI*Math.pow(raio, 2.0);
		volumeEsfera=(4.0/3.0)*Math.PI*Math.pow(raio, 3.0);
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n",raio,areaCirculo);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n",raio,volumeEsfera);
	}

}
