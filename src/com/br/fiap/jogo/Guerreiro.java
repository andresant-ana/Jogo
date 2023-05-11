package com.br.fiap.jogo;

public class Guerreiro extends Jogador implements Elemento {

    public Guerreiro() {
        super();
    }

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo guerreiro para X: " + X + ", Y: " + Y);
    }

}
