import java.util.*; 

public class Exercicio2 {
	public static void main(String[] args) { 
		
		int soma;

        Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o primeiro numero: ");  
		int n1 = sc.nextInt();  
		
		System.out.print("Informe o segundo numero: ");  
		int n2 = sc.nextInt();  
		
		System.out.print("Informe o terceiro numero: ");  
		int n3 = sc.nextInt();  

        if (n1 >n2 && n1>n3 && n2>n3)  {
			soma=n1+n2;
		System.out.println(soma );
	     } else if(n1>n2 && n1>n3 && n3>2){
	 	 soma=n1+n3;
	    System.out.println(soma );
		}if (n2> n1 && n2>n3 && n1>n3){
	    soma=n1+n2;
		System.out.println(soma );
	    } else if (n2>n1 && n2>n3 && n3>n1) {
	    soma=n3+n2;
		System.out.println(soma );
	    }if (n3>n1 && n3>n2 && n2>n1) {
	    soma=n3+n2;
		System.out.println(soma );
		}else if (n3>n1 && n3>n2 && n1>n2) {
	    soma=n3+n1;
		System.out.println(soma );
		}
	}
	}