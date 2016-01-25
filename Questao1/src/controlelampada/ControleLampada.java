package controlelampada;
import java.util.Scanner;

public class ControleLampada {

    
    public static void main(String[] args) 
    {
     
        Scanner scan = new Scanner (System.in);
        System.out.println ("Digite o estado da lâmpada [1] Ligada [2] Desligada [3] Meia luz");
        
        int lampada = scan.nextInt();
                Lampada lamp = new Lampada();
        
        if (lampada == 1)
        { 
            lamp.Ligar();
        }
        else if (lampada == 2)
        {
            lamp.Desligar();
        }
        else if (lampada == 3)
        {
            lamp.MeiaLuz();
        }
    }
    
}
