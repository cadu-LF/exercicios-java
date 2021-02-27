package br.com.unifacef.lista1.exe3;

/**
 *
 * @author Cadu Lourenço
 */
public class Produto {
    
    int id, qtde;
    String descricao;
    float preco;
    
    public Produto(){
    }
    
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public void comprar(int x){
        this.qtde += x;
    }
    
    public void vender(int x){
        if(this.qtde - x >= 0){
            this.qtde -= x;
        } else{
            System.out.println("Venda nao realizada. Quantidade insuficiente no "
                    + "estoque");
        }
    }
    
    public void subir(float x){
        this.preco += x;
    }
    
    public void descer(float x){
        if(this.preco - x >= 0){
            this.preco -= x;
        } else{
            System.out.println("Redução de preço não realizada. Valor do produto"
                    + " ficará negativo com essa redução");
        }
    }
    
    public void mostra(){
        System.out.println("Id: " + this.id + " - Descrição: " + this.descricao
        + " - Quantidade: " + this.qtde + " - Preço: " + this.preco);
    }
}
