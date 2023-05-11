package com.br.fiap.jogo;

public class Guerreiro extends Jogador implements Elemento {

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo " + getNome() + " para (" + X + "," + Y + ")");
    }

}
