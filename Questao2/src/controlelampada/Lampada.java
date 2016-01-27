
package controlelampada;


public class Lampada 
{
    private String status;
    public Lampada ()
    {
        status = "A lâmpada se encontra desligada";
    }
    
    public void EstaLigada()
    {
        status = "A lâmpada se encontra ligada";
    }
    public void Desligar()
    {
        status = "A lâmpada se encontra desligada";
    }
    public void MeiaLuz()
    {
        status = "A lampada está a MeiaLuz";
    }
    public String LerStatus()
    {
    return status;      
    }
}

