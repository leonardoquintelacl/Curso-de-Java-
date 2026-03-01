import java.util.Scanner;

public class diferenca {
	public static void main(String[] args) {
		int a, b, c, d;
		int diferenca;
		Scanner leitor = new Scanner(System.in);
		
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		d = leitor.nextInt();
		
		diferenca = (a*b) - (c*d);
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}
