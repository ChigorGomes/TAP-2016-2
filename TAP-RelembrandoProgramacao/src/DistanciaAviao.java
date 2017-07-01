/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:27 de out de 2016
 * 
 * Descricao: Distância Percorrida pelo Avião
*/
import java.util.Scanner;

public class DistanciaAviao {

	public static void main(String[] args) {
		int distanciaAviao[][] = { { -1, 111, 222, 333, 444, 555, 666, 777 }, { 111, 0, 2, 11, 6, 15, 11, 1 },
				{ 222, 2, 0, 7, 12, 4, 2, 15 }, { 333, 11, 7, 0, 11, 8, 3, 13 }, { 444, 6, 12, 11, 0, 10, 2, 1 },
				{ 555, 15, 4, 8, 10, 0, 5, 13 }, { 666, 11, 2, 3, 2, 5, 0, 14 }, { 777, 1, 15, 13, 1, 13, 14, 0 }, };
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int coluna = 0, linha = 0;
		int aux;
		int x = 0, l = 0;
		int[] valor = new int[100];
		
		
		
		valor[x]= entrada.nextInt();
		aux = valor[x];
		while (valor[x] != -1) {
			x++;
			valor[x]= entrada.nextInt();
		}
		

		while (valor[l] != -1 && valor[l + 1] != -1) {
			for (coluna = 0; coluna < 8; coluna++) {
				if (distanciaAviao[0][coluna] == valor[l]) {
					break;
				}
			}
			for (linha = 0; linha < 8; linha++) {
				if (distanciaAviao[linha][0] == valor[l + 1]) {
					break;
				}
			}
			soma += distanciaAviao[linha][coluna];
			l++;

		}

			System.out.println(soma);
		}
	}

