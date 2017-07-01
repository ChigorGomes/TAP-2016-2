import java.util.Scanner;

public class PinturaMuro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precoPintura;
		System.out.println("Digite o preco da pintura: ");
		precoPintura= entrada.nextDouble();
		double valorTotal=0;
		valorTotal=(12*3*precoPintura)+100;
		System.out.printf("%.1f\n",valorTotal);
	}

}
