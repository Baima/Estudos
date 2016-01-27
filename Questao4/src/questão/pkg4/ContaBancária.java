package questão.pkg4;




public class ContaBancária 
{
  float saldo;
    
   
    public void AbreConta(float valor)
    {    
        saldo = valor;
    }
    
    public String mostraDados()
    {       String mensagem = "saldo: " + saldo;
            if (saldo < 0) 
            {
           mensagem = ("Erro: Saldo negativo encontrado: " + saldo);
            }
           return mensagem;
    }
}
