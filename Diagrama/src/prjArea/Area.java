package prjArea;
import javax.swing.JOptionPane;

public class Area {
	
		//Atributos
		double area;
		double base;
		double altura;
		
		void calcularRetangulo() {
			System.out.println("A área do retângulo é " + base * altura);
		}
		
		void calcularRetangulo2() {
			JOptionPane.showMessageDialog(null, "A área do retângulo é " + base * altura);
		}
}