package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AvaliacaoResposta {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name="avaliacao_id")
	private Avaliacao avaliacao;
	
	@OneToOne
	@JoinColumn(name="avaliador_id")
	private Colaborador avaliador;

	@OneToOne
	@JoinColumn(name="colaborador_id")
	private Colaborador colaborador;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Colaborador getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(Colaborador avaliador) {
		this.avaliador = avaliador;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	@Override
	public String toString() {
		return "AvaliacaoResposta [codigo=" + codigo + ", avaliacao=" + avaliacao + ", avaliador=" + avaliador
				+ ", colaborador=" + colaborador + "]";
	}
	
	
	
}
