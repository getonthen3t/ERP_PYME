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
 * PymeFacncDetCli generated by hbm2java
 */
@Entity
@Table(name = "PYME_FACNC_DET_CLI")
public class PymeFacncDetCli implements java.io.Serializable {

	private long facdId;
	private PymeProductos pymeProductos;
	private PymeFacncEncCli pymeFacncEncCli;
	private Long facdCantidad;
	private String facdDetalle;
	private BigDecimal facdTotalLineaLocal;
	private String facdTotalLineaExtranjero;
	private String facdCreadoPor;
	private Date facdCreadoEl;

	public PymeFacncDetCli() {
	}

	public PymeFacncDetCli(long facdId, PymeFacncEncCli pymeFacncEncCli) {
		this.facdId = facdId;
		this.pymeFacncEncCli = pymeFacncEncCli;
	}

	public PymeFacncDetCli(long facdId, PymeProductos pymeProductos, PymeFacncEncCli pymeFacncEncCli, Long facdCantidad,
			String facdDetalle, BigDecimal facdTotalLineaLocal, String facdTotalLineaExtranjero, String facdCreadoPor,
			Date facdCreadoEl) {
		this.facdId = facdId;
		this.pymeProductos = pymeProductos;
		this.pymeFacncEncCli = pymeFacncEncCli;
		this.facdCantidad = facdCantidad;
		this.facdDetalle = facdDetalle;
		this.facdTotalLineaLocal = facdTotalLineaLocal;
		this.facdTotalLineaExtranjero = facdTotalLineaExtranjero;
		this.facdCreadoPor = facdCreadoPor;
		this.facdCreadoEl = facdCreadoEl;
	}

	@Id

	@Column(name = "FACD_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getFacdId() {
		return this.facdId;
	}

	public void setFacdId(long facdId) {
		this.facdId = facdId;
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
	@JoinColumn(name = "FAC_ID", nullable = false)
	public PymeFacncEncCli getPymeFacncEncCli() {
		return this.pymeFacncEncCli;
	}

	public void setPymeFacncEncCli(PymeFacncEncCli pymeFacncEncCli) {
		this.pymeFacncEncCli = pymeFacncEncCli;
	}

	@Column(name = "FACD_CANTIDAD", precision = 10, scale = 0)
	public Long getFacdCantidad() {
		return this.facdCantidad;
	}

	public void setFacdCantidad(Long facdCantidad) {
		this.facdCantidad = facdCantidad;
	}

	@Column(name = "FACD_DETALLE", length = 100)
	public String getFacdDetalle() {
		return this.facdDetalle;
	}

	public void setFacdDetalle(String facdDetalle) {
		this.facdDetalle = facdDetalle;
	}

	@Column(name = "FACD_TOTAL_LINEA_LOCAL", precision = 18, scale = 3)
	public BigDecimal getFacdTotalLineaLocal() {
		return this.facdTotalLineaLocal;
	}

	public void setFacdTotalLineaLocal(BigDecimal facdTotalLineaLocal) {
		this.facdTotalLineaLocal = facdTotalLineaLocal;
	}

	@Column(name = "FACD_TOTAL_LINEA_EXTRANJERO", length = 20)
	public String getFacdTotalLineaExtranjero() {
		return this.facdTotalLineaExtranjero;
	}

	public void setFacdTotalLineaExtranjero(String facdTotalLineaExtranjero) {
		this.facdTotalLineaExtranjero = facdTotalLineaExtranjero;
	}

	@Column(name = "FACD_CREADO_POR", length = 50)
	public String getFacdCreadoPor() {
		return this.facdCreadoPor;
	}

	public void setFacdCreadoPor(String facdCreadoPor) {
		this.facdCreadoPor = facdCreadoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FACD_CREADO_EL", length = 7)
	public Date getFacdCreadoEl() {
		return this.facdCreadoEl;
	}

	public void setFacdCreadoEl(Date facdCreadoEl) {
		this.facdCreadoEl = facdCreadoEl;
	}

}
