/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

/**
 *
 * @author Gabriel
 */
public class Empregado 
{
  
    public void MostraDados(String Nome,String Departamento,int HorasTrabalhadasNoMes,float SalarioPorHora)
    {
        System.out.println("Nome do funcionário: "+Nome);
        System.out.println("Departamento: "+Departamento);
        System.out.println("Horas Trabalhadas: "+HorasTrabalhadasNoMes);
        System.out.println("Salário/Hora: "+SalarioPorHora);
    
    }
    
    
    public float CalculaSalarioMensal(float ValorHora, int Horas)
    {
        float SalarioMensal= ValorHora*Horas;
        return SalarioMensal;
                   
    }




}


    