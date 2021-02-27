package br.com.unifacef.lista1.exe4;

/**
 *
 * @author Cadu Lourenço
 */
public class Rio {
    
    String nome;
    float nivel;
    boolean poluido;
    
    public Rio(){
    }
    
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(int x){
        this.nivel += x;
    }
    
    public void ensolarar(int x){
        if(this.nivel - x >= 0){
            this.nivel -= x;
        } else{
            System.out.println("ERRO. A quantidade de água que secou é maior que"
                    + " a quantidade que o rio " + this.nome + " possuía");
        }
    }
    
    public void limpar(){
        this.poluido = false;
    }
    
    public void sujar(){
        this.poluido = true;
    }
    
    public void mostra(){
        System.out.println("Nome do Rio: " + this.nome + " - Nível do Rio: " + 
                this.nivel + " - Poluído? " + this.poluido);
    }
    
}
