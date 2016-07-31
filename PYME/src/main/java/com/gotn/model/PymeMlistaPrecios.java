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
import javax.persistence.UniqueConstraint;

/**
 * PymeMlistaPrecios generated by hbm2java
 */
@Entity
@Table(name = "PYME_MLISTA_PRECIOS", uniqueConstraints = @UniqueConstraint(columnNames = "MLIST_NOMBRE"))
public class PymeMlistaPrecios implements java.io.Serializable {

	private BigDecimal mlistId;
	private String mlistNombre;
	private String mlistDescripcion;
	private Date mlistCreadoEl;
	private String mlistCreadoPor;
	private Long mlistEstado;
	private Set<PymeProductos> pymeProductoses = new HashSet<PymeProductos>(0);
	private Set<PymeDlistaPrecios> pymeDlistaPrecioses = new HashSet<PymeDlistaPrecios>(0);

	public PymeMlistaPrecios() {
	}

	public PymeMlistaPrecios(BigDecimal mlistId, String mlistNombre) {
		this.mlistId = mlistId;
		this.mlistNombre = mlistNombre;
	}

	public PymeMlistaPrecios(BigDecimal mlistId, String mlistNombre, String mlistDescripcion, Date mlistCreadoEl,
			String mlistCreadoPor, Long mlistEstado, Set<PymeProductos> pymeProductoses,
			Set<PymeDlistaPrecios> pymeDlistaPrecioses) {
		this.mlistId = mlistId;
		this.mlistNombre = mlistNombre;
		this.mlistDescripcion = mlistDescripcion;
		this.mlistCreadoEl = mlistCreadoEl;
		this.mlistCreadoPor = mlistCreadoPor;
		this.mlistEstado = mlistEstado;
		this.pymeProductoses = pymeProductoses;
		this.pymeDlistaPrecioses = pymeDlistaPrecioses;
	}

	@Id

	@Column(name = "MLIST_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getMlistId() {
		return this.mlistId;
	}

	public void setMlistId(BigDecimal mlistId) {
		this.mlistId = mlistId;
	}

	@Column(name = "MLIST_NOMBRE", unique = true, nullable = false, length = 100)
	public String getMlistNombre() {
		return this.mlistNombre;
	}

	public void setMlistNombre(String mlistNombre) {
		this.mlistNombre = mlistNombre;
	}

	@Column(name = "MLIST_DESCRIPCION", length = 200)
	public String getMlistDescripcion() {
		return this.mlistDescripcion;
	}

	public void setMlistDescripcion(String mlistDescripcion) {
		this.mlistDescripcion = mlistDescripcion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MLIST_CREADO_EL", length = 7)
	public Date getMlistCreadoEl() {
		return this.mlistCreadoEl;
	}

	public void setMlistCreadoEl(Date mlistCreadoEl) {
		this.mlistCreadoEl = mlistCreadoEl;
	}

	@Column(name = "MLIST_CREADO_POR", length = 100)
	public String getMlistCreadoPor() {
		return this.mlistCreadoPor;
	}

	public void setMlistCreadoPor(String mlistCreadoPor) {
		this.mlistCreadoPor = mlistCreadoPor;
	}

	@Column(name = "MLIST_ESTADO", precision = 10, scale = 0)
	public Long getMlistEstado() {
		return this.mlistEstado;
	}

	public void setMlistEstado(Long mlistEstado) {
		this.mlistEstado = mlistEstado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pymeMlistaPrecios")
	public Set<PymeProductos> getPymeProductoses() {
		return this.pymeProductoses;
	}

	public void setPymeProductoses(Set<PymeProductos> pymeProductoses) {
		this.pymeProductoses = pymeProductoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pymeMlistaPrecios")
	public Set<PymeDlistaPrecios> getPymeDlistaPrecioses() {
		return this.pymeDlistaPrecioses;
	}

	public void setPymeDlistaPrecioses(Set<PymeDlistaPrecios> pymeDlistaPrecioses) {
		this.pymeDlistaPrecioses = pymeDlistaPrecioses;
	}

}
