/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao:ler o teclado uma data no formato "ddmmaaaa" e imprimir essa data por extenso
*/
import java.util.Scanner;
public class DataExtenso {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String data;
		data= entrada.nextLine();
		String meses[]={"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		String dia = data.substring(0,2);
		String mes= data.substring(2,4);
		String ano= data.substring(4,8);
		int num= Integer.parseInt(mes);
		for(int i=0;i<=meses.length;i++){
			if(i==num)
				System.out.printf("%s de %s de %s",dia,meses[i-1],ano);
		}
		
	}

}
