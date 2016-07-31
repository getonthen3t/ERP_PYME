package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PymeSysPermisos generated by hbm2java
 */
@Entity
@Table(name = "PYME_SYS_PERMISOS")
public class PymeSysPermisos implements java.io.Serializable {

	private long sysPerId;
	private String sysPerCod;
	private String sysPerDesc;
	private String sysPerCreadoPor;
	private Date sysPerCreadoEl;
	private PymeSysSeguridad pymeSysSeguridad;

	public PymeSysPermisos() {
	}

	public PymeSysPermisos(long sysPerId, String sysPerCod, String sysPerDesc) {
		this.sysPerId = sysPerId;
		this.sysPerCod = sysPerCod;
		this.sysPerDesc = sysPerDesc;
	}

	public PymeSysPermisos(long sysPerId, String sysPerCod, String sysPerDesc, String sysPerCreadoPor,
			Date sysPerCreadoEl, PymeSysSeguridad pymeSysSeguridad) {
		this.sysPerId = sysPerId;
		this.sysPerCod = sysPerCod;
		this.sysPerDesc = sysPerDesc;
		this.sysPerCreadoPor = sysPerCreadoPor;
		this.sysPerCreadoEl = sysPerCreadoEl;
		this.pymeSysSeguridad = pymeSysSeguridad;
	}

	@Id

	@Column(name = "SYS_PER_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getSysPerId() {
		return this.sysPerId;
	}

	public void setSysPerId(long sysPerId) {
		this.sysPerId = sysPerId;
	}

	@Column(name = "SYS_PER_COD", nullable = false, length = 50)
	public String getSysPerCod() {
		return this.sysPerCod;
	}

	public void setSysPerCod(String sysPerCod) {
		this.sysPerCod = sysPerCod;
	}

	@Column(name = "SYS_PER_DESC", nullable = false, length = 200)
	public String getSysPerDesc() {
		return this.sysPerDesc;
	}

	public void setSysPerDesc(String sysPerDesc) {
		this.sysPerDesc = sysPerDesc;
	}

	@Column(name = "SYS_PER_CREADO_POR", length = 50)
	public String getSysPerCreadoPor() {
		return this.sysPerCreadoPor;
	}

	public void setSysPerCreadoPor(String sysPerCreadoPor) {
		this.sysPerCreadoPor = sysPerCreadoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SYS_PER_CREADO_EL", length = 7)
	public Date getSysPerCreadoEl() {
		return this.sysPerCreadoEl;
	}

	public void setSysPerCreadoEl(Date sysPerCreadoEl) {
		this.sysPerCreadoEl = sysPerCreadoEl;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pymeSysPermisos")
	public PymeSysSeguridad getPymeSysSeguridad() {
		return this.pymeSysSeguridad;
	}

	public void setPymeSysSeguridad(PymeSysSeguridad pymeSysSeguridad) {
		this.pymeSysSeguridad = pymeSysSeguridad;
	}

}
