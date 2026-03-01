import java.util.Scanner;
import java.util.Locale;

public class calcularValor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int cod, quant;
		double valor, valorTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			cod = sc.nextInt();
			quant = sc.nextInt();
			valor = sc.nextDouble();
			valorTotal += valor * quant;
		}
		
		System.out.printf("VALOR A PAGAR = R$ %.2f", valorTotal);
		
	}
}
