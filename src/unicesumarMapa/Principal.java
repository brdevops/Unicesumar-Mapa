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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presidente p = new Presidente("Asdrubal Leôncio Correa", "", 15000, 10);
        p.exibeDados();
        p.calculaSalarioAnual();
        Secretaria s1 = new Secretaria("Fátima", "", 1500, 1);
        s1.exibeDados();
        Secretaria s2 = new Secretaria("Ana", "", 2000, 2);
        s2.exibeDados();
        s2.calculaSalarioAnual();
        Vendedor v1 = new Vendedor ("João", "", 500, 3, 50);
        v1.SalarioMesComComissao();
        v1.exibeDados();
        Vendedor v2 = new Vendedor ("Vanessa", "", 500, 4, 50);
        v2.SalarioMesComComissao();
        v2.exibeDados();
        Vendedor v3 = new Vendedor("Carlos", "", 500, 5, 50);
        v3.SalarioMesComComissao();
        v3.exibeDados();
        Cliente c1 = new Cliente("Marcos", "", "Marcos", "123456");
        c1.exibeDados();
        Cliente c2 = new Cliente("Joana", "", "Joana", "123456");
        c2.exibeDados();
        Cliente c3 = new Cliente("Elisa", "", "Elisa", "123456");
        c3.exibeDados();
        Cliente c4 = new Cliente("Lucas", "", "Lucas", "teste");
        c4.exibeDados();
        c4.verificarSenha("Lucas", "123456");
        c4.verificarSenha("Lucas", "Segredo");
        c4.verificarSenha("Lucas", "teste");
    }
    
}
