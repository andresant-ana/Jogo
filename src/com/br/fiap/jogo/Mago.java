package com.br.fiap.jogo;

public class Mago extends Jogador implements Elemento {

    private int mp;

    public Mago() {
        super();
        this.mp = 100;
    }

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo mago para (" + X + "," + Y + ")");
    }

}
