import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o primeiro numero: ");  
		int n1 = sc.nextInt();  
		
		System.out.print("Informe o segundo numero: ");  
		int n2 = sc.nextInt();  
		
		System.out.print("Informe o terceiro numero: ");  
		int n3 = sc.nextInt();  
		

		
        if (n1>n2 && n1>n3 && n2>n3) {
        int soma = n1 + n2;
		System.out.println(soma);
	     } else if (n2>n1 && n2>n3 && n1>n3) {
	    	 int soma = n2 + n1;
		System.out.println(soma);
	    }
	     else if (n3>n2 && n3>n1 && n1>n2)  {
	    	int soma = n1 + n3;
        System.out.println(soma);
	    }
	     else if (n2>n3 && n2>n1 && n3>n1) {
	        int soma = n2 + n3;
			System.out.println(soma);
		     } 
	     else if (n1>n2&& n1>n3 && n3>n2) {
		    int soma = n2 + n3;
			System.out.println(soma);
		    }
	     else if (n3>n2 && n3>n1 &&n2>n1) {
		    int soma = n2 + n3;
	        System.out.println(soma);
		    }
	     
	}
}