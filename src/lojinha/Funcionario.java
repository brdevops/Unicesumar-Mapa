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
public abstract class Funcionario extends Pessoa {
    protected double salario;
    protected int ramal;
    
    public Funcionario(String pessoa, String documento) {
        super(pessoa, documento);
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("Nome do Funcionário: " + pessoa);
        System.out.println("Documento: " + documento);
    }
    
}
