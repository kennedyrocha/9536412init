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
public class Duvida implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("DataDuvida")
	private String dataDuvida;
	
	@JsonProperty("horaDuvida")
	private String HoraDuvida;
	
	@JsonProperty("Duvida")
	@Column(length=4000)
	private String duvida;
	
	@JsonProperty("DataResposta")
	private String dataResposta;
	
	@JsonProperty("HoraResposta")
	private String horaResposta;
	
	@JsonProperty("Resposta")
	@Column(length=4000)
	private String resposta;
	
	@JsonProperty("DETALHE_EVENTO")
	private String detalheEvento;
	
	@ManyToOne
	@JoinColumn(name="detalhelicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	public Duvida() {
	}

	public Duvida(Integer id, String dataDuvida, String horaDuvida, String duvida, String dataResposta,
			String horaResposta, String resposta, String detalheEvento, DetalheLicitacao detalheLicitacao) {
		super();
		this.id = id;
		this.dataDuvida = dataDuvida;
		HoraDuvida = horaDuvida;
		this.duvida = duvida;
		this.dataResposta = dataResposta;
		this.horaResposta = horaResposta;
		this.resposta = resposta;
		this.detalheEvento = detalheEvento;
		this.detalheLicitacao = detalheLicitacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataDuvida() {
		return dataDuvida;
	}

	public void setDataDuvida(String dataDuvida) {
		this.dataDuvida = dataDuvida;
	}

	public String getHoraDuvida() {
		return HoraDuvida;
	}

	public void setHoraDuvida(String horaDuvida) {
		HoraDuvida = horaDuvida;
	}

	public String getDuvida() {
		return duvida;
	}

	public void setDuvida(String duvida) {
		this.duvida = duvida;
	}

	public String getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(String dataResposta) {
		this.dataResposta = dataResposta;
	}

	public String getHoraResposta() {
		return horaResposta;
	}

	public void setHoraResposta(String horaResposta) {
		this.horaResposta = horaResposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getDetalheEvento() {
		return detalheEvento;
	}

	public void setDetalheEvento(String detalheEvento) {
		this.detalheEvento = detalheEvento;
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
		Duvida other = (Duvida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
