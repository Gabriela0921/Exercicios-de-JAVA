import java.util.*;
public class Exercicio4 {

public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("\nDigite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        int n2 = sc.nextInt();


        System.out.print("\nescolha uma op��o: \nsubtra��o 1\nsoma 2 \ndivis�o 3\nmultiplica��o 4\n");
        int escolha = sc.nextInt();

        if (escolha ==1) {
            int calculo = (n1-n2);

        System.out.println ("resultado � "+ calculo);
   
        }
        if(escolha == 2) {
        
        	int calculo = (n1+n2);

        System.out.println ("resultado � "+ calculo);
    
        }


        if (escolha == 3) {
        
            int calculo = (n1/n2);

        System.out.println ("resultado � "+ calculo);
    
        }


        else if(escolha == 4) {
        
            int calculo = (n1*n2);

        System.out.println ("resultado � "+ calculo);

       } 
    }
}