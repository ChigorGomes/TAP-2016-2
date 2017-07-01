/*Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18 de out de 2016
 * 
 * Descrição: Calcular e mostrar o salario bruto;
 * o pagamento do imposto de renda,inss;
 * desconto do salario de fernando;
 * salario liquido de fernando.
*/

import java.util.Scanner;
public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double valorHora= entrada.nextDouble();
		int quantidadeHoras= entrada.nextInt();
		double salarioBruto,impostoRenda,inss,totalDesconto,salarioLiquido;
		salarioBruto=valorHora*quantidadeHoras;
		impostoRenda= (salarioBruto*11)/100;
		inss=(salarioBruto*8)/100;
		totalDesconto=impostoRenda+inss;
		salarioLiquido= salarioBruto- totalDesconto;
		System.out.printf("Salario bruto: R$%.2f\n",salarioBruto);
		System.out.printf("IR: R$%.2f\n",impostoRenda);
		System.out.printf("INSS: R$%.2f\n",inss);
		System.out.printf("Total de descontos: R$%.2f\n",totalDesconto);
		System.out.printf("Salario liquido: R$%.2f\n",salarioLiquido);
	}

}
