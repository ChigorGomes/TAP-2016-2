import java.util.Scanner;

public class AsciiArt {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int astericos;
		astericos= entrada.nextInt();
		
		for(int i=0;i<astericos*2;i++){
			for(int j=astericos;j>0;j--){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
