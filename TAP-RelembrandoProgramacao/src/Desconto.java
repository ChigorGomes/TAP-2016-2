/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Desconto: Escreva um programa (classe Desconto) que lê o preço sem desconto de uma compra e imprime o valor a 
 * ser pago pelo cliente (com duas casas decimais).
*/
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double preco= entrada.nextDouble();
		double desconto;
		if(preco>=200){
			desconto= preco-(preco*5f)/100;
			System.out.printf("%.2f",desconto);
		}else
			System.out.printf("%.2f", preco);
		
	}

}
