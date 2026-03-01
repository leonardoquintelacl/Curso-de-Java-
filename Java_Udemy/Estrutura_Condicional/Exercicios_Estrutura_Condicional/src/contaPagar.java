import java.util.Scanner;

public class contaPagar {
	public static void main(String[] args) {
		int num, quant;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		quant = sc.nextInt();
		
		switch(num) {
		case 1:
			result = quant * 4;
			break;
		case 2:
			result = quant * 4.50;
			break;
		case 3:
			result = quant * 5;
			break;
		case 4:
			result = quant * 3;
			break;
		case 5:
			result = quant * 1.50;
			break;
		}
		
		System.out.printf("Total: R$ %.2f", result);
	}
}
