import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double valorHora;
		int quantidadeHoras;
		System.out.println("Digite o valor da hora: ");
		valorHora = entrada.nextDouble();
		System.out.println("Digite a quantidade de horas: ");
		quantidadeHoras= entrada.nextInt();
		double salarioBruto,impostoRenda,inss,totalDesconto,salarioLiquido;
		salarioBruto=valorHora*quantidadeHoras;
		impostoRenda= (salarioBruto*11)/100;
		inss=(salarioBruto*8)/100;
		totalDesconto= impostoRenda+inss;
		salarioLiquido= salarioBruto-totalDesconto;
		System.out.printf("Salario bruto: R$%.2f\n",salarioBruto);
		System.out.printf("IR: R$%.2f\n",impostoRenda);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", totalDesconto);
		System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
	}

}
