package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PymeNdDetCli generated by hbm2java
 */
@Entity
@Table(name = "PYME_ND_DET_CLI")
public class PymeNdDetCli implements java.io.Serializable {

	private long ndclidId;
	private PymeProductos pymeProductos;
	private PymeNdEncCli pymeNdEncCli;
	private Long ndclidCantidad;
	private String ndclidDetalle;
	private BigDecimal ndclidTotalLineaLocal;
	private String ndclidTotalLineaExt;
	private String ndclidCreadoPor;
	private Date ndclidCreadoEl;

	public PymeNdDetCli() {
	}

	public PymeNdDetCli(long ndclidId, PymeNdEncCli pymeNdEncCli) {
		this.ndclidId = ndclidId;
		this.pymeNdEncCli = pymeNdEncCli;
	}

	public PymeNdDetCli(long ndclidId, PymeProductos pymeProductos, PymeNdEncCli pymeNdEncCli, Long ndclidCantidad,
			String ndclidDetalle, BigDecimal ndclidTotalLineaLocal, String ndclidTotalLineaExt, String ndclidCreadoPor,
			Date ndclidCreadoEl) {
		this.ndclidId = ndclidId;
		this.pymeProductos = pymeProductos;
		this.pymeNdEncCli = pymeNdEncCli;
		this.ndclidCantidad = ndclidCantidad;
		this.ndclidDetalle = ndclidDetalle;
		this.ndclidTotalLineaLocal = ndclidTotalLineaLocal;
		this.ndclidTotalLineaExt = ndclidTotalLineaExt;
		this.ndclidCreadoPor = ndclidCreadoPor;
		this.ndclidCreadoEl = ndclidCreadoEl;
	}

	@Id

	@Column(name = "NDCLID_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getNdclidId() {
		return this.ndclidId;
	}

	public void setNdclidId(long ndclidId) {
		this.ndclidId = ndclidId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUC_ID")
	public PymeProductos getPymeProductos() {
		return this.pymeProductos;
	}

	public void setPymeProductos(PymeProductos pymeProductos) {
		this.pymeProductos = pymeProductos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NDCLI_ID", nullable = false)
	public PymeNdEncCli getPymeNdEncCli() {
		return this.pymeNdEncCli;
	}

	public void setPymeNdEncCli(PymeNdEncCli pymeNdEncCli) {
		this.pymeNdEncCli = pymeNdEncCli;
	}

	@Column(name = "NDCLID_CANTIDAD", precision = 10, scale = 0)
	public Long getNdclidCantidad() {
		return this.ndclidCantidad;
	}

	public void setNdclidCantidad(Long ndclidCantidad) {
		this.ndclidCantidad = ndclidCantidad;
	}

	@Column(name = "NDCLID_DETALLE", length = 100)
	public String getNdclidDetalle() {
		return this.ndclidDetalle;
	}

	public void setNdclidDetalle(String ndclidDetalle) {
		this.ndclidDetalle = ndclidDetalle;
	}

	@Column(name = "NDCLID_TOTAL_LINEA_LOCAL", precision = 18, scale = 3)
	public BigDecimal getNdclidTotalLineaLocal() {
		return this.ndclidTotalLineaLocal;
	}

	public void setNdclidTotalLineaLocal(BigDecimal ndclidTotalLineaLocal) {
		this.ndclidTotalLineaLocal = ndclidTotalLineaLocal;
	}

	@Column(name = "NDCLID_TOTAL_LINEA_EXT", length = 20)
	public String getNdclidTotalLineaExt() {
		return this.ndclidTotalLineaExt;
	}

	public void setNdclidTotalLineaExt(String ndclidTotalLineaExt) {
		this.ndclidTotalLineaExt = ndclidTotalLineaExt;
	}

	@Column(name = "NDCLID_CREADO_POR", length = 50)
	public String getNdclidCreadoPor() {
		return this.ndclidCreadoPor;
	}

	public void setNdclidCreadoPor(String ndclidCreadoPor) {
		this.ndclidCreadoPor = ndclidCreadoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NDCLID_CREADO_EL", length = 7)
	public Date getNdclidCreadoEl() {
		return this.ndclidCreadoEl;
	}

	public void setNdclidCreadoEl(Date ndclidCreadoEl) {
		this.ndclidCreadoEl = ndclidCreadoEl;
	}

}
