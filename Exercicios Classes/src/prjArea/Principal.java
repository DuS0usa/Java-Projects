package prjArea;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//
//		//ÁREA DO RETÂNGULO COM -> Scanner
//		Area retangulo = new Area();
//			System.out.println("Digite a Base do retângulo");
//			retangulo.base = in.nextDouble();
//			System.out.println("Digite a Altura do retângulo");
//			retangulo.altura = in.nextDouble();
//			
//			retangulo.calcularRetangulo();
		
		
		//ÁREA DO RETÂNGULO COM -> JOptionPane
		Area retangulo2 = new Area();
			retangulo2.base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a BASE do retângulo:"
													,"Área do Retângulo", JOptionPane.INFORMATION_MESSAGE));
			retangulo2.altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a ALTURA do retângulo:"
													,"Área do Retângulo", JOptionPane.INFORMATION_MESSAGE));
			
			retangulo2.calcularRetangulo2();
			
		in.close();	
	}
}
