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
public class Presidente extends Funcionario {
    
    public Presidente(){
        this("", "", 0, 0);
    }
    
    public Presidente(String nome, String documento, double salario, int ramal) {
        super(nome, documento, salario, ramal);
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");        
        System.out.println("Nome do Presidente: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Ramal :" + ramal);
    }
       
}
