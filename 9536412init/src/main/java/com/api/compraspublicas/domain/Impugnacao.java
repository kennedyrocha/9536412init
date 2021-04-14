package com.api.compraspublicas.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Impugnacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("DataImpugnacao")
	private String dataImpugnacao;
	
	@JsonProperty("HoraImpugnacao")
	private String horaImpugnacao;
	
	@JsonProperty("Pedido")
	private String pedido;
	
	@Column(length=4000)
	@JsonProperty("TextoImpugnacao")
	private String textoImpugnacao;
	
	@JsonProperty("DataResposta")
	private String dataResposta;
	
	@JsonProperty("HoraResposta")
	private String horaResposta;
	
	@JsonProperty("ResultadoJulgamento")
	private String resultadoJulgamento;
	
	@JsonProperty("Julgamento")
	private String julgamento;
	
	private String name;
	private String hash;
	private String url;
	private String anexo;
	
	@JsonProperty("hash_anexo")
	private String hashAnexo;
	
	@JsonProperty("url_anexo")
	private String urlAnexo;
	
	@ManyToOne
	@JoinColumn(name="detalheLicitacao_id")
	private DetalheLicitacao detalheLicitacao;
	
	@JsonProperty("Impugnante")
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="impugnante_id")
	private Impugnante impugnante;
	
	public Impugnacao() {
	}

	public Impugnacao(Integer id, String dataImpugnacao, String horaImpugnacao, String pedido, String textoImpugnacao,
			String dataResposta, String horaResposta, String resultadoJulgamento, String julgamento, String name,
			String hash, String url, String anexo, String hashAnexo, String urlAnexo,
			DetalheLicitacao detalheLicitacao, Impugnante impugnante) {
		super();
		this.id = id;
		this.dataImpugnacao = dataImpugnacao;
		this.horaImpugnacao = horaImpugnacao;
		this.pedido = pedido;
		this.textoImpugnacao = textoImpugnacao;
		this.dataResposta = dataResposta;
		this.horaResposta = horaResposta;
		this.resultadoJulgamento = resultadoJulgamento;
		this.julgamento = julgamento;
		this.name = name;
		this.hash = hash;
		this.url = url;
		this.anexo = anexo;
		this.hashAnexo = hashAnexo;
		this.urlAnexo = urlAnexo;
		this.detalheLicitacao = detalheLicitacao;
		this.impugnante = impugnante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataImpugnacao() {
		return dataImpugnacao;
	}

	public void setDataImpugnacao(String dataImpugnacao) {
		this.dataImpugnacao = dataImpugnacao;
	}

	public String getHoraImpugnacao() {
		return horaImpugnacao;
	}

	public void setHoraImpugnacao(String horaImpugnacao) {
		this.horaImpugnacao = horaImpugnacao;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getTextoImpugnacao() {
		return textoImpugnacao;
	}

	public void setTextoImpugnacao(String textoImpugnacao) {
		this.textoImpugnacao = textoImpugnacao;
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

	public String getResultadoJulgamento() {
		return resultadoJulgamento;
	}

	public void setResultadoJulgamento(String resultadoJulgamento) {
		this.resultadoJulgamento = resultadoJulgamento;
	}

	public String getJulgamento() {
		return julgamento;
	}

	public void setJulgamento(String julgamento) {
		this.julgamento = julgamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getHashAnexo() {
		return hashAnexo;
	}

	public void setHashAnexo(String hashAnexo) {
		this.hashAnexo = hashAnexo;
	}

	public String getUrlAnexo() {
		return urlAnexo;
	}

	public void setUrlAnexo(String urlAnexo) {
		this.urlAnexo = urlAnexo;
	}

	public DetalheLicitacao getDetalheLicitacao() {
		return detalheLicitacao;
	}

	public void setDetalheLicitacao(DetalheLicitacao detalheLicitacao) {
		this.detalheLicitacao = detalheLicitacao;
	}

	public Impugnante getImpugnante() {
		return impugnante;
	}

	public void setImpugnante(Impugnante impugnante) {
		this.impugnante = impugnante;
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
		Impugnacao other = (Impugnacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
