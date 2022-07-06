package prjArea;
import javax.swing.JOptionPane;

public class Area {
	
		//ATRIBUTOS
		double area;
		double base;
		double altura;
		
		//MÉTODO PARA CALCULAR A ÁREA UTILIZANDO -> System.out
		void calcularRetangulo() {
			System.out.println("A área do retângulo é " + base * altura);
		}
			
		//MÉTODO PARA CALCULAR A ÁREA UTILIZANDO -> JOptionPane
		void calcularRetangulo2() {
			JOptionPane.showMessageDialog(null, "A área do retângulo é " + base * altura
											,"Área do Retângulo", JOptionPane.WARNING_MESSAGE);
		}
}


