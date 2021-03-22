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
public class Proposta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("Data")
	private String data;
	
	@JsonProperty("Hora")
	private String hora;
	
	@ManyToOne
	@JoinColumn(name="fornecedor_id")
	private Fornecedor fornecedor;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@JsonProperty("Modelo")
	private String modelo;
	
	@JsonProperty("Marca")
	private String Marca;
	
	@JsonProperty("Fabricante")
	private String fabricante;
	
	@Column(length=4000)
	@JsonProperty("Detalhamento")
	private String detalhamento;
	
	@JsonProperty("ValidadeProposta")
	private String validadeProposta;
	
	@JsonProperty("ValorUnitario")
	private double valorUnitario;
	
	@JsonProperty("ValorTotal")
	private double valorTotal;
	
	@JsonProperty("Valido")
	private boolean valido;
	
	@JsonProperty("IdFornecedor")
	private String idFornecedor;
	
	@JsonProperty("Tipo")
	private String tipo;
	
	public Proposta() {
	}

	public Proposta(Integer id, String data, String hora, Fornecedor fornecedor, Item item, String modelo,
			String marca, String fabricante, String detalhamento, String validadeProposta, double valorUnitario,
			double valorTotal, boolean valido, String idFornecedor, String tipo) {
		super();
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.fornecedor = fornecedor;
		this.item = item;
		this.modelo = modelo;
		Marca = marca;
		this.fabricante = fabricante;
		this.detalhamento = detalhamento;
		this.validadeProposta = validadeProposta;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.valido = valido;
		this.idFornecedor = idFornecedor;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public String getValidadeProposta() {
		return validadeProposta;
	}

	public void setValidadeProposta(String validadeProposta) {
		this.validadeProposta = validadeProposta;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
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
		Proposta other = (Proposta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
