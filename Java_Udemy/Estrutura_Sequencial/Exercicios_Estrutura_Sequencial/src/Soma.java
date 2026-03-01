import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		int num1, num2, result;
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 + num2;
		
		System.out.println("SOMA = " + result);
	}
}
