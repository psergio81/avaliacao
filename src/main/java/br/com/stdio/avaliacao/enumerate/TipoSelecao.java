package br.com.stdio.avaliacao.enumerate;

public enum TipoSelecao {
	
	ALEATORIA("Aleatória");
	
	private String descricao;

	private TipoSelecao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
