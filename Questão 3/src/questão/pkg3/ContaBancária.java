
package questão.pkg3;

import java.util.Scanner;


public class ContaBancária 
{
  float saldo;
    
   
    public float AbreConta(float saldo)
    {
    this.saldo = saldo;
               
        if (saldo < 0)
        { 
           
            this.saldo = 0;
        }
   return this.saldo;
   
    }
    
   public float getSaldo() {
       return saldo;
   } 
}
