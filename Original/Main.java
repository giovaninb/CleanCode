package controle;

import java.awt.EventQueue;

import visão.App;

public class Main {
	
	/**
	 * Launch the application.
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
