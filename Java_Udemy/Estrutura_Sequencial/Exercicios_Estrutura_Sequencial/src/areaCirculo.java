import java.util.Scanner;
import java.util.Locale;

public class areaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double raio;
		double result;
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		result = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", result);
	}
}
