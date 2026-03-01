import java.util.Scanner;
import java.util.Locale;

public class verificarQuadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x, y;
		String aux;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(x == 0) {
			System.out.println("Eixo X");
		}
		else if(y == 0) {
			System.out.println("Eixo Y");
		}
		else if( x > 0) {
			aux = (y > 0) ? "Q1" : "Q4";
			System.out.println(aux);
		}
		else {
			aux = (y > 0) ? "Q2" : "Q3";
			System.out.println(aux);
		}
	}

}
