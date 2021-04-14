package com.api.compraspublicas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Item implements Serializable{
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
	@Column(length=4000)
	private String descricaoItem;
	
	@JsonProperty("QT_ITENS")
	private Integer quantidadeItem;
	
	@JsonProperty("NR_ITEM")
	private Integer numeroItem;
	
	@JsonProperty("VL_UNITARIO_ESTIMADO")
	private double valorUnitarioEstimado;
	
	@JsonProperty("CD_BOLEANO_D_EXCLUSIVO")
	private boolean cdBoleanoDExclusivo;
	
	@JsonProperty("SG_UNIDADE_MEDIDA")
	private String sgUnidadeMedida;
	
	@ManyToOne
	@JoinColumn(name="lote_id")
	private Lote lote;
	
	@JsonProperty("Propostas")
	@OneToMany(mappedBy="item", cascade=CascadeType.ALL)
	private List<Proposta> propostas = new ArrayList<>();
	
	@JsonProperty("Lances")
	@OneToMany(mappedBy="item", cascade=CascadeType.ALL)
	private List<Lance> lances = new ArrayList<>();
	
	public Item() {
	}

	public Item(Integer id, Integer idItem, String idExterno, Integer numeroLote, String descricaoItem,
			Integer quantidadeItem, Integer numeroItem, double valorUnitarioEstimado, boolean cdBoleanoDExclusivo,
			String sgUnidadeMedida, Lote lote) {
		super();
		this.id = id;
		this.idItem = idItem;
		this.idExterno = idExterno;
		this.numeroLote = numeroLote;
		this.descricaoItem = descricaoItem;
		this.quantidadeItem = quantidadeItem;
		this.numeroItem = numeroItem;
		this.valorUnitarioEstimado = valorUnitarioEstimado;
		this.cdBoleanoDExclusivo = cdBoleanoDExclusivo;
		this.sgUnidadeMedida = sgUnidadeMedida;
		this.lote = lote;
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

	public boolean isCdBoleanoDExclusivo() {
		return cdBoleanoDExclusivo;
	}

	public void setCdBoleanoDExclusivo(boolean cdBoleanoDExclusivo) {
		this.cdBoleanoDExclusivo = cdBoleanoDExclusivo;
	}

	public String getSgUnidadeMedida() {
		return sgUnidadeMedida;
	}

	public void setSgUnidadeMedida(String sgUnidadeMedida) {
		this.sgUnidadeMedida = sgUnidadeMedida;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public List<Proposta> getPropostas() {
		return propostas;
	}

	public void setPropostas(List<Proposta> propostas) {
		this.propostas = propostas;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
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
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
