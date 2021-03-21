package com.api.compraspublicas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("IdItem")
	private Integer idItem;
	
	@JsonProperty("_id")
	private String idExterno;
	
	@JsonProperty("NR_LOTE")
	private Integer numeroLote;
	
	@JsonProperty("DS_ITEM")
	private String descricaoItem;
	
	@JsonProperty("QT_ITENS")
	private Integer quantidadeItem;
	
	@JsonProperty("NR_ITEM")
	private Integer numeroItem;
	
	@JsonProperty("VL_UNITARIO_ESTIMADO")
	private double valorUnitarioEstimado;
	
	@JsonProperty("CD_BOLEANO_D_DIVISIVEL")
	private boolean cdBoleanoDDivisivel;
	
	@ManyToOne
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	public Lote() {
	}

	public Lote(Integer id, Integer idItem, String idExterno, Integer numeroLote, String descricaoItem,
			Integer quantidadeItem, Integer numeroItem, double valorUnitarioEstimado, boolean cdBoleanoDDivisivel,
			DetalheLicitacao detalheLicitacao) {
		super();
		this.id = id;
		this.idItem = idItem;
		this.idExterno = idExterno;
		this.numeroLote = numeroLote;
		this.descricaoItem = descricaoItem;
		this.quantidadeItem = quantidadeItem;
		this.numeroItem = numeroItem;
		this.valorUnitarioEstimado = valorUnitarioEstimado;
		this.cdBoleanoDDivisivel = cdBoleanoDDivisivel;
		this.detalheLicitacao = detalheLicitacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getIdExterno() {
		return idExterno;
	}

	public void setIdExterno(String idExterno) {
		this.idExterno = idExterno;
	}

	public Integer getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public Integer getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(Integer numeroItem) {
		this.numeroItem = numeroItem;
	}

	public double getValorUnitarioEstimado() {
		return valorUnitarioEstimado;
	}

	public void setValorUnitarioEstimado(double valorUnitarioEstimado) {
		this.valorUnitarioEstimado = valorUnitarioEstimado;
	}

	public boolean isCdBoleanoDDivisivel() {
		return cdBoleanoDDivisivel;
	}

	public void setCdBoleanoDDivisivel(boolean cdBoleanoDDivisivel) {
		this.cdBoleanoDDivisivel = cdBoleanoDDivisivel;
	}

	public DetalheLicitacao getDetalheLicitacao() {
		return detalheLicitacao;
	}

	public void setDetalheLicitacao(DetalheLicitacao detalheLicitacao) {
		this.detalheLicitacao = detalheLicitacao;
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
