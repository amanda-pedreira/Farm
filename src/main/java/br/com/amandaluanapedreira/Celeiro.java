package br.com.amandaluanapedreira;

public class Celeiro {

    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade, int qtdeBatatas, int qtdeCenouras,  int qtdeMorangos) {
        this.capacidade = capacidade;
        this.qtdeBatatas = qtdeBatatas;
        this.qtdeCenouras = qtdeCenouras;
        this.qtdeMorangos = qtdeMorangos;
    }
    
    public void armazenarBatata() {
        if(celeiroCheio()){
            throw new RuntimeException("Celeiro cheio!");
        }
        qtdeBatatas = qtdeBatatas + 2;
    }
    
    public void armazenarCenoura() {
        if(celeiroCheio()){
            throw new RuntimeException("Celeiro cheio!");
        }
        qtdeCenouras = qtdeCenouras + 2;        
    }
    
    public void armazenarMorango() {
        if(celeiroCheio()){
            throw new RuntimeException("Celeiro cheio!");
        }
        qtdeMorangos = qtdeMorangos + 2;        
    }
    
    public void consumirBatata() {
        if(qtdeBatatas <= 0 ){
            throw new RuntimeException("Não há batatas!");
        }
        qtdeBatatas = qtdeBatatas - 1;
    }
    
    public void consumirCenoura() {
        if(qtdeCenouras <= 0 ){
            throw new RuntimeException("Não há cenouras!");
        }
        qtdeCenouras = qtdeCenouras - 1;    
    }
    
    public void consumirMorango() {
        if(qtdeMorangos <= 0 ){
            throw new RuntimeException("Não há morangos!");
        }
        qtdeMorangos = qtdeMorangos - 1;
        
    }

    public int getEspacoDisponivel() {
        int espacoDisponivel = capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
        return espacoDisponivel;
    }
    
    public int getOcupacao() {
        int total = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        // int percentual = (total / capacidade) * 100;
        int percentual = (total * 100) / capacidade;
        return percentual;
    }

    public boolean celeiroCheio() {
        int total = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        // o -2 é porque geramos 2 unidades, então se tiver menos de 2 de espaço, não pode colher. O "== 0" poderia dar erro 
        if (capacidade - total < 2){
            return true;
        }
        return false;   
        
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

}
