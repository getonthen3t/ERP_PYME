package com.gotn.entity;
// Generated Jul 24, 2016 4:29:10 PM by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * PymeNdDetCli generated by hbm2java
 */
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

	public long getNdclidId() {
		return this.ndclidId;
	}

	public void setNdclidId(long ndclidId) {
		this.ndclidId = ndclidId;
	}

	public PymeProductos getPymeProductos() {
		return this.pymeProductos;
	}

	public void setPymeProductos(PymeProductos pymeProductos) {
		this.pymeProductos = pymeProductos;
	}

	public PymeNdEncCli getPymeNdEncCli() {
		return this.pymeNdEncCli;
	}

	public void setPymeNdEncCli(PymeNdEncCli pymeNdEncCli) {
		this.pymeNdEncCli = pymeNdEncCli;
	}

	public Long getNdclidCantidad() {
		return this.ndclidCantidad;
	}

	public void setNdclidCantidad(Long ndclidCantidad) {
		this.ndclidCantidad = ndclidCantidad;
	}

	public String getNdclidDetalle() {
		return this.ndclidDetalle;
	}

	public void setNdclidDetalle(String ndclidDetalle) {
		this.ndclidDetalle = ndclidDetalle;
	}

	public BigDecimal getNdclidTotalLineaLocal() {
		return this.ndclidTotalLineaLocal;
	}

	public void setNdclidTotalLineaLocal(BigDecimal ndclidTotalLineaLocal) {
		this.ndclidTotalLineaLocal = ndclidTotalLineaLocal;
	}

	public String getNdclidTotalLineaExt() {
		return this.ndclidTotalLineaExt;
	}

	public void setNdclidTotalLineaExt(String ndclidTotalLineaExt) {
		this.ndclidTotalLineaExt = ndclidTotalLineaExt;
	}

	public String getNdclidCreadoPor() {
		return this.ndclidCreadoPor;
	}

	public void setNdclidCreadoPor(String ndclidCreadoPor) {
		this.ndclidCreadoPor = ndclidCreadoPor;
	}

	public Date getNdclidCreadoEl() {
		return this.ndclidCreadoEl;
	}

	public void setNdclidCreadoEl(Date ndclidCreadoEl) {
		this.ndclidCreadoEl = ndclidCreadoEl;
	}

}
