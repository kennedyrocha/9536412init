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
public class Cancelamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	@JsonProperty("DataCancelamento")
	private String dataCancelamento;
	
	@JsonProperty("HoraCancelamento")
	private String horaCancelamento;
	
	@JsonProperty("Justificativa")
	private String justificativa;

	public Cancelamento() {
	}

	public Cancelamento(Integer id, DetalheLicitacao detalheLicitacao, String dataCancelamento, String horaCancelamento,
			String justificativa) {
		super();
		this.id = id;
		this.detalheLicitacao = detalheLicitacao;
		this.dataCancelamento = dataCancelamento;
		this.horaCancelamento = horaCancelamento;
		this.justificativa = justificativa;
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

	public String getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(String dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public String getHoraCancelamento() {
		return horaCancelamento;
	}

	public void setHoraCancelamento(String horaCancelamento) {
		this.horaCancelamento = horaCancelamento;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
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
		Cancelamento other = (Cancelamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
