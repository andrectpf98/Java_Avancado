package formas;


public class Circulo extends Forma{
	private final static double PI = 3.14;
	private double raio;
	private double area;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double area() {
		area = (PI*raio*raio);
		return 0;
	}
	
}