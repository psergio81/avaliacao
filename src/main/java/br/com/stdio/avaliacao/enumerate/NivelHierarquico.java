package br.com.stdio.avaliacao.enumerate;

public enum NivelHierarquico {

	OPERACIONAL("Operacional"),
	LIDERANCA("Liderança"),
	GERENCIA("Gerência"),
	DIRETORIA("Diretoria");
	
	private String descricao;

	private NivelHierarquico(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
