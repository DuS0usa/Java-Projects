import java.util.Scanner;
public class Combustivel {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double distancia, cTanque, gMedio;
		
		System.out.println("Informe a dist�ncia percorrida em KM:");
		distancia = leia.nextDouble();
		System.out.println("Informe a capacidade do tanque de seu carro:");
		cTanque = leia.nextDouble();
		
		gMedio = distancia / cTanque;
		
		if (gMedio >= 10) {
			System.out.printf("Seu carro � ECON�MICO, pois gasta %.1f km/l!",gMedio);
			} else {
				System.out.printf("Seu carro N�O � ECON�MICO, pois gasta %.1f km/l!",gMedio);
			}
		
		leia.close();

	}
}