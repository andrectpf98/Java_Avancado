package formas;

public class Retangulo  extends Forma {

	private double area;
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.altura = altura;
		this.base = base;
	}
	

	
	public final double area() {
		area = base*altura;
		return area;
	}



	
	

	
}