package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio frame = new TelaInicio();
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
	public TelaInicio() {
		setResizable(false);
		setTitle("Tela de In\u00EDcio");
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
		
//		|-------------------->> CHAMAR TELA DE CARREGAMENTO <<--------------------|
		JButton btnInicio = new JButton("Iniciar");
		btnInicio.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnInicio.setBackground(new Color(75, 0, 130));
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCarregamento janela = new TelaCarregamento();
				TelaInicio.this.dispose();
				janela.setVisible(true);
			}
		});
		btnInicio.setBounds(95, 250, 253, 38);
		panel.add(btnInicio);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInfo janela = new TelaInfo();
				TelaInicio.this.dispose();
				janela.setVisible(true);
			}
		});
		btnInfo.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnInfo.setBackground(new Color(75, 0, 130));
		btnInfo.setForeground(new Color(255, 255, 255));
		btnInfo.setBounds(95, 328, 253, 38);
		panel.add(btnInfo);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSobre janela = new TelaSobre();
				TelaInicio.this.dispose();
				janela.setVisible(true);
			}
		});
		btnSobre.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSobre.setBackground(new Color(75, 0, 130));
		btnSobre.setForeground(new Color(255, 255, 255));
		btnSobre.setBounds(95, 404, 253, 38);
		panel.add(btnSobre);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/img/quiz.png")));
		lblNewLabel.setBounds(48, 11, 354, 209);
		panel.add(lblNewLabel);
//		|-------------------------------------------------------------------------|
	}
}
