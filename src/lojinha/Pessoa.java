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
    protected String nome;
    protected String documento;

    public String getPessoa() {
        return nome;
    }

    public void setPessoa(String pessoa) {
        this.nome = pessoa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }    
    
    public Pessoa(){
        this("", "");
    }
    
    public Pessoa(String nome, String documento) 
    {
        this.nome = nome;
        this.documento = documento;
    }
    
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Documento: " + documento);
    }
    
}
