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
public class Cliente extends Pessoa {
    private String usuario;
    private String senha;
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Cliente(){
        this("", "", "", "");
    }
    
    public Cliente(String nome, String documento, String usuario, String senha) {
        super(nome, documento);
        this.usuario = usuario;
        this.senha = senha;
    }
    
  
    @Override
    public void exibeDados() 
    {
        System.out.println("----------------------------------------");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Login: " + usuario);
        System.out.println("Senha: " + senha);
    }
    
    public void verificarSenha(String Usuario, String senha)
    {
        if(this.usuario.equals(usuario) && this.senha.equals(senha))
        {
            System.out.println("Senha Correta");
        } else {
            System.out.println("Senha Incorreta");
        }

    }
    
    
}
