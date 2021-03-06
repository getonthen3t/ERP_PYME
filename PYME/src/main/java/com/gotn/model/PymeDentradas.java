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
 * PymeDentradas generated by hbm2java
 */
@Entity
@Table(name = "PYME_DENTRADAS")
public class PymeDentradas implements java.io.Serializable {

	private long dentId;
	private PymeProductos pymeProductos;
	private PymeMentradas pymeMentradas;
	private long dentCantidad;
	private BigDecimal dentPrecioUnitario;
	private Long provId;
	private String dentDetalle;
	private Date dentCreadoEl;
	private String dentCreadoPor;

	public PymeDentradas() {
	}

	public PymeDentradas(long dentId, PymeProductos pymeProductos, PymeMentradas pymeMentradas, long dentCantidad,
			BigDecimal dentPrecioUnitario) {
		this.dentId = dentId;
		this.pymeProductos = pymeProductos;
		this.pymeMentradas = pymeMentradas;
		this.dentCantidad = dentCantidad;
		this.dentPrecioUnitario = dentPrecioUnitario;
	}

	public PymeDentradas(long dentId, PymeProductos pymeProductos, PymeMentradas pymeMentradas, long dentCantidad,
			BigDecimal dentPrecioUnitario, Long provId, String dentDetalle, Date dentCreadoEl, String dentCreadoPor) {
		this.dentId = dentId;
		this.pymeProductos = pymeProductos;
		this.pymeMentradas = pymeMentradas;
		this.dentCantidad = dentCantidad;
		this.dentPrecioUnitario = dentPrecioUnitario;
		this.provId = provId;
		this.dentDetalle = dentDetalle;
		this.dentCreadoEl = dentCreadoEl;
		this.dentCreadoPor = dentCreadoPor;
	}

	@Id

	@Column(name = "DENT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getDentId() {
		return this.dentId;
	}

	public void setDentId(long dentId) {
		this.dentId = dentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUC_ID", nullable = false)
	public PymeProductos getPymeProductos() {
		return this.pymeProductos;
	}

	public void setPymeProductos(PymeProductos pymeProductos) {
		this.pymeProductos = pymeProductos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MENT_ID", nullable = false)
	public PymeMentradas getPymeMentradas() {
		return this.pymeMentradas;
	}

	public void setPymeMentradas(PymeMentradas pymeMentradas) {
		this.pymeMentradas = pymeMentradas;
	}

	@Column(name = "DENT_CANTIDAD", nullable = false, precision = 10, scale = 0)
	public long getDentCantidad() {
		return this.dentCantidad;
	}

	public void setDentCantidad(long dentCantidad) {
		this.dentCantidad = dentCantidad;
	}

	@Column(name = "DENT_PRECIO_UNITARIO", nullable = false, precision = 18)
	public BigDecimal getDentPrecioUnitario() {
		return this.dentPrecioUnitario;
	}

	public void setDentPrecioUnitario(BigDecimal dentPrecioUnitario) {
		this.dentPrecioUnitario = dentPrecioUnitario;
	}

	@Column(name = "PROV_ID", precision = 10, scale = 0)
	public Long getProvId() {
		return this.provId;
	}

	public void setProvId(Long provId) {
		this.provId = provId;
	}

	@Column(name = "DENT_DETALLE", length = 20)
	public String getDentDetalle() {
		return this.dentDetalle;
	}

	public void setDentDetalle(String dentDetalle) {
		this.dentDetalle = dentDetalle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DENT_CREADO_EL", length = 7)
	public Date getDentCreadoEl() {
		return this.dentCreadoEl;
	}

	public void setDentCreadoEl(Date dentCreadoEl) {
		this.dentCreadoEl = dentCreadoEl;
	}

	@Column(name = "DENT_CREADO_POR", length = 20)
	public String getDentCreadoPor() {
		return this.dentCreadoPor;
	}

	public void setDentCreadoPor(String dentCreadoPor) {
		this.dentCreadoPor = dentCreadoPor;
	}

}
