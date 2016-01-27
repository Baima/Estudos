package questão.pkg4;




public class ContaBancária 
{
  float saldo;
    
   
    public void AbreConta(float valor)
    {    
        saldo = valor;
    }
    
    public String mostraDados(float saldo)
    {       String msgERRO;
            if (saldo < 0);
           msgERRO = ("Erro: Saldo negativo encontrado. Pague o aluguel!");
           return msgERRO;
    }
}
