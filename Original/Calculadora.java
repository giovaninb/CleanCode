public class Calculadora {
	private int num1;
	private int num2;
	private int resultado;
		
	public Calculadora(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	
	public Calculadora() {
		
	}
	
	/*
	 * Método para "regra do negócio"
	 */
	public String somaNumeros(){
		this.resultado = this.num1 + this.num2;
		return this.getNum1()+ " + " +this.getNum2()+ " = " +this.getResultado();
	}	
	
	/*
	 * "Getters e setters" do modelo
	 */
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
