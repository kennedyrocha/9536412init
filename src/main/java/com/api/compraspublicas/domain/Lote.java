package com.api.compraspublicas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("NR_LOTE")
	private Integer numeroLote;
	
	@JsonProperty("DS_LOTE")
	private String descricaoLote;
	
	@JsonProperty("CD_BOLEANO_D_DIVISIVEL")
	private boolean cdBoleanoDDivisivel;
	
	@ManyToOne
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL)
	private List<Item> itens = new ArrayList<>();
	
	@JsonProperty("Inabilitados")
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL)
	private List<Inabilitado> inabilitados = new ArrayList<>();
	
	@JsonProperty("Vencedores")
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL)
	private List<Vencedor> vencedores = new ArrayList<>();
	
	@JsonProperty("Reversoes")
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL)
	private List<Reversao> reversoes = new ArrayList<>();
	
	@JsonProperty("Reabilitacoes")
	@OneToMany(mappedBy="lote", cascade=CascadeType.ALL)
	private List<Reabilitacao> reabilitacoes = new ArrayList<>();
	
	public Lote() {
	}

	public Lote(Integer id, String descricaoLote, boolean cdBoleanoDDivisivel, DetalheLicitacao detalheLicitacao, Integer numeroLote) {
		super();
		this.id = id;
		this.descricaoLote = descricaoLote;
		this.cdBoleanoDDivisivel = cdBoleanoDDivisivel;
		this.detalheLicitacao = detalheLicitacao;
		this.numeroLote = numeroLote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricaoLote() {
		return descricaoLote;
	}

	public void setDescricaoLote(String descricaoLote) {
		this.descricaoLote = descricaoLote;
	}

	public boolean isCdBoleanoDDivisivel() {
		return cdBoleanoDDivisivel;
	}

	public void setCdBoleanoDDivisivel(boolean cdBoleanoDDivisivel) {
		this.cdBoleanoDDivisivel = cdBoleanoDDivisivel;
	}

	public Integer getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public DetalheLicitacao getDetalheLicitacao() {
		return detalheLicitacao;
	}

	public void setDetalheLicitacao(DetalheLicitacao detalheLicitacao) {
		this.detalheLicitacao = detalheLicitacao;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Inabilitado> getInabilitados() {
		return inabilitados;
	}

	public void setInabilitados(List<Inabilitado> inabilitados) {
		this.inabilitados = inabilitados;
	}

	public List<Vencedor> getVencedores() {
		return vencedores;
	}

	public void setVencedores(List<Vencedor> vencedores) {
		this.vencedores = vencedores;
	}

	public List<Reversao> getReversoes() {
		return reversoes;
	}

	public void setReversoes(List<Reversao> reversoes) {
		this.reversoes = reversoes;
	}

	public List<Reabilitacao> getReabilitacoes() {
		return reabilitacoes;
	}

	public void setReabilitacoes(List<Reabilitacao> reabilitacoes) {
		this.reabilitacoes = reabilitacoes;
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
		Lote other = (Lote) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
