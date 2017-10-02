package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AvaliacaoDetalhe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nivelAvaliado;
	
	private String nivelAvaliador;
	
	private String tipoSelecao;
	
	private int quantidadeAvaliadores;

	private int pesoAvaliador;

	@ManyToOne
	@JoinColumn(name="avaliacao_id")
	private Avaliacao avaliacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNivelAvaliado() {
		return nivelAvaliado;
	}

	public void setNivelAvaliado(String nivelAvaliado) {
		this.nivelAvaliado = nivelAvaliado;
	}

	public String getNivelAvaliador() {
		return nivelAvaliador;
	}

	public void setNivelAvaliador(String nivelAvaliador) {
		this.nivelAvaliador = nivelAvaliador;
	}

	public String getTipoSelecao() {
		return tipoSelecao;
	}

	public void setTipoSelecao(String tipoSelecao) {
		this.tipoSelecao = tipoSelecao;
	}

	public int getQuantidadeAvaliadores() {
		return quantidadeAvaliadores;
	}

	public void setQuantidadeAvaliadores(int quantidadeAvaliadores) {
		this.quantidadeAvaliadores = quantidadeAvaliadores;
	}

	public int getPesoAvaliador() {
		return pesoAvaliador;
	}

	public void setPesoAvaliador(int pesoAvaliador) {
		this.pesoAvaliador = pesoAvaliador;
	}

	@Override
	public String toString() {
		return "AvaliacaoDetalhe [codigo=" + codigo + ", avaliacao=" + avaliacao + ", nivelAvaliado=" + nivelAvaliado
				+ ", nivelAvaliador=" + nivelAvaliador + ", tipoSelecao=" + tipoSelecao + ", quantidadeAvaliadores="
				+ quantidadeAvaliadores + ", pesoAvaliador=" + pesoAvaliador + "]";
	}
	
	
	
	
}
