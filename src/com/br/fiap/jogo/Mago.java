package com.br.fiap.jogo;

public class Mago extends Jogador implements Elemento {

    private int mp;

    public Mago(String nome) {
        super(nome);
        this.mp = 100;
    }

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo " + getNome() + " para (" + X + "," + Y + ")");
    }

}
