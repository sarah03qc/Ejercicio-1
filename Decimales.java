package ejercicio1;
import java.util.Scanner;  

public class Decimales {

	public static void main(String[] args) {
		//funcion main que lee un numero entre 1 y 1000 desde
		//consola, y despues de una serie de procedimientos
		//aritmeticos, se despliegue con decimales
		Scanner scan = new Scanner(System.in);  // creamos scanner
	    System.out.println("Ingrese numero entre 1 y 1000: ");  //desplegar que inserte numero

	    
	    double number = scan.nextInt();  //leer input
	    scan.close();
	    System.out.println("Elegiste numero: " + number);  //damos el numero original
	    
	    //hacemos los procedimientos
	    number = number  * 8.721;
	    System.out.println("Despues de multiplicar es: " + number);
	    
	    number = number / 2;
	    System.out.println("Despues de dividir es: " + number);
	    
	    number = number - 0.35;
	    System.out.println("Despues de restar es: " + number);
	    
	    number = number % 1.63;
	    System.out.println("Finalmente, despues del mod es: " + number);
	}
}
