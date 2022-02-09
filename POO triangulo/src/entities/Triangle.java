package entities;

public class Triangle {
    
	//atributos
	public double a; 
	public double b; 
	public double c;
	
	//metodo com retorno
	public double area(){
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) *(p -c));
	}
	
}
