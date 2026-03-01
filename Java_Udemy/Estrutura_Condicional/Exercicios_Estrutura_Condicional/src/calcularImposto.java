import java.util.Scanner;
import java.util.Locale;

public class calcularImposto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double salary;
		double tax;
		Scanner sc = new Scanner(System.in);
		
		salary = sc.nextDouble();
		
		if(salary <= 2000) {
			System.out.println("Isento");
		}
		else if(salary <= 3000) {
			tax = (salary - 2000) * 0.08;
			System.out.printf("R$ %.2f\n", tax);
		}
		else if(salary <= 4500) {
			tax = (salary - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f\n", tax);
		}
		else if(salary > 4500) {
			tax = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f\n", tax);
		}
	}

}
