
package questão.pkg4;

import java.util.Scanner;


public class Questão4
{
  
    
    public static void main(String[] args) 
    {   
        
        System.out.println("bem vindo.");
        System.out.println("digite seu saldo inicial");
        Scanner scan = new Scanner (System.in);
        
        float primeiroS = scan.nextInt();
       
     
        ContaBancária abrir = new ContaBancária();
        ContaBancária msg = new ContaBancária();
        
        System.out.println(msg.mostraDados(primeiroS));
        System.out.println("Seu saldo é de:" +  abrir.AbreConta(primeiroS));
    }
    
}