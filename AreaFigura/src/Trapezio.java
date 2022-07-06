import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Trapezio extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cx3;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trapezio frame = new Trapezio();
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
	public Trapezio() {
		setResizable(false);
		setTitle("\u00C1rea do Trap\u00E9zio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 227, 227));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Trapezio.class.getResource("/img/trapezio1.jpg")));
		lblNewLabel.setBounds(55, 0, 337, 191);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite a 1\u00AA Base (b):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(66, 224, 132, 14);
		panel.add(lblNewLabel_1);
		
		cx1 = new JTextField();
		cx1.setBounds(208, 222, 156, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Digite a 2\u00AA Base (B):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(66, 257, 132, 14);
		panel.add(lblNewLabel_1_1);
		
		cx2 = new JTextField();
		cx2.setColumns(10);
		cx2.setBounds(208, 255, 156, 20);
		panel.add(cx2);
		
		JLabel lblNewLabel_2 = new JLabel("Digite a ALTURA:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(66, 292, 109, 14);
		panel.add(lblNewLabel_2);
		
		cx3 = new JTextField();
		cx3.setColumns(10);
		cx3.setBounds(208, 290, 156, 20);
		panel.add(cx3);
		
		cxresultado = new JTextField();
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setEditable(false);
		cxresultado.setColumns(10);
		cxresultado.setBounds(208, 335, 156, 41);
		panel.add(cxresultado);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(94, 348, 81, 14);
		panel.add(lblNewLabel_3);
		
//		<---------------- CÁLCULO ------------------------>	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double b1, b2, altura, area;
				
				if(cx1.getText().equals("") || cx2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
														,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {
					b1 = Double.parseDouble(cx1.getText());
					b2 = Double.parseDouble(cx2.getText());	
					altura = Double.parseDouble(cx3.getText());	
					area = (b1 + b2) * altura / 2;
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setForeground(new Color(255, 204, 51));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(21, 398, 109, 49);
		panel.add(btnCalcular);
		
//		<---------------- LIMPAR ------------------------>	
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText("");
				cx2.setText("");
				cx3.setText("");
				cxresultado.setText("");
				cx1.requestFocus();				
			}
		});
//		<---------------------------------------------------->
		btnLimpar.setForeground(new Color(255, 204, 51));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(169, 398, 109, 49);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR INÍCIO ------------------------>	
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janela = new TelaInicial();
				Trapezio.this.dispose();
				janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnIncio.setForeground(new Color(255, 204, 51));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBackground(Color.WHITE);
		btnIncio.setBounds(313, 398, 109, 49);
		panel.add(btnIncio);
	}

}
