/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesumarMapa;

/**
 *
 * @author brgco
 */
public class Secretaria extends Funcionario {
    
    public Secretaria(){
        this("", "", 0, 0);
    }
    
    public Secretaria(String nome, String documento, double salario, int ramal) {
        super(nome, documento, salario, ramal);
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");  
        System.out.println("Nome da Secretária: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Ramal :" + ramal);
    }
    
}
