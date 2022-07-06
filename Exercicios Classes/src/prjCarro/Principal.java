package prjCarro;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		//CARRO COM -> Scanner
//		Carro c1 = new Carro();
//			System.out.println("Informe a COR do carro:");
//			c1.cor = in.next();
//			System.out.println("Informe o MARCA do carro:");
//			c1.marca = in.next();
//			System.out.println("Informe a MODELO do carro: ");
//			c1.modelo = in.next();
//			System.out.println("Informe a Quantidade de Passageiros do carro: ");
//			c1.nmrPassageiros = in.nextInt();
//			System.out.println("Informe a Capacidade do Tanque de Combustível do carro: ");
//			c1.capTanque = in.nextDouble();
//			System.out.println("Informe o Consumo de Combustível do carro: ");
//			c1.conCombustivel = in.nextDouble();
//			
//			System.out.println("\nMarca do Carro: " + c1.marca
//								+ "\nModelo do Carro: " + c1.modelo
//								+ "\nCor do Carro: " + c1.cor
//								+ "\nQuantidade de Passageiros: " + c1.nmrPassageiros
//								+ "\nCapacidade do Tanque: " + c1.capTanque
//								+ "\nConsumo de Combustível: " + c1.conCombustivel);
			
			
		//CARRO COM -> JOptionPane
		Carro c2 = new Carro();
			c2.cor = JOptionPane.showInputDialog(null,"Informe a COR do carro:");
			c2.marca = JOptionPane.showInputDialog(null,"Informe a MARCA do carro:");
			c2.modelo = JOptionPane.showInputDialog(null,"Informe o MODELO do carro:");
			c2.nmrPassageiros = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a Quantidade de Passageiros do carro:"));
			c2.capTanque = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a Capacidade do Tanque do carro:"));
			c2.conCombustivel = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o Consumo de Combustível do carro:"));
			
			JOptionPane.showMessageDialog(null, "Marca do Carro: " + c2.marca 
											+ "\nModelo do Carro: " + c2.modelo 
											+ "\nCor do Carro: " + c2.cor
											+ "\nQuantidade de Passageiros: " + c2.nmrPassageiros
											+ "\nCapacidade do Tanque: " + c2.capTanque
											+ "\nConsumo de Combustível: " + c2.conCombustivel
											,"Dados do Carro",JOptionPane.INFORMATION_MESSAGE);
		
	
		in.close();
	}
}
