package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * PymeConsecutivos generated by hbm2java
 */
@Entity
@Table(name = "PYME_CONSECUTIVOS", uniqueConstraints = @UniqueConstraint(columnNames = { "PROY_ID", "CONS_TIPODOC" }))
public class PymeConsecutivos implements java.io.Serializable {

	private long consId;
	private long consTipodoc;
	private long consInicial;
	private long consActual;
	private long consFinal;
	private long proyId;

	public PymeConsecutivos() {
	}

	public PymeConsecutivos(long consId, long consTipodoc, long consInicial, long consActual, long consFinal,
			long proyId) {
		this.consId = consId;
		this.consTipodoc = consTipodoc;
		this.consInicial = consInicial;
		this.consActual = consActual;
		this.consFinal = consFinal;
		this.proyId = proyId;
	}

	@Id

	@Column(name = "CONS_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getConsId() {
		return this.consId;
	}

	public void setConsId(long consId) {
		this.consId = consId;
	}

	@Column(name = "CONS_TIPODOC", nullable = false, precision = 10, scale = 0)
	public long getConsTipodoc() {
		return this.consTipodoc;
	}

	public void setConsTipodoc(long consTipodoc) {
		this.consTipodoc = consTipodoc;
	}

	@Column(name = "CONS_INICIAL", nullable = false, precision = 18, scale = 0)
	public long getConsInicial() {
		return this.consInicial;
	}

	public void setConsInicial(long consInicial) {
		this.consInicial = consInicial;
	}

	@Column(name = "CONS_ACTUAL", nullable = false, precision = 18, scale = 0)
	public long getConsActual() {
		return this.consActual;
	}

	public void setConsActual(long consActual) {
		this.consActual = consActual;
	}

	@Column(name = "CONS_FINAL", nullable = false, precision = 18, scale = 0)
	public long getConsFinal() {
		return this.consFinal;
	}

	public void setConsFinal(long consFinal) {
		this.consFinal = consFinal;
	}

	@Column(name = "PROY_ID", nullable = false, precision = 10, scale = 0)
	public long getProyId() {
		return this.proyId;
	}

	public void setProyId(long proyId) {
		this.proyId = proyId;
	}

}
