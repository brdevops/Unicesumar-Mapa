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
    
    public Presidente(String pessoa, String documento) {
        super(pessoa, documento);
    }
    
    @Override
    public void exibeDados() 
    {
        System.out.println("Nome do Presidente: " + pessoa);
        System.out.println("Documento: " + documento);
    }
    
}