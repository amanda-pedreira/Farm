package br.com.amandaluanapedreira;

public class Cenoura {
 
    private int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 3;

    public Cenoura(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer() {
        this.tempoDeVida++;
        
        
        if(this.tempoDeVida % this.tempoDeCrescimento == 0 && tamanho < 4){
            this.tamanho++;
        }
        
    }

    public boolean podeColher() {
        if (tamanho == 4){
            return true;
        }
        // sem esse false estava dando erro
        return false;
        
    }

    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }
 

}
