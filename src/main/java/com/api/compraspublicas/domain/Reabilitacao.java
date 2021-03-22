package com.api.compraspublicas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Reabilitacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("IdItem")
	private Integer idItem;
	
	@Column(length=4000)
	@JsonProperty("Justificativa")
	private String justificativa;
	
	@JsonProperty("IdFornecedor")
	private String idFornecedor;
	
	@JsonProperty("Tipo")
	private String tipo;
	
	@JsonProperty("DataReabilitacao")
	private String dataReabilitacao;
	
	@JsonProperty("HoraReabilitacao")
	private String horaReabilitacao;
	
	@ManyToOne
	@JoinColumn(name="lote_id")
	private Lote lote;
	
	@ManyToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;

	public Reabilitacao() {
	}

	public Reabilitacao(Integer id, Integer idItem, String justificativa, String idFornecedor, String tipo,
			String dataReabilitacao, String horaReabilitacao, Lote lote, Fornecedor fornecedor, Item item) {
		super();
		this.id = id;
		this.idItem = idItem;
		this.justificativa = justificativa;
		this.idFornecedor = idFornecedor;
		this.tipo = tipo;
		this.dataReabilitacao = dataReabilitacao;
		this.horaReabilitacao = horaReabilitacao;
		this.lote = lote;
		this.fornecedor = fornecedor;
		this.item = item;
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

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDataReabilitacao() {
		return dataReabilitacao;
	}

	public void setDataReabilitacao(String dataReabilitacao) {
		this.dataReabilitacao = dataReabilitacao;
	}

	public String getHoraReabilitacao() {
		return horaReabilitacao;
	}

	public void setHoraReabilitacao(String horaReabilitacao) {
		this.horaReabilitacao = horaReabilitacao;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
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
		Reabilitacao other = (Reabilitacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
