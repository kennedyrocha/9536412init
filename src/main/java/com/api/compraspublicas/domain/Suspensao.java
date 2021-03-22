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
public class Suspensao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	@JsonProperty("DataSuspensao")
	private String dataSuspensao;
	
	@JsonProperty("HoraSuspensao")
	private String horaSuspensao;
	
	@JsonProperty("Justificativa")
	private String justificativa;
	
	@JsonProperty("MotivoSuspensao")
	private String motivoSuspensao;

	public Suspensao() {
	}

	public Suspensao(Integer id, DetalheLicitacao detalheLicitacao, String dataSuspensao, String horaSuspensao,
			String justificativa, String motivoSuspensao) {
		super();
		this.id = id;
		this.detalheLicitacao = detalheLicitacao;
		this.dataSuspensao = dataSuspensao;
		this.horaSuspensao = horaSuspensao;
		this.justificativa = justificativa;
		this.motivoSuspensao = motivoSuspensao;
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

	public String getDataSuspensao() {
		return dataSuspensao;
	}

	public void setDataSuspensao(String dataSuspensao) {
		this.dataSuspensao = dataSuspensao;
	}

	public String getHoraSuspensao() {
		return horaSuspensao;
	}

	public void setHoraSuspensao(String horaSuspensao) {
		this.horaSuspensao = horaSuspensao;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getMotivoSuspensao() {
		return motivoSuspensao;
	}

	public void setMotivoSuspensao(String motivoSuspensao) {
		this.motivoSuspensao = motivoSuspensao;
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
		Suspensao other = (Suspensao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
