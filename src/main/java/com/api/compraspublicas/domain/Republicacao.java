package com.api.compraspublicas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Republicacao implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("TIPO_EVENTO")
	private String tipoEvento;
	
	@JsonProperty("SIGLA_LICITACON")
	private String siglaLicitacon;
	
	@JsonProperty("DATA")
	private String data;
	
	@JsonProperty("HORA")
	private String hora;
	
	@JsonProperty("EVENTO")
	private String evento;
	
	@ElementCollection
	@CollectionTable(name="CD_ARQUIVO_REPUBLICACAO")
	@JsonProperty("CD_ARQUIVO")
	private List<String> cdArquivo = new ArrayList<String>();
	
	@JsonProperty("DETALHE_EVENTO")
	private String detalheEvento;
	
	@JsonProperty("CD_TIPO_FASE")
	private String cdTipoFase;
	
	@ManyToOne
	@JoinColumn(name="detalhelicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	public Republicacao() {
	}

	public Republicacao(Integer id, String tipoEvento, String siglaLicitacon, String data, String hora, String evento,
			List<String> cdArquivo, String detalheEvento, String cdTipoFase, DetalheLicitacao detalheLicitacao) {
		super();
		this.id = id;
		this.tipoEvento = tipoEvento;
		this.siglaLicitacon = siglaLicitacon;
		this.data = data;
		this.hora = hora;
		this.evento = evento;
		this.cdArquivo = cdArquivo;
		this.detalheEvento = detalheEvento;
		this.cdTipoFase = cdTipoFase;
		this.detalheLicitacao = detalheLicitacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getSiglaLicitacon() {
		return siglaLicitacon;
	}

	public void setSiglaLicitacon(String siglaLicitacon) {
		this.siglaLicitacon = siglaLicitacon;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
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

	public List<String> getCdArquivo() {
		return cdArquivo;
	}

	public void setCdArquivo(List<String> cdArquivo) {
		this.cdArquivo = cdArquivo;
	}

	public String getCdTipoFase() {
		return cdTipoFase;
	}

	public void setCdTipoFase(String cdTipoFase) {
		this.cdTipoFase = cdTipoFase;
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
		Republicacao other = (Republicacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
