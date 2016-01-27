
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
       
     
        ContaBancária conta = new ContaBancária();
        conta.AbreConta(primeiroS);
        System.out.println(conta.mostraDados());
    }
    
}