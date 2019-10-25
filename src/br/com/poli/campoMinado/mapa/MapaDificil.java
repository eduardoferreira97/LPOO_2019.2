package br.com.poli.campoMinado.mapa;

import br.com.poli.campoMinado.Dificuldade;

public class MapaDificil extends Mapa {
	
	public static final Dificuldade TAMANHO = Dificuldade.DIFICIL;
	public static final int BOMBAS = 99;

	public MapaDificil() {
		super(TAMANHO.getValor(), BOMBAS);
	}

	public static Dificuldade getTamanho() {
		return TAMANHO;
	}

	public static int getBombas() {
		return BOMBAS;
	}
}
