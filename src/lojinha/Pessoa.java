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
public abstract class Pessoa
{
    protected String pessoa;
    protected String documento;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }    
    
    public Pessoa(String pessoa, String documento) 
    {
        this.pessoa = pessoa;
        this.documento = documento;
    }
    
    public void exibeDados() 
    {
        System.out.println("Nome da pessoa: " + pessoa);
        System.out.println("Documento: " + documento);
    }
    
}
