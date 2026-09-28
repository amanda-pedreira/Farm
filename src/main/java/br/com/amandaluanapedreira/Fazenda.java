package br.com.amandaluanapedreira;

import java.util.List;
import java.util.ArrayList;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda(){
        this.terrenos = new ArrayList<>();
        // capacidade, qtde batata, cenoura e morango
        this.celeiro = new Celeiro(30, 4, 3, 2);


        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) {
        // pra pegar a cordenada exata
        Terreno terreno = getTerreno(x, y);

        if(terreno != null && terreno.estaOcupado() == false){
            celeiro.consumirBatata();
            terreno.plantar(new Batata(1, 1, 3));
        }
        
    }

    public void plantarCenoura(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if(terreno != null && terreno.estaOcupado() == false){
            celeiro.consumirCenoura();
            terreno.plantar(new Cenoura(1, 1, 3));
        }
    }

    public void plantarMorango(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if(terreno != null && terreno.estaOcupado() == false){
            celeiro.consumirMorango();
            terreno.plantar(new Morango(1, 1, 3));
        }
    }

    public Terreno getTerreno(int x, int y) {

        for (int i = 0; i < terrenos.size(); i++) {

            Terreno terreno = terrenos.get(i);

            if (terreno.getX() == x && terreno.getY() == y) {
                return terreno;
            }
        }

        return null;
    }

    public void colher(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (terreno != null) {
            terreno.colher(celeiro);
        }
    }

    public Celeiro getCeleiro() {
        return celeiro; 
    }
}
