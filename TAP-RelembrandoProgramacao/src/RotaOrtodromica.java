/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Distancia:Escreva um programa (classe RotaOrtodromica) em que o usu�rio digite a latitude e longitude de dois pontos na Terra em graus. 
 * Seu programa deve exibir a dist�ncia entre os pontos, na superf�cie da Terra, em quil�metros,
*/
import java.util.Scanner;
public class RotaOrtodromica {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double latitude1,longitude1,latitude2,longitude2;
		latitude1= entrada.nextDouble();
		longitude1= entrada.nextDouble();
		latitude2= entrada.nextDouble();
		longitude2= entrada.nextDouble();
		double raioTerra=6371f;
		double distancia= raioTerra* Math.acos(Math.sin(Math.toRadians(latitude1))*Math.sin(Math.toRadians(latitude2))+
				Math.cos(Math.toRadians(latitude1))*Math.cos(Math.toRadians(latitude2))*Math.cos(Math.toRadians(longitude1-longitude2)));
		System.out.printf("A distancia entre os pontos (%f, %f) e (%f, %f) e de %.2f km", latitude1,longitude1,latitude2,longitude2,distancia);
		
	}

}
