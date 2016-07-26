package com.gotn.model;
// Generated Jul 24, 2016 4:29:10 PM by Hibernate Tools 4.0.1.Final-

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PymeMtipos generated by hbm2java
 */
public class PymeMtipos implements java.io.Serializable {

	private long mtipoId;
	private String mtipoNombre;
	private Date mtipoCreadoEl;
	private Set<PymeDtipos> pymeDtiposes = new HashSet<PymeDtipos>(0);

	public PymeMtipos() {
	}

	public PymeMtipos(long mtipoId, String mtipoNombre, Date mtipoCreadoEl) {
		this.mtipoId = mtipoId;
		this.mtipoNombre = mtipoNombre;
		this.mtipoCreadoEl = mtipoCreadoEl;
	}

	public PymeMtipos(long mtipoId, String mtipoNombre, Date mtipoCreadoEl, Set<PymeDtipos> pymeDtiposes) {
		this.mtipoId = mtipoId;
		this.mtipoNombre = mtipoNombre;
		this.mtipoCreadoEl = mtipoCreadoEl;
		this.pymeDtiposes = pymeDtiposes;
	}

	public long getMtipoId() {
		return this.mtipoId;
	}

	public void setMtipoId(long mtipoId) {
		this.mtipoId = mtipoId;
	}

	public String getMtipoNombre() {
		return this.mtipoNombre;
	}

	public void setMtipoNombre(String mtipoNombre) {
		this.mtipoNombre = mtipoNombre;
	}

	public Date getMtipoCreadoEl() {
		return this.mtipoCreadoEl;
	}

	public void setMtipoCreadoEl(Date mtipoCreadoEl) {
		this.mtipoCreadoEl = mtipoCreadoEl;
	}

	public Set<PymeDtipos> getPymeDtiposes() {
		return this.pymeDtiposes;
	}

	public void setPymeDtiposes(Set<PymeDtipos> pymeDtiposes) {
		this.pymeDtiposes = pymeDtiposes;
	}

}
