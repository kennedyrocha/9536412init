package com.api.compraspublicas.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class UnidadeCompradora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	@JsonProperty("Data")
	private String data;
	
	private Integer idComprador;
	private Integer idUnidadeCompradora;
	private String nomeComprador;
	private String nomeUnidadeCompradora;
	
	@JsonProperty("Cidade")
	private String cidade;
	
	@JsonProperty("CD_MUNICIPIO_IBGE")
	private String cdMunicipioIbge;
	
	@JsonProperty("UF")
	private String uf;

	public UnidadeCompradora() {
	}

	public UnidadeCompradora(Integer id, DetalheLicitacao detalheLicitacao, String data, Integer idComprador,
			Integer idUnidadeCompradora, String nomeComprador, String nomeUnidadeCompradora, String cidade,
			String cdMunicipioIbge, String uf) {
		super();
		this.id = id;
		this.detalheLicitacao = detalheLicitacao;
		this.data = data;
		this.idComprador = idComprador;
		this.idUnidadeCompradora = idUnidadeCompradora;
		this.nomeComprador = nomeComprador;
		this.nomeUnidadeCompradora = nomeUnidadeCompradora;
		this.cidade = cidade;
		this.cdMunicipioIbge = cdMunicipioIbge;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DetalheLicitacao getDetalheLicitacao() {
		return detalheLicitacao;
	}

	public void setDetalheLicitacao(DetalheLicitacao detalheLicitacao) {
		this.detalheLicitacao = detalheLicitacao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getIdComprador() {
		return idComprador;
	}

	public void setIdComprador(Integer idComprador) {
		this.idComprador = idComprador;
	}

	public Integer getIdUnidadeCompradora() {
		return idUnidadeCompradora;
	}

	public void setIdUnidadeCompradora(Integer idUnidadeCompradora) {
		this.idUnidadeCompradora = idUnidadeCompradora;
	}

	public String getNomeComprador() {
		return nomeComprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public String getNomeUnidadeCompradora() {
		return nomeUnidadeCompradora;
	}

	public void setNomeUnidadeCompradora(String nomeUnidadeCompradora) {
		this.nomeUnidadeCompradora = nomeUnidadeCompradora;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCdMunicipioIbge() {
		return cdMunicipioIbge;
	}

	public void setCdMunicipioIbge(String cdMunicipioIbge) {
		this.cdMunicipioIbge = cdMunicipioIbge;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeCompradora other = (UnidadeCompradora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
