package formas;

public class Triangulo extends Forma {
	private double area;
	private double base;
	private double altura;
	
	
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	
	public double area(){
		area = (altura*base)/2;
		return area;
	}
	
}
