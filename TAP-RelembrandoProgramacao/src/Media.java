/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição: Crie uma classe em Java chamada Media que calcule e imprima, com duas casas decimais, 
 * a média aritmética de três números reais lidos do teclado. 
*/

import java.util.Scanner;


public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num1,num2,num3,media;
		num1= entrada.nextFloat();
		num2 = entrada.nextFloat();
		num3 = entrada.nextFloat();
		media=(num1+num2+num3)/3;
		System.out.printf("%.2f",media);

	}

}
