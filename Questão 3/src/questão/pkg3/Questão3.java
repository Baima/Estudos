
package questão.pkg3;

import java.util.Scanner;


public class Questão3
{
    float PrimeiroS;
    
    public static void main(String[] args) 
    {
        System.out.println("bem vindo.");
        System.out.println("digite seu saldo inicial");
        Scanner scan = new Scanner (System.in);
        float primeiroS = scan.nextInt();
        
        
        ContaBancária abrir = new ContaBancária();
        ContaBancária conta = new ContaBancária();
        conta.AbreConta(primeiroS);
        System.out.println("Seu saldo é de:" +  conta.getSaldo());
    }
    
}
