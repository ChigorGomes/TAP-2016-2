/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: mostrar o nome do tipo de um triangulo
*/
import java.util.Scanner;
public class TipoTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ladoA= entrada.nextInt();
		int ladoB= entrada.nextInt();
		int ladoC= entrada.nextInt();
		if(ladoA>0 & ladoB>0 & ladoC>0){
			if(ladoA+ladoB>ladoC & ladoA+ladoC>ladoB){
				if(ladoA==ladoB & ladoA==ladoC & ladoB==ladoC)
					System.out.println("equilatero");
				else
					if(ladoA==ladoB & ladoB!=ladoC || ladoA==ladoC & ladoC!=ladoB)
						System.out.println("isosceles");
					else
						if(ladoA!=ladoB & ladoB!=ladoC & ladoA!=ladoC)
							System.out.println("escaleno");
			}else
				System.out.println("invalido");
		}
		else
			System.out.println("invalido");
		
	}

}
