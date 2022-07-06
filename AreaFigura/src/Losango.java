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

public class Losango extends JFrame {

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
					Losango frame = new Losango();
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
	public Losango() {
		setTitle("\u00C1rea do Losango");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Losango.class.getResource("/img/losango1.png")));
		lblNewLabel.setBounds(60, 0, 305, 200);
		panel.add(lblNewLabel);
		
		JLabel lblDigiteA = new JLabel("Digite a 1\u00AA Diagonal (D):");
		lblDigiteA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDigiteA.setBounds(61, 225, 157, 14);
		panel.add(lblDigiteA);
		
		cx1 = new JTextField();
		cx1.setBounds(228, 223, 147, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setColumns(10);
		cx2.setBounds(228, 259, 147, 20);
		panel.add(cx2);
		
		JLabel lblDigiteA_2 = new JLabel("Digite a 2\u00AA Diagonal (d):");
		lblDigiteA_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDigiteA_2.setBounds(60, 261, 157, 14);
		panel.add(lblDigiteA_2);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(130, 320, 88, 14);
		panel.add(lblNewLabel_1);
		
		cxresultado = new JTextField();
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setEditable(false);
		cxresultado.setBounds(228, 309, 147, 35);
		panel.add(cxresultado);
		cxresultado.setColumns(10);
		
//		<---------------- CÁLCULO ------------------------>	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d1, d2, area;
				
				if(cx1.getText().equals("") || cx2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
											          ,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {
					d1 = Double.parseDouble(cx1.getText());
					d2 = Double.parseDouble(cx2.getText());		
					area = d1 * d2 / 2;		
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setForeground(new Color(204, 153, 0));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(22, 403, 112, 35);
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
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(170, 403, 112, 35);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR INÍCIO ------------------------>	
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial inicial = new TelaInicial();
				Losango.this.dispose();
				inicial.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnIncio.setForeground(new Color(204, 153, 0));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBackground(Color.WHITE);
		btnIncio.setBounds(309, 403, 112, 35);
		panel.add(btnIncio);
	}

}
