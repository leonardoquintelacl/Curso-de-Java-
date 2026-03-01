import java.util.Scanner;

public class estruturaCondicional {
	public static void main(String[] args) {
		
		int horas; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são?");
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom dia!");
		}
		else if(horas >= 12 && horas < 18) {
			System.out.println("Boa Tarde!");
		}
		else{
			System.out.println("Boa Noite!");
		}
	}

}
