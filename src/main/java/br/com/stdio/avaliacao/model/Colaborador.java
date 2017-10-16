package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;

@Entity
public class Colaborador {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private NivelHierarquico nivelHierarquico;
	
	@OneToOne
	@JoinColumn(name="avaliacao_respostas_id")
	private AvaliacaoResposta avaliacaoResposta;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public NivelHierarquico getNivelHierarquico() {
		return nivelHierarquico;
	}
	public void setNivelHierarquico(NivelHierarquico nivelHierarquico) {
		this.nivelHierarquico = nivelHierarquico;
	}
	@Override
	public String toString() {
		return "Colaborador [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", nivelHierarquico="
				+ nivelHierarquico + "]";
	}
	public AvaliacaoResposta getAvaliacaoResposta() {
		return avaliacaoResposta;
	}
	public void setAvaliacaoResposta(AvaliacaoResposta avaliacaoResposta) {
		this.avaliacaoResposta = avaliacaoResposta;
	}
	
	
	

	
	
}
