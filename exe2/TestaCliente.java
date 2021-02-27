/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe2;

/**
 *
 * @author paulo
 */
public class TestaCliente {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente("Fularno", 1, 1, 5000);
        obj1.realizarDeposito(545.5f);
        obj1.realizarSaque(2500.25f);
        System.out.println(obj1.mostraDados());
        
        Cliente obj2 = new Cliente("Beltrano", 2, 2, 1000);
        obj2.realizarDeposito(6000);
        obj2.realizarSaque(280.80f);
        System.out.println(obj2.mostraDados());
        
    }
    
}
