/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojinha;

/**
 *
 * @author brgco
 */
public class Vendedor extends Funcionario {
    
    private double comissao;
    
    public Vendedor(){
        this("", "", 0, 0, 0);
    }
    
    public Vendedor(String nome, String documento, double salario, int ramal, double comissao) {
        super(nome, documento, salario, ramal);
        this.comissao = comissao;
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");  
        System.out.println("Nome do Vendedor: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Ramal :" + ramal);
    }
    
    public void SalarioMesComComissao()
    {
        double salarioMesComComissao;
        salarioMesComComissao = salario + comissao;
        System.out.println("O salário mensal com comissão é de: R$" + salarioMesComComissao);
    }
    
    
}
