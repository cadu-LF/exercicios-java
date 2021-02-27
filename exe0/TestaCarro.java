
package br.com.unifacef.lista1.exe0;

/**
 *
 * @author Carlos Lourenço
 */
public class TestaCarro {

    public static void main(String[] args) {
        
        //obj1
        // Tipo nome = new Tipo()
        Carro obj1 = new Carro();
        obj1.ano = 2018;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.motor = false;
        obj1.velAtual = 0;
        // vamos mostrar ao usuário
        obj1.mostra();
        obj1.ligar();
        obj1.acelerar(10);
        obj1.mostraPane();
 
        // criar um objeto significa chamar o método construtor
        Carro obj2 = new Carro(2016, "Fiat", "Palio", true, 40);
        obj2.mostra();
        obj2.desligar();
        obj2.mostraPane();
        
        Carro obj3 = new Carro(2021, "Ferrari", "488", false, 0);
        obj3.mostra();
        obj3.ligar();
        obj3.acelerar(100);
        obj3.mostraPane();
    }
    
}
