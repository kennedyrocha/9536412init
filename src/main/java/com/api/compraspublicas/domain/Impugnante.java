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
public class Impugnante implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("Nome")
	private String nome;
	
	@JsonProperty("Email")
	private String email;
	
	@JsonProperty("CPF")
	private String cpf;
	
	@JsonProperty("Telefone")
	private String telefone;
	
	@JsonProperty("Endereco")
	private String endereco;
	
	@JsonProperty("Cidade")
	private String cidade;
	
	@JsonProperty("Bairro")
	private String bairro;
	
	@JsonProperty("CEP")
	private String cep;
	
	@JsonProperty("UF")
	private String uf;
	
	@JsonProperty("CD_MUNICIPIO_IBGE")
	private String cdMunicipioIbge;
	
	@JsonProperty("RazaoSocial")
	private String RazaoSocial;
	
	@JsonProperty("Tipo")
	private String tipo;
	
	@JsonProperty("CNPJ")
	private String cnpj;
	
	@JsonProperty("Registro")
	private String registro;
	
	@JsonProperty("NomeFantasia")
	private String nomeFantasia;
	
	@JsonProperty("INSCRICAO_ESTADUAL")
	private String inscricaoEstadual;
	
	@JsonProperty("INSCRICAO_MUNICIPAL")
	private String inscricaoMunicipal;
	
	@JsonProperty("DeclaracaoME")
	private String declaracaoMe;
	
	@ManyToOne
	@JoinColumn(name="impugnacao_id")
	private Impugnacao impugnacao;
	
	public Impugnante() {
	}

	public Impugnante(Integer id, String nome, String email, String cpf, String telefone, String endereco,
			String cidade, String bairro, String cep, String uf, String cdMunicipioIbge, String razaoSocial,
			String tipo, String cnpj, String registro, String nomeFantasia, String inscricaoEstadual,
			String inscricaoMunicipal, String declaracaoMe, Impugnacao impugnacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.cdMunicipioIbge = cdMunicipioIbge;
		RazaoSocial = razaoSocial;
		this.tipo = tipo;
		this.cnpj = cnpj;
		this.registro = registro;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.declaracaoMe = declaracaoMe;
		this.impugnacao = impugnacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCdMunicipioIbge() {
		return cdMunicipioIbge;
	}

	public void setCdMunicipioIbge(String cdMunicipioIbge) {
		this.cdMunicipioIbge = cdMunicipioIbge;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getDeclaracaoMe() {
		return declaracaoMe;
	}

	public void setDeclaracaoMe(String declaracaoMe) {
		this.declaracaoMe = declaracaoMe;
	}

	public Impugnacao getImpugnacao() {
		return impugnacao;
	}

	public void setImpugnacao(Impugnacao impugnacao) {
		this.impugnacao = impugnacao;
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
		Impugnante other = (Impugnante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
