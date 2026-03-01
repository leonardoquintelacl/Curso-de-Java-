import java.util.Scanner;

public class ehPar {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}

}
