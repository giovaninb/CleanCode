package controle;

import java.awt.EventQueue;

import vis�o.App;

/*
 * Aplica��o simples para mostrar a estrutura��o
 * do modelo Model, View and Control (MVC) de uma
 * calculadora simples, cujo �nico prop�sito � realizar 
 * a soma de dois n�meros.
 */

public class Main {
	
	/**
	 * M�todo para lan�ar a aplica��o.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					Controle controle  = new Controle(frame);
					frame.setVisible(true);
					frame.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
