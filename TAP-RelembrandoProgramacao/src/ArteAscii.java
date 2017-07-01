/**
 * Nome: Cicero Higor Gomes de Sousa 
 * Matricula: 21550190
 * Data:18/10/2016
 * 
 * Descricao:Escreva um programa (classe ArteAscii) que imprima uma figura 
 * semelhante à representada abaixo, a partir da leitura do número de asteriscos
 * presentes na base. Por exemplo, para uma entrada igual a 5, o resultado 
 * produzido será igual ao da figura abaixo.
 */

import java.util.Scanner;


public class ArteAscii {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int astericos;
        astericos= entrada.nextInt();
        for(int i=0;i<astericos;i++){
            for(int j=0;j<astericos-i;j++){
                System.out.print("*");
            }
             System.out.println();
           
        }
        for(int i=0;i<astericos;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
