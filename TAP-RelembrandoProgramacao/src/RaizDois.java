import java.util.Scanner;

/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:27 de out de 2016
 * 
 * Descricao: Fração Contínua: Raiz Quadrada de Dois
*/
public class RaizDois {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double numero= entrada.nextDouble();
		double valorParcial=0;
		
		for(int i=1;i<numero;i++){
			valorParcial+= 1+1/(2/numero);
			System.out.println(valorParcial);
		}
	}

}
