
package controlelampada;


public class Lampada 
{
    private String status;
          
    public void Ligar()
    {
        status = "Ligada";
    }
    public void Desligar()
    {
        status = "Desligada";
    }
    public void MeiaLuz()
    {
        status = "MeiaLuz";
    }
    public String LerStatus()
    {
    return status;      
    }
}

