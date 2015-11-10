package br.com.mhas.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class QuizGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblImageFundo;
	private JPanel panelPrincipal;
	private JLabel lblImagefractal;
	private JLabel lblLblfundovisor;
	private JLabel lblIcoquadrado;
	private JPanel panel_1;
	private JLabel lblTringulo;
	private JPanel panel_2;
	private JLabel lblReta;
	private JLabel lblTimer;
	private JLabel lblFundoescolha;
	private JLabel lblTempoRestante;
	private JLabel lblProximo;
	private JLabel lblPrximo;
	private JLabel label_1;
	private JPanel panel_4;
	
	//controlador
	
	//private QuizControl quizControl;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizGUI frame = new QuizGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public QuizGUI() {
		
		iniciaComponentes();
		
	//	quizControl = new QuizControl(this);
	}
	
	
	private void iniciaComponentes(){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	//	setResizable(false);
		
		setBounds(325,45, 1000, 600);
		
		setLocationRelativeTo(null);
		
		setUndecorated(true);
	
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImagefractal = new JLabel("");
		lblImagefractal.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/lines-white.png")));
		lblImagefractal.setBounds(31, 47, 380, 380);
		contentPane.add(lblImagefractal);
		lblImagefractal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
	/*	lblLblfundovisor = new JLabel("");
		lblLblfundovisor.setForeground(Color.DARK_GRAY);
		lblLblfundovisor.setBounds(21, 34, 401, 406);
		contentPane.add(lblLblfundovisor);
		lblLblfundovisor.setBackground(new Color(204, 204, 204));
		lblLblfundovisor.setBorder(new LineBorder(new Color(204, 204, 204)));*/
				
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(441, 398, 538, 177);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 165, 158);
		panel.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		lblReta = new JLabel("___________");
		lblReta.setForeground(Color.BLACK);
		lblReta.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
		lblReta.setBounds(17, 60, 132, 37);
		panel_2.add(lblReta);
		
		JLabel label = new JLabel("___________");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
		label.setBounds(17, 61, 132, 37);
		panel_2.add(label);
	
		
		panel_1 = new JPanel();
		panel_1.setBounds(187, 11, 165, 158);
		panel.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setLayout(null);
		
		lblTringulo = new JLabel("");
		lblTringulo.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/triangulo2.png")));
		lblTringulo.setFont(new Font("Trajan Pro", Font.PLAIN, 23));
		lblTringulo.setBounds(31, 18, 124, 125);
		panel_1.add(lblTringulo);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(362, 11, 165, 158);
		panel.add(panelPrincipal);
		panelPrincipal.setBackground(Color.WHITE);
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelPrincipal.setLayout(null);
		
		lblIcoquadrado = new JLabel("");
		lblIcoquadrado.setFont(new Font("Trajan Pro", Font.PLAIN, 23));
		lblIcoquadrado.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/quadrado.png")));
		lblIcoquadrado.setBounds(18, 11, 129, 141);
		panelPrincipal.add(lblIcoquadrado);
		/*
		lblFundoescolha = new JLabel("");
		lblFundoescolha.setBounds(0, 0, 538, 178);
		panel.add(lblFundoescolha);
		lblFundoescolha.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/texture-texture-blue-color-abrasion.jpg")));
		lblFundoescolha.setBorder(new LineBorder(new Color(204, 204, 204)));
		*/
		lblTimer = new JLabel("30");
		lblTimer.setForeground(Color.WHITE);
		lblTimer.setFont(new Font("Trajan Pro", Font.PLAIN, 200));
		lblTimer.setBounds(686, 64, 228, 214);
		contentPane.add(lblTimer);
		
		lblTempoRestante = new JLabel("Tempo restante: ");
		lblTempoRestante.setForeground(Color.WHITE);
		lblTempoRestante.setFont(new Font("Trajan Pro", Font.PLAIN, 14));
		lblTempoRestante.setBounds(708, 47, 181, 14);
		contentPane.add(lblTempoRestante);
		
		lblProximo = new JLabel("");
		lblProximo.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/right-arrow7.png")));
		lblProximo.setBounds(781, 267, 141, 98);
		contentPane.add(lblProximo);
		
		lblPrximo = new JLabel("Pr\u00F3ximo");
		lblPrximo.setForeground(Color.WHITE);
		lblPrximo.setFont(new Font("Trajan Pro", Font.PLAIN, 15));
		lblPrximo.setBounds(705, 309, 79, 14);
		contentPane.add(lblPrximo);
		
		
		label_1 = new JLabel("1/1");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Trajan Pro", Font.PLAIN, 24));
		label_1.setBounds(782, 539, 79, 36);
		contentPane.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(31, 488, 394, 87);
		contentPane.add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setForeground(Color.DARK_GRAY);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(20, 37, 405, 404);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
	
		lblImageFundo = new JLabel("");
		lblImageFundo.setIcon(new ImageIcon(QuizGUI.class.getResource("/br/com/mhas/image/mandelbrot_fractal__4k__by_7064n-d6hnq67.png")));
		lblImageFundo.setBounds(0, 0, 1000, 600);
		lblImageFundo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(lblImageFundo);  
		
	}	
}
