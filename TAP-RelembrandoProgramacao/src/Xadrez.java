/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descri��o: Crie uma classe em Java chamada Xadrez que leia a quantidade de linhas do usu�rio e imprima o padr�o abaixo (para entrada 6).
*/
import java.util.Scanner;


public class Xadrez {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int linhas= entrada.nextInt();
		for(int i=0;i<linhas;i++){
			for(int j=0;j<linhas;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
			if(i%2==0)
				System.out.print(" ");
			else
				System.out.print("");
				
		}
	}

}
