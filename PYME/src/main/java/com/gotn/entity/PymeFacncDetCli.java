package com.gotn.entity;
// Generated Jul 24, 2016 4:29:10 PM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PymeFacncDetCli generated by hbm2java
 */
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

	public long getFacdId() {
		return this.facdId;
	}

	public void setFacdId(long facdId) {
		this.facdId = facdId;
	}

	public PymeProductos getPymeProductos() {
		return this.pymeProductos;
	}

	public void setPymeProductos(PymeProductos pymeProductos) {
		this.pymeProductos = pymeProductos;
	}

	public PymeFacncEncCli getPymeFacncEncCli() {
		return this.pymeFacncEncCli;
	}

	public void setPymeFacncEncCli(PymeFacncEncCli pymeFacncEncCli) {
		this.pymeFacncEncCli = pymeFacncEncCli;
	}

	public Long getFacdCantidad() {
		return this.facdCantidad;
	}

	public void setFacdCantidad(Long facdCantidad) {
		this.facdCantidad = facdCantidad;
	}

	public String getFacdDetalle() {
		return this.facdDetalle;
	}

	public void setFacdDetalle(String facdDetalle) {
		this.facdDetalle = facdDetalle;
	}

	public BigDecimal getFacdTotalLineaLocal() {
		return this.facdTotalLineaLocal;
	}

	public void setFacdTotalLineaLocal(BigDecimal facdTotalLineaLocal) {
		this.facdTotalLineaLocal = facdTotalLineaLocal;
	}

	public String getFacdTotalLineaExtranjero() {
		return this.facdTotalLineaExtranjero;
	}

	public void setFacdTotalLineaExtranjero(String facdTotalLineaExtranjero) {
		this.facdTotalLineaExtranjero = facdTotalLineaExtranjero;
	}

	public String getFacdCreadoPor() {
		return this.facdCreadoPor;
	}

	public void setFacdCreadoPor(String facdCreadoPor) {
		this.facdCreadoPor = facdCreadoPor;
	}

	public Date getFacdCreadoEl() {
		return this.facdCreadoEl;
	}

	public void setFacdCreadoEl(Date facdCreadoEl) {
		this.facdCreadoEl = facdCreadoEl;
	}

}
