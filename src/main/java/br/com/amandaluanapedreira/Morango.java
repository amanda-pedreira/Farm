package br.com.amandaluanapedreira;

public class Morango {
 
    private int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 3;

    public Morango(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
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
        return "images/batata" + tamanho + ".png";
    }

}