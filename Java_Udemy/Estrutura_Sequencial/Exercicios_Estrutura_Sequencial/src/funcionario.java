import java.util.Scanner;
import java.util.Locale;

public class funcionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int numFuncionario;
		int horas;
		double valorHora;
		double salario;
		Scanner sc = new Scanner(System.in);
		
		numFuncionario = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horas * valorHora;
		
		System.out.println("NUMBER = " + numFuncionario + "\nSALARY = U$ " + salario);
	}

}
