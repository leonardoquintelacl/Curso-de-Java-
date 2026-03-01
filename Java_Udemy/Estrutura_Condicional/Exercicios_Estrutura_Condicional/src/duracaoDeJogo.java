import java.util.Scanner;

public class duracaoDeJogo {
	public static void main(String[] args) {
		int started, finished, duration = 0;
		Scanner sc = new Scanner(System.in);
		
		started = sc.nextInt();
		finished = sc.nextInt();
		
		if(started < finished) {
			duration = finished - started;
		}
		else {
			duration = 24 - started + finished;
		}
		
		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
	}

}
