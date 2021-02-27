package br.com.unifacef.lista1.exe3;

import javax.swing.JOptionPane;
/**
 *
 * @author Cadu Lourenço
 */
public class TestaProduto {

    public static void main(String[] args) {
        
        Produto p1 = new Produto(1, "Toddy", 100, 1.50f);
        p1.comprar(10);
        p1.mostra();
        p1.vender(200);
        p1.mostra();
        p1.vender(60);
        p1.mostra();
        p1.subir(0.25f);
        p1.mostra();
        p1.descer(2.00f);
        p1.mostra();
        p1.descer(0.75f);
        
        Produto p2 = new Produto();
        p2.id = Integer.parseInt(JOptionPane.showInputDialog("Id do produto: "));
        p2.descricao = JOptionPane.showInputDialog("Descrição do produto: ");
        p2.qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto: "));
        p2.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto: "));
        p2.comprar(Integer.parseInt(JOptionPane.showInputDialog("Quantidade"+
                " que se deseja comprar: ")));
        p2.mostra();
        p2.vender(Integer.parseInt(JOptionPane.showInputDialog("Quantidade"+
                " que se deseja vender: ")));
        p2.mostra();
        p2.subir(Float.parseFloat(JOptionPane.showInputDialog("Valor"+
                " que se deseja aumentar o preço: ")));
        p2.mostra();
        p2.descer(Float.parseFloat(JOptionPane.showInputDialog("Valor"+
                " que se deseja abaixar o preço: ")));
        p2.mostra();
    }
}
