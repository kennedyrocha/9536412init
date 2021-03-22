package com.api.compraspublicas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class DetalheLicitacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer idLicitacao;
	
	@JsonProperty("NR_PROCESSO")
	private String NR_PROCESSO;
	
	@JsonProperty("NR_LICITACAO")
	private String NR_LICITACAO;
	
	@JsonProperty("DS_OBJETO")
	private String DS_OBJETO;
	
	@JsonProperty("ANO_LICITACAO")
	private String ANO_LICITACAO;
	private String dataInicioPropostas;
	private String horaInicioPropostas;
	private String dataFinalPropostas;
	private String horaFinalPropostas;
	private String dataLimiteImpugnacao;
	private String horaLimiteImpugnacao;
	private String dataAberturaPropostas;
	private String horaAberturaPropostas;
	private String prazoValidade;
	
	@JsonProperty("NUMERO")
	private String numero;
	private String anulacao;
	
	@JsonProperty("aplicar10024")
	private boolean aplicar10024;
	
	private String tipoIntervaloLance;
	private double valorIntervaloLance;
	
	@JsonProperty("aplicar147")
	private boolean aplicar147;
	
	@JsonProperty("exclusivoMPE")
	private boolean exclusivoMPE;
	private boolean beneficioLocal;
	private Integer casasDecimais;
	private boolean apresentaValorReferencia;
	private boolean exigeGarantia;
	private boolean exigeCarona;
	private boolean separarPorLotes;
	private String tratamentoFaseLance;
	private String situacao;
	
	@JsonProperty("CD_TIPO_FASE_ATUAL")
	private String CD_TIPO_FASE_ATUAL;
	
	@OneToMany(mappedBy="detalheLicitacao", cascade=CascadeType.ALL)
	private List<Lote> lotes = new ArrayList<>();

	public DetalheLicitacao(Integer id, Integer idLicitacao, String nR_PROCESSO, String nR_LICITACAO, String dS_OBJETO,
			String aNO_LICITACAO, String dataInicioPropostas, String horaInicioPropostas, String dataFinalPropostas,
			String horaFinalPropostas, String dataLimiteImpugnacao, String horaLimiteImpugnacao,
			String dataAberturaPropostas, String horaAberturaPropostas, String prazoValidade, String numero,
			String anulacao, boolean aplicar10024, String tipoIntervaloLance, double valorIntervaloLance,
			boolean aplicar147, boolean exclusivoMPE, boolean beneficioLocal, Integer casasDecimais,
			boolean apresentaValorReferencia, boolean exigeGarantia, boolean exigeCarona, boolean separarPorLotes,
			String tratamentoFaseLance, String situacao, String cD_TIPO_FASE_ATUAL) {
		super();
		this.id = id;
		this.idLicitacao = idLicitacao;
		NR_PROCESSO = nR_PROCESSO;
		NR_LICITACAO = nR_LICITACAO;
		DS_OBJETO = dS_OBJETO;
		ANO_LICITACAO = aNO_LICITACAO;
		this.dataInicioPropostas = dataInicioPropostas;
		this.horaInicioPropostas = horaInicioPropostas;
		this.dataFinalPropostas = dataFinalPropostas;
		this.horaFinalPropostas = horaFinalPropostas;
		this.dataLimiteImpugnacao = dataLimiteImpugnacao;
		this.horaLimiteImpugnacao = horaLimiteImpugnacao;
		this.dataAberturaPropostas = dataAberturaPropostas;
		this.horaAberturaPropostas = horaAberturaPropostas;
		this.prazoValidade = prazoValidade;
		this.numero = numero;
		this.anulacao = anulacao;
		this.aplicar10024 = aplicar10024;
		this.tipoIntervaloLance = tipoIntervaloLance;
		this.valorIntervaloLance = valorIntervaloLance;
		this.aplicar147 = aplicar147;
		this.exclusivoMPE = exclusivoMPE;
		this.beneficioLocal = beneficioLocal;
		this.casasDecimais = casasDecimais;
		this.apresentaValorReferencia = apresentaValorReferencia;
		this.exigeGarantia = exigeGarantia;
		this.exigeCarona = exigeCarona;
		this.separarPorLotes = separarPorLotes;
		this.tratamentoFaseLance = tratamentoFaseLance;
		this.situacao = situacao;
		CD_TIPO_FASE_ATUAL = cD_TIPO_FASE_ATUAL;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdLicitacao() {
		return idLicitacao;
	}

	public void setIdLicitacao(Integer idLicitacao) {
		this.idLicitacao = idLicitacao;
	}

	public String getNR_PROCESSO() {
		return NR_PROCESSO;
	}

	public void setNR_PROCESSO(String nR_PROCESSO) {
		NR_PROCESSO = nR_PROCESSO;
	}

	public String getNR_LICITACAO() {
		return NR_LICITACAO;
	}

	public void setNR_LICITACAO(String nR_LICITACAO) {
		NR_LICITACAO = nR_LICITACAO;
	}

	public String getDS_OBJETO() {
		return DS_OBJETO;
	}

	public void setDS_OBJETO(String dS_OBJETO) {
		DS_OBJETO = dS_OBJETO;
	}

	public String getANO_LICITACAO() {
		return ANO_LICITACAO;
	}

	public void setANO_LICITACAO(String aNO_LICITACAO) {
		ANO_LICITACAO = aNO_LICITACAO;
	}

	public String getDataInicioPropostas() {
		return dataInicioPropostas;
	}

	public void setDataInicioPropostas(String dataInicioPropostas) {
		this.dataInicioPropostas = dataInicioPropostas;
	}

	public String getHoraInicioPropostas() {
		return horaInicioPropostas;
	}

	public void setHoraInicioPropostas(String horaInicioPropostas) {
		this.horaInicioPropostas = horaInicioPropostas;
	}

	public String getDataFinalPropostas() {
		return dataFinalPropostas;
	}

	public void setDataFinalPropostas(String dataFinalPropostas) {
		this.dataFinalPropostas = dataFinalPropostas;
	}

	public String getHoraFinalPropostas() {
		return horaFinalPropostas;
	}

	public void setHoraFinalPropostas(String horaFinalPropostas) {
		this.horaFinalPropostas = horaFinalPropostas;
	}

	public String getDataLimiteImpugnacao() {
		return dataLimiteImpugnacao;
	}

	public void setDataLimiteImpugnacao(String dataLimiteImpugnacao) {
		this.dataLimiteImpugnacao = dataLimiteImpugnacao;
	}

	public String getHoraLimiteImpugnacao() {
		return horaLimiteImpugnacao;
	}

	public void setHoraLimiteImpugnacao(String horaLimiteImpugnacao) {
		this.horaLimiteImpugnacao = horaLimiteImpugnacao;
	}

	public String getDataAberturaPropostas() {
		return dataAberturaPropostas;
	}

	public void setDataAberturaPropostas(String dataAberturaPropostas) {
		this.dataAberturaPropostas = dataAberturaPropostas;
	}

	public String getHoraAberturaPropostas() {
		return horaAberturaPropostas;
	}

	public void setHoraAberturaPropostas(String horaAberturaPropostas) {
		this.horaAberturaPropostas = horaAberturaPropostas;
	}

	public String getPrazoValidade() {
		return prazoValidade;
	}

	public void setPrazoValidade(String prazoValidade) {
		this.prazoValidade = prazoValidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAnulacao() {
		return anulacao;
	}

	public void setAnulacao(String anulacao) {
		this.anulacao = anulacao;
	}

	public boolean isAplicar10024() {
		return aplicar10024;
	}

	public void setAplicar10024(boolean aplicar10024) {
		this.aplicar10024 = aplicar10024;
	}

	public String getTipoIntervaloLance() {
		return tipoIntervaloLance;
	}

	public void setTipoIntervaloLance(String tipoIntervaloLance) {
		this.tipoIntervaloLance = tipoIntervaloLance;
	}

	public double getValorIntervaloLance() {
		return valorIntervaloLance;
	}

	public void setValorIntervaloLance(double valorIntervaloLance) {
		this.valorIntervaloLance = valorIntervaloLance;
	}

	public boolean isAplicar147() {
		return aplicar147;
	}

	public void setAplicar147(boolean aplicar147) {
		this.aplicar147 = aplicar147;
	}

	public boolean isExclusivoMPE() {
		return exclusivoMPE;
	}

	public void setExclusivoMPE(boolean exclusivoMPE) {
		this.exclusivoMPE = exclusivoMPE;
	}

	public boolean isBeneficioLocal() {
		return beneficioLocal;
	}

	public void setBeneficioLocal(boolean beneficioLocal) {
		this.beneficioLocal = beneficioLocal;
	}

	public Integer getCasasDecimais() {
		return casasDecimais;
	}

	public void setCasasDecimais(Integer casasDecimais) {
		this.casasDecimais = casasDecimais;
	}

	public boolean isApresentaValorReferencia() {
		return apresentaValorReferencia;
	}

	public void setApresentaValorReferencia(boolean apresentaValorReferencia) {
		this.apresentaValorReferencia = apresentaValorReferencia;
	}

	public boolean isExigeGarantia() {
		return exigeGarantia;
	}

	public void setExigeGarantia(boolean exigeGarantia) {
		this.exigeGarantia = exigeGarantia;
	}

	public boolean isExigeCarona() {
		return exigeCarona;
	}

	public void setExigeCarona(boolean exigeCarona) {
		this.exigeCarona = exigeCarona;
	}

	public boolean isSepararPorLotes() {
		return separarPorLotes;
	}

	public void setSepararPorLotes(boolean separarPorLotes) {
		this.separarPorLotes = separarPorLotes;
	}

	public String getTratamentoFaseLance() {
		return tratamentoFaseLance;
	}

	public void setTratamentoFaseLance(String tratamentoFaseLance) {
		this.tratamentoFaseLance = tratamentoFaseLance;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getCD_TIPO_FASE_ATUAL() {
		return CD_TIPO_FASE_ATUAL;
	}

	public void setCD_TIPO_FASE_ATUAL(String cD_TIPO_FASE_ATUAL) {
		CD_TIPO_FASE_ATUAL = cD_TIPO_FASE_ATUAL;
	}
	
	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public DetalheLicitacao () {
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
		DetalheLicitacao other = (DetalheLicitacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
