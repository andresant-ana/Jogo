package com.br.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		Guerreiro guerreiro = new Guerreiro("Légolas");
		guerreiro.receberDano(20);
		guerreiro.receberCura(10);
		guerreiro.ganharExperiencia(50);
		guerreiro.receberAntidoto();
		guerreiro.mover(500, 800);

		System.out.println("Guerreiro: " + guerreiro.getNome() + " tem " + guerreiro.getHp() + " pontos de vida e " + guerreiro.getXp() + " pontos de experiência.");

		Mago mago = new Mago("Merlin");
		mago.receberDano(5);
		mago.receberCura(15);
		mago.ganharExperiencia(30);
		mago.receberAntidoto();
		mago.mover(100, 200);

		System.out.println("Mago: " + mago.getNome() + " tem " + mago.getHp() + " pontos de vida e " + mago.getXp() + " pontos de experiência.");

		BolaDeFogo bolaDeFogo = new BolaDeFogo(50);
		bolaDeFogo.mover(100, 200);

		Dragao dragao = new Dragao();
		dragao.mover(500, 800);

		Fase fase = new Fase();
		fase.Carregar(guerreiro);
		fase.Carregar(mago);
		fase.Carregar(bolaDeFogo);
		fase.Carregar(dragao);
	}
	
}
