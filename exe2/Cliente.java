package br.com.unifacef.lista1.exe2;

/**
 *
 * @author Cadu Lourenço
 */
public class Cliente {
    
    String nome;
    int nroConta, nroAgencia;
    float saldo;
    
    public Cliente(String nome, int nroConta, int nroAgencia, float saldo){
    
        this.nome = nome;
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.saldo = saldo;
    
    }
    
    public void realizarDeposito(float x){
    
        this.saldo += x;
    
    }
    
    public void realizarSaque(float x){
    
        if(this.saldo - x > 0){
        
            this.saldo -= x;
            
        }
        else{
        
            System.out.println("Saque não realizado. Saque maior que o saldo");
        
        }
    
    }
    
    public void mostra(){
        System.out.println("Número da conta:" + this.nroConta + "\nNúmero da Agência:" + 
                this.nroAgencia + "\nNome:" + this.nome + "\nSaldo: " + 
                this.saldo);
    }
    
    public String mostraDados(){
    
        return "Número da conta:" + this.nroConta + "\nNúmero da Agência:" + 
                this.nroAgencia + "\nNome:" + this.nome + "\nSaldo: " + 
                this.saldo;
    
    }
    
}
