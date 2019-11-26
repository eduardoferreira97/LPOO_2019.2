package br.com.poli.campoMinado.mapa;

import java.util.List;

import java.util.ArrayList;

public class Celula {

	private boolean bandeira;
	private boolean bomba;
	private int qtdBombasVizinhas;
	private boolean visivel;
	private boolean celulaInicial;
	private List<Celula> vizinhas;
	private List<Celula> naoVisivel;
	private int linha;
	private int coluna;

	public Celula(boolean bandeira, boolean bomba, boolean visivel, int linha, int coluna) {
		this.celulaInicial = false;
		this.bandeira = bandeira;
		this.bomba = bomba;
		this.visivel = visivel;
		this.vizinhas = new ArrayList<Celula>();
		this.linha = linha;
		this.coluna = coluna;
		this.naoVisivel = new ArrayList<Celula>();
	}

	public boolean isEmBranco() {
		if (this.qtdBombasVizinhas == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void buscarVizinhos(Celula[][] campo) {

		// Conjunto de FOR que percorre a matriz campo e adiciona as vizinhas na lista
		for (int linha = 0; linha < campo.length; linha++) {
			for (int coluna = 0; coluna < campo.length; coluna++) {
				for (int i = -1; i <= 1; i++) {
					for (int j = -1; j <= 1; j++) {

						// Verifica se est� dentro da matriz campo
						if (!(linha + i < 0 || coluna + j > campo.length - 1 || coluna + j < 0 || linha + i > campo.length - 1)) {
							
							// verifica se est� dentro do campo
							if (campo[linha][coluna] != campo[linha + i][coluna + j])

								campo[linha][coluna].vizinhas.add(campo[linha + i][coluna + j]);
						}
					}
				}
			}
		}
	}

	public boolean isCelulaInicial() {
		return celulaInicial;
	}

	public void setCelulaInicial(boolean celulaInicial) {
		this.celulaInicial = celulaInicial;
	}

	public List<Celula> getNaoVisivel() {
		return naoVisivel;
	}

	public void setNaoVisivel(List<Celula> naoVisivel) {
		this.naoVisivel = naoVisivel;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public void setVizinhas(List<Celula> vizinhas) {
		this.vizinhas = vizinhas;
	}

	public boolean isBandeira() {
		return bandeira;
	}

	public void setBandeira(boolean bandeira) {
		this.bandeira = bandeira;
	}

	public boolean isBomba() {
		return bomba;
	}

	public void setBomba(boolean bomba) {
		this.bomba = bomba;
	}

	public int getQtdBombasVizinhas() {
		return qtdBombasVizinhas;
	}

	public void setQtdBombasVizinhas(int qtdBombasVizinhas) {
		this.qtdBombasVizinhas = qtdBombasVizinhas;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public List<Celula> getVizinhas() {
		return vizinhas;
	}

}