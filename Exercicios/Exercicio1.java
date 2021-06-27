import java.util.*;
public class Exercicio1 {

	public static void main (String[]args) {

	    Scanner sc = new Scanner (System.in);

	    System.out.print("\nDigite um numero: ");
	    int numero = sc.nextInt();

	     if ( numero > 0) {
	            System.out.println("numero positivo");
		     } 
		     else if (numero == 0) {
		     System.out.println("numero igual a zero");
		     } 
		 else {
			 System.out.println("numero negativo");
		      }
	}
}