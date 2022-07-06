package prjCarro;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Carro c1 = new Carro();
			System.out.println("Infome a COR do carro:");
			c1.setCor(in.next());
			System.out.println("Infome a MARCA do carro:");
			c1.setMarca(in.next());
			System.out.println("Infome a MODELO do carro:");
			c1.setModelo(in.next());
			System.out.println("Infome o NÚMEROS DE PASSAGEIROS do carro:");
			c1.setNmrPassageiros(in.nextInt());
			System.out.println("Infome a CAPACIDADE DO TANQUE do carro:");
			c1.setCapTanque(in.nextDouble());
			System.out.println("Infome o CONSUMO DE COMBUSTÍVEL do carro:");
			c1.setConCombustivel(in.nextDouble());
			
			System.out.println("\n\nCARRO A VENDA: \nCOR: " + c1.getCor()
								+ "\nMARCA: " + c1.getMarca()
								+ "\nMODELO: " + c1.getModelo()
								+ "\nN. de Passageiros: " + c1.getNmrPassageiros()
								+ "\nCap. do Tanque: " + c1.getCapTanque() + " Litros"
								+ "\nCon. Combustível: " + c1.getConCombustivel() + " Km/L");
			
	}

}
