import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Triangulo() {
		setTitle("\u00C1rea do Tri\u00E2ngulo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Triangulo.class.getResource("/img/triangulo.jpg")));
		lblNewLabel_1.setBounds(44, 11, 354, 209);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Digite a BASE:");
		lblNewLabel_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(76, 252, 91, 14);
		panel.add(lblNewLabel_2);
		
		cx1 = new JTextField();
		cx1.setBounds(196, 250, 150, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setColumns(10);
		cx2.setBounds(196, 288, 150, 20);
		panel.add(cx2);
		
		JLabel lblNewLabel_3 = new JLabel("Digite a ALTURA:");
		lblNewLabel_3.setForeground(new Color(204, 153, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(76, 290, 110, 14);
		panel.add(lblNewLabel_3);
		
		cxresultado = new JTextField();
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setEditable(false);
		cxresultado.setBounds(196, 329, 150, 35);
		panel.add(cxresultado);
		cxresultado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado:");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(76, 338, 70, 14);
		panel.add(lblNewLabel_4);
		
//		<---------------- CÁLCULO ------------------------>	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double altura, base, area;
				if(cx1.getText().equals("") || cx2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
											          ,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {
					altura = Double.parseDouble(cx1.getText());
					base = Double.parseDouble(cx2.getText());		
					area = altura * base / 2;		
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setForeground(new Color(204, 153, 0));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(25, 411, 100, 35);
		panel.add(btnCalcular);
		
//		<---------------- LIMPAR ------------------------>	
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText("");
				cx2.setText("");
				cxresultado.setText("");
				cx1.requestFocus();
			}
		});
//		<---------------------------------------------------->
		btnLimpar.setForeground(new Color(204, 153, 0));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(169, 411, 100, 35);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR INÍCIO ------------------------>	
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial inicio = new TelaInicial();
				Triangulo.this.dispose();
				inicio.setVisible(true);	
			}
		});
//		<---------------------------------------------------->
		btnIncio.setForeground(new Color(204, 153, 0));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBounds(311, 411, 100, 35);
		panel.add(btnIncio);
	}

}
