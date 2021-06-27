import java.util.*;
public class Exercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		while (x<10){
			System.out.print("Digite um numero:");
			int n = sc.nextInt();
			
			if (n<40){
				y = y+n;
			}
			x++;
		}
		System.out.print("A soma dos numeros e " + y);
  }
}