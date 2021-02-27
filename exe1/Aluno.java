/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.lista1.exe1;

/**
 *
 * @author Cadu Lourenço
 */
public class Aluno {
    
    int nroAluno, idade;
    String nome;
    float p1, p2;
    
    public Aluno(String nome, int nroAluno, int idade, float p1, float p2){
    
        this.nome = nome;
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        
    }
    
    public float notaFinal(){
    
        return (this.p1 + this.p2) / 2 ; 
    
    }
    
    public String dadosAluno(){
    
        return "Nome: " + this.nome + " - Idade: " + this.idade + 
                " - Nro Aluno:" + this.nroAluno + " - Média: " + 
                this.notaFinal();
    
    }
    
    public boolean passou(){
    
        float aux = this.notaFinal();
        return aux >= 6;
    
    }
    
}
