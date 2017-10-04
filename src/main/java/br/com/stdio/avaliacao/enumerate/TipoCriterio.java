package br.com.stdio.avaliacao.enumerate;

public enum TipoCriterio {
	
	TECNICO("Técnico"),
	COMPORTAMENTAL("Comportamental");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private TipoCriterio(String descricao) {
		this.descricao = descricao;
	}
}
