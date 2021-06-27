/*Jailson é dono de um cinema com duas salas.

A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F) com mais 12 assentos para pessoas com deficiência.
A sala Beta possui 120 lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para pessoas com deficiência.

Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala Beta de "A Chegada".

Construa um programa em que uma pessoa compre um ingresso para qualquer uma das salas e possa escolher a fileira em que vai sentar.

O programa deve perguntar, em algum momento, o nome do usuário.

Uma vez que o assento seja escolhido, é necessário que o programa exiba quantos lugares ainda estão disponíveis no total e também em quais fileiras.

É importante que o comprador possa escolher a quantidade de ingressos que quer comprar e que ele não possa comprar mais ingressos do que a fileira tenha disponível.

Ao final, o programa deve exibir a mensagem "[COMPRADOR], seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.".*/


import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		 String nome;
		 int alpha,AA=23,AB=23,AC=23,AD=23,AE=24,AF=24,AFD=12;
         int beta,BA=24,BB=24,BC=24,BD=24,BE=24,BED=6;
         int opcao,ingresso=0,lugar;
        
         
         
         alpha=AA+AB+AC+AD+AE+AF;
         beta=BA+BB+BC+BD+BE;
         
         
         	System.out.println("Bem-vindo(a) ao Cinema :) Digite o seu nome: ");
        	 nome=in.nextLine();
         
         	System.out.println("Temos dois filmes em cartaz, informe qual você deseja assistir: 1- As branquela 2- A chegada");
         	opcao=in.nextInt();
         
   	 		
		 	//Sala Alpha
		 
        
         if(opcao==1) {
        	 
        	 
        	   	System.out.println("Bem vindo a sala Alpha, O filme 'As Branqulas' começará em breve. Escolha uma filheira de 1 a 7. (sendo 7 uma filheira com  acentos especiais.)" );
        	   lugar=in.nextInt();
        	 
                if(opcao==1 && lugar<1 || lugar>7) {
                
                    System.out.println("Filheira não disponível, tente novamente...");
                    }
                
                if(opcao==1 && lugar >= 1 && lugar<=7) {
                
                    System.out.println("Quantidade de ingressos você desejada: ");
                    ingresso=in.nextInt();
                
                }
                    
                if(lugar >0 && lugar<5) {
                    
                if(ingresso>0 && ingresso<24) {
                    
                    System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o número de ingressos é " + ingresso+".");
                    System.out.println("Numero de acentos ainda disponivel:" + ((alpha+beta)-ingresso));
                }
                
                else if (ingresso>23)	{
                
                    System.out.println("A filheira não possui essa quantidade assentos disponiveis, tente novamente...");
                }
                    
                } 

                if(lugar >4 && lugar<7) {
                    
                if(ingresso>0 && ingresso<25) {
                    
                    System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o número de ingressos é " + ingresso+".");
                    System.out.println("Numero de acentos ainda disponivel:" + ((alpha+beta)-ingresso));
                }
                
                else if (ingresso>24)	{
                
                    System.out.println("A filheira não possui essa quantidade assentos disponiveis, tente novamente...");
                }
                    
                } 
          
                if(lugar==7 && ingresso<=12) {
                        
                    System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o número de ingressos é " + ingresso+".");
                    System.out.println("numero de acentos ainda disponivel:" + ((alpha+beta)-ingresso));
                        
                }else if(lugar==7 && ingresso>12) {
                        
                    System.out.println("A filheira não possui essa quantidade assentos disponiveis, tente novamente...");
                    System.exit(0);
                    
        	 	}
        	 
         }
         
          
         
         
		 
      		//Sala Beta
         
         
        if(opcao==2) {
        	 

            System.out.println("Bem vindo a sala Alpha, O filme 'As Branqulas' começará em breve. Escolha uma filheira de 1 a 7. (sendo 7 uma filheira com  acentos especiais.)");
            lugar=in.nextInt();
      	 
      	   
                if(opcao==2 && lugar<1 || lugar>6) {
                
                    System.out.println("Filheira não disponível, tente novamente...");
                    }
                
                
                
                if(opcao==2 && lugar >= 1 && lugar <=6) { 
                    System.out.println("Quantidade de ingressos você desejada: ");
                    ingresso=in.nextInt();
                }  
                if(lugar >0 && lugar<6) {
                    
                    
                
                
                if(ingresso>0 && ingresso<25) {
                    
                    System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o número de ingressos é " + ingresso+".");
                    System.out.println("Numero de acentos ainda disponivel:" + ((beta+BED)-ingresso));
                }
                
                else if (ingresso>24)	{
                
                    System.out.println("A filheira não possui essa quantidade assentos disponiveis, tente novamente...");
                }
                    
                } 
                
                if(lugar==6 && ingresso<=6) {
                        
                    System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o número de ingressos é " + ingresso+".");
                    System.out.println("Numero de acentos ainda disponivel:" + ((beta+BED)-ingresso));

                }else if(lugar==6 && ingresso>6) {
                        
                    System.out.println("A filheira não possui essa quantidade assentos disponiveis, tente novamente...");
                    System.exit(0);
                    
                }	
        }
        //Sala inexistente
        if (opcao <=0 || opcao >=3 ) {
   	 		
   	 		System.out.println("Essa sala não existe, tente novamente...");
        }
       	 
    }
}    