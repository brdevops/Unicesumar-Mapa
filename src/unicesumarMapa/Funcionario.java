/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesumarMapa;

/**
 *
 * @author Bruno Gonçalves Costa - Matricula
 */
public abstract class Funcionario extends Pessoa {
    protected double salario;
    protected int ramal; 
    
    public Funcionario(){
        this("", "", 0, 0);
    }
    
    public Funcionario(String nome, String documento, double salario, int ramal) {
        super(nome, documento);
        this.salario = salario;
        this.ramal = ramal;
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Ramal :" + ramal);
    }
    
    public void calculaSalarioAnual()
    {
        double salarioAnual;
        salarioAnual = salario * 12;
        System.out.println("O salário anual é de: R$" + salarioAnual);
    }
    
}
