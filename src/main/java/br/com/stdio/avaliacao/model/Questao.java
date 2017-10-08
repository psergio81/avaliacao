package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.stdio.avaliacao.enumerate.TipoQuestao;

@Entity
public class Questao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private TipoQuestao tipoQuestao;

	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoQuestao getTipoQuestao() {
		return tipoQuestao;
	}

	public void setTipoQuestao(TipoQuestao tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}

	
		
}
