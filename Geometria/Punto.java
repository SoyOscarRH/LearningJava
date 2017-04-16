import java.util.*;															//Librerias

public class Punto{
	private int x, y;														//Atributos
	private char nombre;

	Punto(int a, int b, char letra) {nombre = letra; x = a; y = b;}			//Constructor base
	Punto(int a, int b){this(a, b, ' ');} 									//Constructor de ayuda
	Punto(int num, char letra){this(num, num, letra);} 						//Constructor de ayuda
	Punto(char letra){this(0,0, letra);} 									//Constructor de ayuda
	Punto(){this(0,0, 'p');} 												//Constructor de ayuda
	Punto(Punto P, char letra){this(P.x, P.y, letra);} 						//Constructor de copia

	public int getX(){return x;}											//Setters
	public int getY(){return y;}											//Setters

	public String toString(){return (nombre+"("+this.x+", "+this.y+")");}	//Mostramos la info

	public double distancia() {return distancia(new Punto());}				//Distancia				
	public double distancia(Punto A) {
		return Math.sqrt(((A.x-x)*(A.x-x))+((A.y-y)*(A.y-y)));
	}
		
	public int cuadrante() {												//Nos dice en que cuadrante estoy
		if(x>0 && y>0) return 1;	
		if(x<0 && y>0) return 2;									
		if(x<0 && y<0) return 3;
		return 4;
	}

}
