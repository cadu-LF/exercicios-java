package br.com.unifacef.lista1.exe4;

import javax.swing.JOptionPane;
/**
 *
 * @author Cadu Lourenço
 */
public class TestaRio {
     public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do Rio: ");
        int nivel = Integer.parseInt(JOptionPane.showInputDialog("Nível do Rio: "));
        Rio r1 = new Rio(nome, nivel, true);
        r1.mostra();
        r1.chover(Integer.parseInt(JOptionPane.showInputDialog("Nível que" +
                " o Rio vai aumentar: ")));
        r1.mostra();
        r1.ensolarar(Integer.parseInt(JOptionPane.showInputDialog("Nível que" +
                " o Rio vai diminuir: ")));
        r1.mostra();
        r1.limpar();
        r1.mostra();
        r1.sujar();
        r1.mostra();
        
        Rio r2 = new Rio();
        r2.nome = JOptionPane.showInputDialog("Nome do Rio: ");
        r2.nivel = Integer.parseInt(JOptionPane.showInputDialog("Nível do Rio: "));
        r2.poluido = false;
        r2.mostra();
        r2.chover(Integer.parseInt(JOptionPane.showInputDialog("Nível que" +
                " o Rio vai aumentar: ")));
        r2.mostra();
        r2.ensolarar(Integer.parseInt(JOptionPane.showInputDialog("Nível que" +
                " o Rio vai diminuir: ")));
        r2.mostra();
        r2.sujar();
        r2.mostra();
        r2.limpar();
        r2.mostra();
    }
}
