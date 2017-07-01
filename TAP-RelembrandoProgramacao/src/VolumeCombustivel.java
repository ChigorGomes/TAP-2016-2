/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:27 de out de 2016
 * 
 * descricao: Volume de Combustível
*
*/
import java.util.Scanner;
public class VolumeCombustivel {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double alturaTotal, nivelCombustivel,raioBojos,volume = 0;
		alturaTotal= entrada.nextDouble();
		nivelCombustivel= entrada.nextDouble();
		raioBojos= entrada.nextDouble();
		
		if(nivelCombustivel<0 | alturaTotal<0 | raioBojos<0){
			volume=-1;
		}else{
			if(nivelCombustivel<raioBojos){
				volume=(1.0/3)*Math.PI*Math.pow(nivelCombustivel, 2)*3*(raioBojos-nivelCombustivel);
			}else{
				if(nivelCombustivel<alturaTotal - raioBojos){
					volume=(2.0/3)*Math.PI*Math.pow(raioBojos, 3)+Math.PI*Math.pow(raioBojos, 2)*(nivelCombustivel-raioBojos);
				}else{
					if(nivelCombustivel<=alturaTotal){
						volume=(4.0/3)*Math.PI*Math.pow(raioBojos, 3)+Math.PI*Math.pow(raioBojos, 2)*(alturaTotal-2*raioBojos)-
								(1.0/3)*Math.PI*Math.pow(alturaTotal-nivelCombustivel, 2)*(3*raioBojos-alturaTotal+nivelCombustivel);
					}else{
						volume=-1;
					}
						
				}
					
			}
				
		}
			
			System.out.printf("%.3f",volume);
	}
	

}
