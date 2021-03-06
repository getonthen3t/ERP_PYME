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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PymeNdEncCli generated by hbm2java
 */
@Entity
@Table(name = "PYME_ND_ENC_CLI")
public class PymeNdEncCli implements java.io.Serializable {

	private long ndcliId;
	private PymeSocios pymeSocios;
	private long ndcliConsectivo;
	private String ndcliSocNombre;
	private BigDecimal ndcliTotalLocal;
	private BigDecimal ndcliTotalExtranjero;
	private String ndcliTipoCambio;
	private Date ndcliFechaDoc;
	private Date ndcliContabilizacion;
	private Long ndcliDocBase;
	private Long ndcliDocDestino;
	private BigDecimal ndcliEstado;
	private String ndcliComentarios;
	private BigDecimal proyId;
	private long ndcliTipoFacnd;
	private Set<PymeNdDetCli> pymeNdDetClis = new HashSet<PymeNdDetCli>(0);

	public PymeNdEncCli() {
	}

	public PymeNdEncCli(long ndcliId, long ndcliConsectivo, BigDecimal ndcliEstado, BigDecimal proyId,
			long ndcliTipoFacnd) {
		this.ndcliId = ndcliId;
		this.ndcliConsectivo = ndcliConsectivo;
		this.ndcliEstado = ndcliEstado;
		this.proyId = proyId;
		this.ndcliTipoFacnd = ndcliTipoFacnd;
	}

	public PymeNdEncCli(long ndcliId, PymeSocios pymeSocios, long ndcliConsectivo, String ndcliSocNombre,
			BigDecimal ndcliTotalLocal, BigDecimal ndcliTotalExtranjero, String ndcliTipoCambio, Date ndcliFechaDoc,
			Date ndcliContabilizacion, Long ndcliDocBase, Long ndcliDocDestino, BigDecimal ndcliEstado,
			String ndcliComentarios, BigDecimal proyId, long ndcliTipoFacnd, Set<PymeNdDetCli> pymeNdDetClis) {
		this.ndcliId = ndcliId;
		this.pymeSocios = pymeSocios;
		this.ndcliConsectivo = ndcliConsectivo;
		this.ndcliSocNombre = ndcliSocNombre;
		this.ndcliTotalLocal = ndcliTotalLocal;
		this.ndcliTotalExtranjero = ndcliTotalExtranjero;
		this.ndcliTipoCambio = ndcliTipoCambio;
		this.ndcliFechaDoc = ndcliFechaDoc;
		this.ndcliContabilizacion = ndcliContabilizacion;
		this.ndcliDocBase = ndcliDocBase;
		this.ndcliDocDestino = ndcliDocDestino;
		this.ndcliEstado = ndcliEstado;
		this.ndcliComentarios = ndcliComentarios;
		this.proyId = proyId;
		this.ndcliTipoFacnd = ndcliTipoFacnd;
		this.pymeNdDetClis = pymeNdDetClis;
	}

	@Id

	@Column(name = "NDCLI_ID", unique = true, nullable = false, precision = 18, scale = 0)
	public long getNdcliId() {
		return this.ndcliId;
	}

	public void setNdcliId(long ndcliId) {
		this.ndcliId = ndcliId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SOC")
	public PymeSocios getPymeSocios() {
		return this.pymeSocios;
	}

	public void setPymeSocios(PymeSocios pymeSocios) {
		this.pymeSocios = pymeSocios;
	}

	@Column(name = "NDCLI_CONSECTIVO", nullable = false, precision = 18, scale = 0)
	public long getNdcliConsectivo() {
		return this.ndcliConsectivo;
	}

	public void setNdcliConsectivo(long ndcliConsectivo) {
		this.ndcliConsectivo = ndcliConsectivo;
	}

	@Column(name = "NDCLI_SOC_NOMBRE", length = 200)
	public String getNdcliSocNombre() {
		return this.ndcliSocNombre;
	}

	public void setNdcliSocNombre(String ndcliSocNombre) {
		this.ndcliSocNombre = ndcliSocNombre;
	}

	@Column(name = "NDCLI_TOTAL_LOCAL", precision = 18, scale = 3)
	public BigDecimal getNdcliTotalLocal() {
		return this.ndcliTotalLocal;
	}

	public void setNdcliTotalLocal(BigDecimal ndcliTotalLocal) {
		this.ndcliTotalLocal = ndcliTotalLocal;
	}

	@Column(name = "NDCLI_TOTAL_EXTRANJERO", precision = 18, scale = 3)
	public BigDecimal getNdcliTotalExtranjero() {
		return this.ndcliTotalExtranjero;
	}

	public void setNdcliTotalExtranjero(BigDecimal ndcliTotalExtranjero) {
		this.ndcliTotalExtranjero = ndcliTotalExtranjero;
	}

	@Column(name = "NDCLI_TIPO_CAMBIO", length = 20)
	public String getNdcliTipoCambio() {
		return this.ndcliTipoCambio;
	}

	public void setNdcliTipoCambio(String ndcliTipoCambio) {
		this.ndcliTipoCambio = ndcliTipoCambio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NDCLI_FECHA_DOC", length = 7)
	public Date getNdcliFechaDoc() {
		return this.ndcliFechaDoc;
	}

	public void setNdcliFechaDoc(Date ndcliFechaDoc) {
		this.ndcliFechaDoc = ndcliFechaDoc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NDCLI_CONTABILIZACION", length = 7)
	public Date getNdcliContabilizacion() {
		return this.ndcliContabilizacion;
	}

	public void setNdcliContabilizacion(Date ndcliContabilizacion) {
		this.ndcliContabilizacion = ndcliContabilizacion;
	}

	@Column(name = "NDCLI_DOC_BASE", precision = 18, scale = 0)
	public Long getNdcliDocBase() {
		return this.ndcliDocBase;
	}

	public void setNdcliDocBase(Long ndcliDocBase) {
		this.ndcliDocBase = ndcliDocBase;
	}

	@Column(name = "NDCLI_DOC_DESTINO", precision = 18, scale = 0)
	public Long getNdcliDocDestino() {
		return this.ndcliDocDestino;
	}

	public void setNdcliDocDestino(Long ndcliDocDestino) {
		this.ndcliDocDestino = ndcliDocDestino;
	}

	@Column(name = "NDCLI_ESTADO", nullable = false, precision = 22, scale = 0)
	public BigDecimal getNdcliEstado() {
		return this.ndcliEstado;
	}

	public void setNdcliEstado(BigDecimal ndcliEstado) {
		this.ndcliEstado = ndcliEstado;
	}

	@Column(name = "NDCLI_COMENTARIOS", length = 200)
	public String getNdcliComentarios() {
		return this.ndcliComentarios;
	}

	public void setNdcliComentarios(String ndcliComentarios) {
		this.ndcliComentarios = ndcliComentarios;
	}

	@Column(name = "PROY_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getProyId() {
		return this.proyId;
	}

	public void setProyId(BigDecimal proyId) {
		this.proyId = proyId;
	}

	@Column(name = "NDCLI_TIPO_FACND", nullable = false, precision = 10, scale = 0)
	public long getNdcliTipoFacnd() {
		return this.ndcliTipoFacnd;
	}

	public void setNdcliTipoFacnd(long ndcliTipoFacnd) {
		this.ndcliTipoFacnd = ndcliTipoFacnd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pymeNdEncCli")
	public Set<PymeNdDetCli> getPymeNdDetClis() {
		return this.pymeNdDetClis;
	}

	public void setPymeNdDetClis(Set<PymeNdDetCli> pymeNdDetClis) {
		this.pymeNdDetClis = pymeNdDetClis;
	}

}
