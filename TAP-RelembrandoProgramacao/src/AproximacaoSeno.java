

/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descricao: Aproximação do Seno
*/
import java.util.Scanner;
public class AproximacaoSeno {

	double fatorial(int num){
		int fat=1;
		for(int i=2;i<=num;i++){
			fat*=i;
		}
			
		return fat;	
	}


	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		AproximacaoSeno fat= new AproximacaoSeno();
		double angulo;
		double termos;
		angulo= entrada.nextDouble();
		termos=entrada.nextDouble();
		double soma=0.0;
		for(int i=0;i<termos;i++){
			soma+=(Math.pow(-1.0, i)/fat.fatorial(2*i+1))*(Math.pow(Math.toRadians(angulo), 2*i+1));
			
			System.out.printf("%.10f\n",soma);
		}
		
		
	}

}
