/*Nome: Cícero Higor Gomes de Sousa
 * Matricula: 21550190
 * Data: 25/11/2016
 * Descrição: Questão 5 – Classe CarroLuxuoso
 * 
 */
package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso  extends Carro implements Localizavel{

	public CarroLuxuoso(String placa) {
		super(placa);
	}

	@Override
	public Posicao getPosicao() {
		Random r= new Random();
		double latitude= -3.160000+(-2.960000-(-3.160000)) *r.nextDouble();
		double longitude=-60.120000+(-59.820000- (-60.120000))*r.nextDouble();
		double altitude= 15.0+(100.0-15.0)*r.nextDouble();
		
		Posicao local= new Posicao(latitude, longitude, altitude);
		return local;
	}

	@Override
	public double getErroLocalizacao() {
		return 15.0;
	}
	
}
