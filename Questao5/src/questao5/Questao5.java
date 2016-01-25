package questao5;

import java.util.Scanner;


public class Questao5 {

    
    public static void main(String[] args)
    {   Scanner scan = new Scanner (System.in);
          
        System.out.println("qual o nome do time?:");
           String a  = scan.nextLine();
           System.out.println("qual a cor do uniforme?");
           String b  = scan.nextLine();
                   
                   
                   
            Time cor = new Time();
            Time nome = new Time(); 
        System.out.println(nome.NomeTIME(a));
        System.out.println(cor.CorTime(b));
    
    
    
    
    
    }
    
}
