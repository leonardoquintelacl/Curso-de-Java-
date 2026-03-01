import java.util.Scanner;

public class ehMultiplo {
	public static void main(String[] args) {
		int a, b;
		String result;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			result = (a % b == 0) ?  "Sao Multiplos" : "Nao Sao Multiplos";
			System.out.println(result);
		}
		else {
			result = (b % a == 0) ? "Sao Multiplos" : "Nao Sao Multiplos";
			System.out.println(result);
		}
	}
}
