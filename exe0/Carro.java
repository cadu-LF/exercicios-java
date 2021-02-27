package br.com.unifacef.lista1.exe0;

import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Lourenço
 */

// a classe serve apenas de modelo
public class Carro { 
    
    // declaração das variáveis
    // Java possui tipagem estática, ou seja, é forte
    String marca, modelo; // String é uma classe, pois começa com maiúscula
    int ano; // int é primitivo, pois começa com minúscula
    boolean motor; // boolean é primitivo, pois começa com minúscula
    float velAtual; // float é primitivo , pois começa com minúscula
    /** o tipo primitiva só recebe um número e não podem ser utilizados métodos
     * para realizar operações com eles
     */
    
    // método contrutor
    // Carro obj2 = new Carro(2016, "Fiat", "Palio", true, 40);

    public Carro(int ano, String marca, String modelo, boolean motor, float velAtual){
        
        // this: o objeto que chama modelo
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.velAtual = velAtual;
        
    }
    
    // esse contrutor foi criado para chamadas do contrutor que não passam valores de parâmetro
    public Carro(){
    
    }
    
    public void mostra(){
        System.out.println("Ano: " + this.ano + "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + "\nMotor: " + this.motor + 
                "\nVelocidade: " + this.velAtual);
    }
    
    public void mostraPane(){
        JOptionPane.showMessageDialog(null, "Ano: " + this.ano + "\nMarca: " + 
                this.marca + "\nModelo: " + this.modelo + "\nMotor: " + 
                this.motor + "\nVelocidade: " + this.velAtual);
    }
    
    // ! é negação
    public void ligar(){
        if(!this.motor){ // se motor for falso
            this.motor = true;
        }
    }
    
    public void desligar(){
        if(this.motor){ // se motor for verdadiro
            this.motor = false;
            this.velAtual = 0;
        }
    }
    
    public void acelerar(float x){
        if(this.motor){
            this.velAtual += x;
        }
    }
    
    public void frear(float x){
        if(this.motor){
            if(this.velAtual >= x){
                this.velAtual -= x;
            }
            else{
                System.out.println("não foi possivel frear. Velocidade negativa");
            }
        }
        else{
            System.out.println("não foi possível frar. motor desligado");
        }
    }
}
