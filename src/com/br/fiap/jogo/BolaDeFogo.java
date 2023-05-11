package com.br.fiap.jogo;

public class BolaDeFogo implements Elemento {

    private int poder;

    public BolaDeFogo(int poder) {
        this.poder = poder;
    }

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo bola de fogo para (" + X + "," + Y + ")");
    }

}
