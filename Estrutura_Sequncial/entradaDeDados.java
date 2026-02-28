import java.util.Scanner;

public class entradaDeDados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0); //Lê somente o primeiro caracter
		
		System.out.println("Voce digitou o nome: " + x);
		System.out.println("Voce digitou o numero: " + y);
		System.out.println("Voce digitou o numero decimal: " + z);
		System.out.println("Voce digitou o caracter: " + a);
		
		int num;
		String s1, s2, s3;
		
		num = sc.nextInt();
		sc.nextLine(); //Pega o "Enter" da leitura de cima
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf("Voce digitou o numero %d e as palavras %s, %s e %s\n", num, s1, s2, s3);
		
		sc.close();
	}

}
