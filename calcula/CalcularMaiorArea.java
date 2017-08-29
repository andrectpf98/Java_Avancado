package calcula;

import java.util.List;

import formas.Forma;

public class CalcularMaiorArea {
	
	
	public static Forma formaDeMaiorArea(List<Forma> formas){
		Forma maiorArea = formas.get(0);
		for(Forma forma : formas){
			
			if(forma.area() > maiorArea.area()){
				maiorArea = forma;
			}
		}
		
		return maiorArea;
	}
}
