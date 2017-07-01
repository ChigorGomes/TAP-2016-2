package br.edu.ufam.icomp.lab_rover;

public class RoverMain {

	public static void main(String[] args) {
		try {
			Coordenada coord= new Coordenada(1, 3, 12);
			Caminho cam= new Caminho(5);
		} catch (CoordenadaNegativaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoordenadaForaDosLimitesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DigitoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
