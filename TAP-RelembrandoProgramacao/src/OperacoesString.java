/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:24 de out de 2016
 * 
 * Descricao: Operações Básicas em uma String
*/
import java.util.Scanner;
public class OperacoesString {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String palavra= entrada.nextLine();
		int tamanhoPalavra= palavra.length();
		System.out.println(tamanhoPalavra);
		System.out.println(palavra.charAt(0));
		System.out.println(palavra.charAt(tamanhoPalavra-1));
		System.out.println(palavra.toUpperCase());
		System.out.println(palavra.toLowerCase());
		System.out.println(palavra.replace('a', 'e'));
		int cont=0;
		for(int i=0;i<palavra.length();i++){
			if(i%2==0)
				System.out.print(palavra.charAt(i));
			if(palavra.charAt(i)=='a' || palavra.charAt(i)=='A' ||
					palavra.charAt(i)=='e' || palavra.charAt(i)=='E' ||
					palavra.charAt(i)=='i' || palavra.charAt(i)=='I' || 
					palavra.charAt(i)=='O' || palavra.charAt(i)=='o' ||
					palavra.charAt(i)=='u' || palavra.charAt(i)=='U')
				cont++;
		}
			System.out.println("\n"+cont);

	
	}

}
