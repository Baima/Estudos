package questao6;

import java.util.Scanner;

public class Questao6 
{
    String Nome,Departamento;
    int HorasTrabalhadasNoMes;
    float SalarioPorHora;
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Nome do funcionario:");
        String Nome= scan.nextLine();
        System.out.println("Digite a função do funcionário:");
        String Funcao= scan.nextLine();
        System.out.println("Digite o tempo (em horas) que esse funcionário trabalha por mês");
        int Horas = scan.nextInt();
        System.out.println("Quanto esse funcionário ganha por hora?:");
        float Ganho = scan.nextFloat();
        
        
        
        Empregado mostrar = new Empregado();
        Empregado salario = new Empregado();
        
        mostrar.MostraDados(Nome, Funcao, Horas, Ganho);
        System.out.println("Salário ganho por mês: " +salario.CalculaSalarioMensal(Ganho, Horas));
    }
    
}