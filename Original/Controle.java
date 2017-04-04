import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Controle implements KeyListener, ActionListener {

	private App app;
	private Calculadora calc;

	public Controle(App app) {
		this.app = app;
		registraListeners();
	}

	/*
	 * Neste método temos o método para registrar os Listeners, 
	 * ou "ouvintes" dos componentes
	 */
	public void registraListeners() {
		System.out.println("Entra registraListeners.");
		// KeyListeners
		this.app.getBtnSomar().addKeyListener(this);
		this.app.getBtnLimpar().addKeyListener(this);
		// ActionListeners
		this.app.getBtnSomar().addActionListener(this);
		this.app.getBtnLimpar().addActionListener(this);
	}

	/*
	 * Método para autenticar as ações dos componentes
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("Somar")) {
			System.out.println("Somar pressionado!");
			calculaResultado();
		}
		if (e.getActionCommand().equalsIgnoreCase("Limpar")) {
			System.out.println("Limpar pressionado!");
			limparTela();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == e.VK_ENTER && e.getSource() == this.app.getBtnSomar()) {
			calculaResultado();
			limparTela();
			app.getTextField().requestFocus();
		} else if (e.getKeyCode() == e.VK_ENTER && e.getSource() == this.app.getBtnLimpar()) {
			limparTela();
			app.getTextField().requestFocus();
		} else if (e.getKeyCode() == e.VK_ENTER) {
			((JTextField) e.getSource()).transferFocus();
		}
	}
	
	/*
	 * Método para calcular o resultado da soma, 
	 * e ligar a visão com o modelo
	 */
	public void calculaResultado() {
		try {
			System.out.println("---------------");
			calc = new Calculadora();
			calc.setNum1(Integer.parseInt(this.app.getTextField().getText()));
			System.out.println("Num1: " + calc.getNum1());
			calc.setNum2(Integer.parseInt(this.app.getTextField2().getText()));
			System.out.println("Num2: " + calc.getNum2());
			calc.somaNumeros();
			System.out.println("Resultado: " + calc.getResultado());
			System.out.println("---------------");
			this.app.getTextResultado().setText(String.valueOf(calc.somaNumeros()));
		} 
		catch (NumberFormatException e) {
			JOptionPane vazio = new JOptionPane();
			System.out.println("Valores incorretos ou inexistentes. Por favor, digite valores inteiros.");
			JOptionPane.showMessageDialog(app, "Valores incorretos ou inexistentes. Por favor, digite valores inteiros.");
		} 
	}
	
	/*
	 * Método para limpar a tela da visão
	 */
	public void limparTela() {
		this.app.getTextField().setText("");
		this.app.getTextField2().setText("");
		this.app.getTextResultado().setText("");
	}


	/*
	 * Métodos que precisam ser importados
	 * TODO: Caso queira implementar
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
