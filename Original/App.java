import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class App extends JFrame {
	// Grupo de painéis
	private JPanel painelMaster;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	// Grupo de textField's	
	private JTextField campoResultado;
	private JTextField campoTexto1;
	private JTextField campoTexto2;
	// Grupo de botões
	private JButton botaoSomar;
	private JButton botaoLimpar;
	// Grupo de Menu
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem menuItemSair;

	/**
	 * Construtor que cria o Frame
	 */
	public App() {
		
		/*
		 * Cria o Frame com todos os seus componentes
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		setTitle("Prova 2 POO I");

		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		menu = new JMenu("Menu");
		menu.setFont(new Font("Tahoma", Font.BOLD, 15));
		barraMenu.add(menu);

		menuItemSair = new JMenuItem("Sair");
		menuItemSair.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu.add(menuItemSair);

		painelMaster = new JPanel();
		painelMaster.setBackground(new Color(255, 204, 204));
		painelMaster.setBorder(new EmptyBorder(5, 5, 5, 5));
		painelMaster.setLayout(new GridLayout(1, 1, 10, 10));
		setContentPane(painelMaster);

		painel1 = new JPanel();
		painel1.setBackground(new Color(255, 204, 204));
		painel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel1.setLayout(new GridLayout(3, 1, 10, 10));
		painelMaster.add(painel1);

		campoResultado = new JTextField();
		campoResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		campoResultado.setEditable(false);
		campoResultado.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		painel1.add(campoResultado);

		painel2 = new JPanel();
		painel2.setBackground(new Color(255, 204, 204));
		painel2.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel2.setLayout(new FlowLayout());
		painel1.add(painel2);

		JLabel nume1 = new JLabel("Primeiro numero:");
		nume1.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(nume1);

		campoTexto1 = new JTextField();
		campoTexto1.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(campoTexto1);
		campoTexto1.setColumns(10);

		JLabel nume2 = new JLabel("Segundo numero:");
		nume2.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(nume2);

		campoTexto2 = new JTextField();
		campoTexto2.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(campoTexto2);
		campoTexto2.setColumns(10);

		painel3 = new JPanel();
		painel3.setBackground(new Color(255, 204, 204));
		painel3.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel3.setLayout(new FlowLayout());
		painel1.add(painel3);

		botaoSomar = new JButton("Somar");
		botaoSomar.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel3.add(botaoSomar);

		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel3.add(botaoLimpar);
	}
	
	/*
	 * "Getters e setters" da visão
	 */

	public JButton getBtnSomar() {
		return botaoSomar;
	}

	public JButton getBtnLimpar() {
		return botaoLimpar;
	}

	public JTextField getTextResultado() {
		return campoResultado;
	}

	public void setTextResultado(JTextField textResultado) {
		this.campoResultado = textResultado;
	}

	public JTextField getTextField() {
		return campoTexto1;
	}

	public void setTextField(JTextField textField) {
		this.campoTexto1 = textField;
	}

	public JTextField getTextField2() {
		return campoTexto2;
	}

	public void setTextField2(JTextField textField2) {
		this.campoTexto2 = textField2;
	}

}
