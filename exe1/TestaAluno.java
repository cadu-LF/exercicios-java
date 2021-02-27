/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaAluno {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do aluno: ");
        Aluno a1 = new Aluno(nome, 1, 19, 5.6f, 4.4f);
        a1.notaFinal();
        System.out.println(a1.dadosAluno());
        System.out.println("Aprovado: " + a1.passou());
        
        Aluno a2 = new Aluno("Sidney", 2, 20, 9f, 8.76f);
        a2.notaFinal();
        System.out.println(a2.dadosAluno());
        System.out.println("Aprovado: " + a2.passou());
    }
    
}
