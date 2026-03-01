import java.util.Scanner;
import java.util.Locale;

public class Areas {
	public static void main() {
		Locale.setDefault(Locale.US);
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		triangulo = a * c / 2;
		circulo = pi * Math.pow(c, 2);
		trapezio = (a + b) * c / 2;
		quadrado = b*b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n",triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}

}
