package com.br.fiap.jogo;

public class Dragao implements Elemento {

    @Override
    public void mover(int X, int Y) {
        System.out.println("Movendo dragão para (" + X + "," + Y + ")");
    }

}
