package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PymeSysSeguridad generated by hbm2java
 */
@Entity
@Table(name = "PYME_SYS_SEGURIDAD", uniqueConstraints = @UniqueConstraint(columnNames = { "SU_CODIGO",
		"SYS_PERM_COD" }))
public class PymeSysSeguridad implements java.io.Serializable {

	private long sysSegId;
	private PymeProyecto pymeProyecto;
	private PymeSysPermisos pymeSysPermisos;
	private String suCodigo;
	private String sysPermCod;
	private Date sysSegCreadoEl;
	private String sysSegCreadoPor;

	public PymeSysSeguridad() {
	}

	public PymeSysSeguridad(PymeProyecto pymeProyecto, PymeSysPermisos pymeSysPermisos, String suCodigo,
			String sysPermCod) {
		this.pymeProyecto = pymeProyecto;
		this.pymeSysPermisos = pymeSysPermisos;
		this.suCodigo = suCodigo;
		this.sysPermCod = sysPermCod;
	}

	public PymeSysSeguridad(PymeProyecto pymeProyecto, PymeSysPermisos pymeSysPermisos, String suCodigo,
			String sysPermCod, Date sysSegCreadoEl, String sysSegCreadoPor) {
		this.pymeProyecto = pymeProyecto;
		this.pymeSysPermisos = pymeSysPermisos;
		this.suCodigo = suCodigo;
		this.sysPermCod = sysPermCod;
		this.sysSegCreadoEl = sysSegCreadoEl;
		this.sysSegCreadoPor = sysSegCreadoPor;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "pymeSysPermisos"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "SYS_SEG_ID", unique = true, nullable = false, precision = 18, scale = 0)
	public long getSysSegId() {
		return this.sysSegId;
	}

	public void setSysSegId(long sysSegId) {
		this.sysSegId = sysSegId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROY_ID", nullable = false)
	public PymeProyecto getPymeProyecto() {
		return this.pymeProyecto;
	}

	public void setPymeProyecto(PymeProyecto pymeProyecto) {
		this.pymeProyecto = pymeProyecto;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public PymeSysPermisos getPymeSysPermisos() {
		return this.pymeSysPermisos;
	}

	public void setPymeSysPermisos(PymeSysPermisos pymeSysPermisos) {
		this.pymeSysPermisos = pymeSysPermisos;
	}

	@Column(name = "SU_CODIGO", nullable = false, length = 50)
	public String getSuCodigo() {
		return this.suCodigo;
	}

	public void setSuCodigo(String suCodigo) {
		this.suCodigo = suCodigo;
	}

	@Column(name = "SYS_PERM_COD", nullable = false, length = 20)
	public String getSysPermCod() {
		return this.sysPermCod;
	}

	public void setSysPermCod(String sysPermCod) {
		this.sysPermCod = sysPermCod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SYS_SEG_CREADO_EL", length = 7)
	public Date getSysSegCreadoEl() {
		return this.sysSegCreadoEl;
	}

	public void setSysSegCreadoEl(Date sysSegCreadoEl) {
		this.sysSegCreadoEl = sysSegCreadoEl;
	}

	@Column(name = "SYS_SEG_CREADO_POR", length = 50)
	public String getSysSegCreadoPor() {
		return this.sysSegCreadoPor;
	}

	public void setSysSegCreadoPor(String sysSegCreadoPor) {
		this.sysSegCreadoPor = sysSegCreadoPor;
	}

}
