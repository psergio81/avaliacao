package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.stdio.avaliacao.enumerate.TipoCriterio;

@Entity
public class Criterio {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private TipoCriterio tipoCriterio;

	
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

	public TipoCriterio getTipoCriterio() {
		return tipoCriterio;
	}

	public void setTipoCriterio(TipoCriterio tipoCriterio) {
		this.tipoCriterio = tipoCriterio;
	}

	
		
}
