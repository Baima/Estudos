package questão.pkg4;

import java.util.Scanner;


public class ContaBancária 
{
  float saldo;
    
   
    public float AbreConta(float valor)
    {
    this.saldo = valor;
               
        if (saldo < 0)
        { 
            
            this.saldo = 0;
        }
   return this.saldo;
   
    }
    
    public String mostraDados(float saldo)
    {       String msgERRO;
            if (saldo < 0);
           msgERRO = ("Erro: Saldo negativo encontrado. Pague o aluguel!");
           return msgERRO;
    }
}
