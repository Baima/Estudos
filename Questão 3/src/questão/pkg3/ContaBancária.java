
package questão.pkg3;

public class ContaBancária 
{
  float saldo;
    public void AbreConta(float valor)
    {       
        if (valor < 0)
        {  
            saldo = 0;
        } else 
        {
        saldo = valor;
        }
    }
    
   public float getSaldo() {
       return saldo;
   } 
}
