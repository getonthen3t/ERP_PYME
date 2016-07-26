 package com.gotn.model;
// Generated Jul 24, 2016 4:29:10 PM by Hibernate Tools 4.0.1.Final

import java.util.Date;

/**
 * PymeSysSeguridad generated by hbm2java
 */
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

	public long getSysSegId() {
		return this.sysSegId;
	}

	public void setSysSegId(long sysSegId) {
		this.sysSegId = sysSegId;
	}

	public PymeProyecto getPymeProyecto() {
		return this.pymeProyecto;
	}

	public void setPymeProyecto(PymeProyecto pymeProyecto) {
		this.pymeProyecto = pymeProyecto;
	}

	public PymeSysPermisos getPymeSysPermisos() {
		return this.pymeSysPermisos;
	}

	public void setPymeSysPermisos(PymeSysPermisos pymeSysPermisos) {
		this.pymeSysPermisos = pymeSysPermisos;
	}

	public String getSuCodigo() {
		return this.suCodigo;
	}

	public void setSuCodigo(String suCodigo) {
		this.suCodigo = suCodigo;
	}

	public String getSysPermCod() {
		return this.sysPermCod;
	}

	public void setSysPermCod(String sysPermCod) {
		this.sysPermCod = sysPermCod;
	}

	public Date getSysSegCreadoEl() {
		return this.sysSegCreadoEl;
	}

	public void setSysSegCreadoEl(Date sysSegCreadoEl) {
		this.sysSegCreadoEl = sysSegCreadoEl;
	}

	public String getSysSegCreadoPor() {
		return this.sysSegCreadoPor;
	}

	public void setSysSegCreadoPor(String sysSegCreadoPor) {
		this.sysSegCreadoPor = sysSegCreadoPor;
	}

}
