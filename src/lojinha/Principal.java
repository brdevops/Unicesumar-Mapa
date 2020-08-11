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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presidente p = new Presidente("Asdrubal Leôncio Correa", "12345");
        p.exibeDados();
        Secretaria s1 = new Secretaria("Fátima", "");
        s1.exibeDados();
        Secretaria s2 = new Secretaria("Ana", "");
        s2.exibeDados();
        Vendedor v1 = new Vendedor ("João", "");
        v1.exibeDados();
        Vendedor v2 = new Vendedor ("Vanessa", "");
        v2.exibeDados();
        Vendedor v3 = new Vendedor("Carlos", "");
        v3.exibeDados();
        Cliente c1 = new Cliente("Marcos", "");
        c1.exibeDados();
        Cliente c2 = new Cliente("Joana", "");
        c2.exibeDados();
        Cliente c3 = new Cliente("Elisa", "");
        c3.exibeDados();
        Cliente c4 = new Cliente("Lucas", "");
        c4.exibeDados();
    }
    
}
