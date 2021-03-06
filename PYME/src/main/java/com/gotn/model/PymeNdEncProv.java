package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PymeNdEncProv generated by hbm2java
 */
@Entity
@Table(name = "PYME_ND_ENC_PROV")
public class PymeNdEncProv implements java.io.Serializable {

	private long ndprovId;
	private long ndprovConsectivo;
	private BigDecimal idSoc;
	private String ndprovSocNombre;
	private BigDecimal ndprovTotalLocal;
	private BigDecimal ndprovTotalExtranjero;
	private String ndprovTipoCambio;
	private Date ndprovFechaDoc;
	private Date ndprovContabilizacion;
	private Long ndprovDocBase;
	private Long ndprovDocDestino;
	private BigDecimal ndprovEstado;
	private String ndprovComentarios;
	private BigDecimal proyId;
	private long ndprovTipoFacnd;
	private Set<PymeNdDetProv> pymeNdDetProvs = new HashSet<PymeNdDetProv>(0);

	public PymeNdEncProv() {
	}

	public PymeNdEncProv(long ndprovId, long ndprovConsectivo, BigDecimal ndprovEstado, BigDecimal proyId,
			long ndprovTipoFacnd) {
		this.ndprovId = ndprovId;
		this.ndprovConsectivo = ndprovConsectivo;
		this.ndprovEstado = ndprovEstado;
		this.proyId = proyId;
		this.ndprovTipoFacnd = ndprovTipoFacnd;
	}

	public PymeNdEncProv(long ndprovId, long ndprovConsectivo, BigDecimal idSoc, String ndprovSocNombre,
			BigDecimal ndprovTotalLocal, BigDecimal ndprovTotalExtranjero, String ndprovTipoCambio, Date ndprovFechaDoc,
			Date ndprovContabilizacion, Long ndprovDocBase, Long ndprovDocDestino, BigDecimal ndprovEstado,
			String ndprovComentarios, BigDecimal proyId, long ndprovTipoFacnd, Set<PymeNdDetProv> pymeNdDetProvs) {
		this.ndprovId = ndprovId;
		this.ndprovConsectivo = ndprovConsectivo;
		this.idSoc = idSoc;
		this.ndprovSocNombre = ndprovSocNombre;
		this.ndprovTotalLocal = ndprovTotalLocal;
		this.ndprovTotalExtranjero = ndprovTotalExtranjero;
		this.ndprovTipoCambio = ndprovTipoCambio;
		this.ndprovFechaDoc = ndprovFechaDoc;
		this.ndprovContabilizacion = ndprovContabilizacion;
		this.ndprovDocBase = ndprovDocBase;
		this.ndprovDocDestino = ndprovDocDestino;
		this.ndprovEstado = ndprovEstado;
		this.ndprovComentarios = ndprovComentarios;
		this.proyId = proyId;
		this.ndprovTipoFacnd = ndprovTipoFacnd;
		this.pymeNdDetProvs = pymeNdDetProvs;
	}

	@Id

	@Column(name = "NDPROV_ID", unique = true, nullable = false, precision = 18, scale = 0)
	public long getNdprovId() {
		return this.ndprovId;
	}

	public void setNdprovId(long ndprovId) {
		this.ndprovId = ndprovId;
	}

	@Column(name = "NDPROV_CONSECTIVO", nullable = false, precision = 18, scale = 0)
	public long getNdprovConsectivo() {
		return this.ndprovConsectivo;
	}

	public void setNdprovConsectivo(long ndprovConsectivo) {
		this.ndprovConsectivo = ndprovConsectivo;
	}

	@Column(name = "ID_SOC", precision = 22, scale = 0)
	public BigDecimal getIdSoc() {
		return this.idSoc;
	}

	public void setIdSoc(BigDecimal idSoc) {
		this.idSoc = idSoc;
	}

	@Column(name = "NDPROV_SOC_NOMBRE", length = 200)
	public String getNdprovSocNombre() {
		return this.ndprovSocNombre;
	}

	public void setNdprovSocNombre(String ndprovSocNombre) {
		this.ndprovSocNombre = ndprovSocNombre;
	}

	@Column(name = "NDPROV_TOTAL_LOCAL", precision = 18, scale = 3)
	public BigDecimal getNdprovTotalLocal() {
		return this.ndprovTotalLocal;
	}

	public void setNdprovTotalLocal(BigDecimal ndprovTotalLocal) {
		this.ndprovTotalLocal = ndprovTotalLocal;
	}

	@Column(name = "NDPROV_TOTAL_EXTRANJERO", precision = 18, scale = 3)
	public BigDecimal getNdprovTotalExtranjero() {
		return this.ndprovTotalExtranjero;
	}

	public void setNdprovTotalExtranjero(BigDecimal ndprovTotalExtranjero) {
		this.ndprovTotalExtranjero = ndprovTotalExtranjero;
	}

	@Column(name = "NDPROV_TIPO_CAMBIO", length = 20)
	public String getNdprovTipoCambio() {
		return this.ndprovTipoCambio;
	}

	public void setNdprovTipoCambio(String ndprovTipoCambio) {
		this.ndprovTipoCambio = ndprovTipoCambio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NDPROV_FECHA_DOC", length = 7)
	public Date getNdprovFechaDoc() {
		return this.ndprovFechaDoc;
	}

	public void setNdprovFechaDoc(Date ndprovFechaDoc) {
		this.ndprovFechaDoc = ndprovFechaDoc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NDPROV_CONTABILIZACION", length = 7)
	public Date getNdprovContabilizacion() {
		return this.ndprovContabilizacion;
	}

	public void setNdprovContabilizacion(Date ndprovContabilizacion) {
		this.ndprovContabilizacion = ndprovContabilizacion;
	}

	@Column(name = "NDPROV_DOC_BASE", precision = 18, scale = 0)
	public Long getNdprovDocBase() {
		return this.ndprovDocBase;
	}

	public void setNdprovDocBase(Long ndprovDocBase) {
		this.ndprovDocBase = ndprovDocBase;
	}

	@Column(name = "NDPROV_DOC_DESTINO", precision = 18, scale = 0)
	public Long getNdprovDocDestino() {
		return this.ndprovDocDestino;
	}

	public void setNdprovDocDestino(Long ndprovDocDestino) {
		this.ndprovDocDestino = ndprovDocDestino;
	}

	@Column(name = "NDPROV_ESTADO", nullable = false, precision = 22, scale = 0)
	public BigDecimal getNdprovEstado() {
		return this.ndprovEstado;
	}

	public void setNdprovEstado(BigDecimal ndprovEstado) {
		this.ndprovEstado = ndprovEstado;
	}

	@Column(name = "NDPROV_COMENTARIOS", length = 200)
	public String getNdprovComentarios() {
		return this.ndprovComentarios;
	}

	public void setNdprovComentarios(String ndprovComentarios) {
		this.ndprovComentarios = ndprovComentarios;
	}

	@Column(name = "PROY_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getProyId() {
		return this.proyId;
	}

	public void setProyId(BigDecimal proyId) {
		this.proyId = proyId;
	}

	@Column(name = "NDPROV_TIPO_FACND", nullable = false, precision = 10, scale = 0)
	public long getNdprovTipoFacnd() {
		return this.ndprovTipoFacnd;
	}

	public void setNdprovTipoFacnd(long ndprovTipoFacnd) {
		this.ndprovTipoFacnd = ndprovTipoFacnd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pymeNdEncProv")
	public Set<PymeNdDetProv> getPymeNdDetProvs() {
		return this.pymeNdDetProvs;
	}

	public void setPymeNdDetProvs(Set<PymeNdDetProv> pymeNdDetProvs) {
		this.pymeNdDetProvs = pymeNdDetProvs;
	}

}
