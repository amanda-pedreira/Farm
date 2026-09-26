package br.com.amandaluanapedreira;

public class Terreno {
 
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batataP) {
        this.batata = batataP;
    }

    public void plantar(Cenoura cenouraP) {
        this.cenoura = cenouraP;
        
    }

    public void plantar(Morango morangoP) {
        this.morango = morangoP;
        
    }

    // mas nem escrevi a variavel de Celeiro celeiro la em cima
    public void colher(Celeiro celeiro) {
        if (){
            celeiro.armazenarBatata();
            this.batata = null;

        }else if(cenoura != null){
            celeiro.armazenarCenoura();
            this.cenoura = null;

        }else if(morango != null){
            celeiro.armazenarMorango();
            this.morango = null;
        }
    }

    public boolean estaOcupado() {
        if (batata != null || cenoura != null || morango != null){
            return true;
        }
        return false;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}