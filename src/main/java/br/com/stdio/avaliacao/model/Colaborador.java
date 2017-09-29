package br.com.stdio.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.stdio.avaliacao.enumerate.NivelHierarquico;

@Entity
public class Colaborador {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private String email;
	private NivelHierarquico nivelHierarquico;
	
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
	
	


	
	
}
