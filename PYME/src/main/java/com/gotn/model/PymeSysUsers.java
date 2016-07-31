package com.gotn.model;
// Generated Jul 30, 2016 2:59:38 PM by Hibernate Tools 4.0.1.Final

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
import javax.persistence.UniqueConstraint;

/**
 * PymeSysUsers generated by hbm2java
 */
@Entity
@Table(name = "PYME_SYS_USERS", uniqueConstraints = { @UniqueConstraint(columnNames = "SU_EMAIL"),
		@UniqueConstraint(columnNames = "SU_CODIGO"), @UniqueConstraint(columnNames = "SU_IDENTIFICACION") })
public class PymeSysUsers implements java.io.Serializable {

	private long suId;
	private PymeEmpresa pymeEmpresa;
	private String suIdentificacion;
	private String suPassword;
	private String suNombre;
	private String suApellido1;
	private String suApellido2;
	private String suEmail;
	private String suTelefono;
	private String suSexo;
	private Date suCreadoEl;
	private String suCreadoPor;
	private String suCodigo;

	public PymeSysUsers() {
	}

	public PymeSysUsers(long suId, PymeEmpresa pymeEmpresa, String suPassword, String suNombre, String suApellido1,
			String suCodigo) {
		this.suId = suId;
		this.pymeEmpresa = pymeEmpresa;
		this.suPassword = suPassword;
		this.suNombre = suNombre;
		this.suApellido1 = suApellido1;
		this.suCodigo = suCodigo;
	}

	public PymeSysUsers(long suId, PymeEmpresa pymeEmpresa, String suIdentificacion, String suPassword, String suNombre,
			String suApellido1, String suApellido2, String suEmail, String suTelefono, String suSexo, Date suCreadoEl,
			String suCreadoPor, String suCodigo) {
		this.suId = suId;
		this.pymeEmpresa = pymeEmpresa;
		this.suIdentificacion = suIdentificacion;
		this.suPassword = suPassword;
		this.suNombre = suNombre;
		this.suApellido1 = suApellido1;
		this.suApellido2 = suApellido2;
		this.suEmail = suEmail;
		this.suTelefono = suTelefono;
		this.suSexo = suSexo;
		this.suCreadoEl = suCreadoEl;
		this.suCreadoPor = suCreadoPor;
		this.suCodigo = suCodigo;
	}

	@Id

	@Column(name = "SU_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public long getSuId() {
		return this.suId;
	}

	public void setSuId(long suId) {
		this.suId = suId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID", nullable = false)
	public PymeEmpresa getPymeEmpresa() {
		return this.pymeEmpresa;
	}

	public void setPymeEmpresa(PymeEmpresa pymeEmpresa) {
		this.pymeEmpresa = pymeEmpresa;
	}

	@Column(name = "SU_IDENTIFICACION", unique = true, length = 100)
	public String getSuIdentificacion() {
		return this.suIdentificacion;
	}

	public void setSuIdentificacion(String suIdentificacion) {
		this.suIdentificacion = suIdentificacion;
	}

	@Column(name = "SU_PASSWORD", nullable = false, length = 200)
	public String getSuPassword() {
		return this.suPassword;
	}

	public void setSuPassword(String suPassword) {
		this.suPassword = suPassword;
	}

	@Column(name = "SU_NOMBRE", nullable = false, length = 200)
	public String getSuNombre() {
		return this.suNombre;
	}

	public void setSuNombre(String suNombre) {
		this.suNombre = suNombre;
	}

	@Column(name = "SU_APELLIDO1", nullable = false, length = 200)
	public String getSuApellido1() {
		return this.suApellido1;
	}

	public void setSuApellido1(String suApellido1) {
		this.suApellido1 = suApellido1;
	}

	@Column(name = "SU_APELLIDO2", length = 200)
	public String getSuApellido2() {
		return this.suApellido2;
	}

	public void setSuApellido2(String suApellido2) {
		this.suApellido2 = suApellido2;
	}

	@Column(name = "SU_EMAIL", unique = true, length = 20)
	public String getSuEmail() {
		return this.suEmail;
	}

	public void setSuEmail(String suEmail) {
		this.suEmail = suEmail;
	}

	@Column(name = "SU_TELEFONO", length = 20)
	public String getSuTelefono() {
		return this.suTelefono;
	}

	public void setSuTelefono(String suTelefono) {
		this.suTelefono = suTelefono;
	}

	@Column(name = "SU_SEXO", length = 20)
	public String getSuSexo() {
		return this.suSexo;
	}

	public void setSuSexo(String suSexo) {
		this.suSexo = suSexo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SU_CREADO_EL", length = 7)
	public Date getSuCreadoEl() {
		return this.suCreadoEl;
	}

	public void setSuCreadoEl(Date suCreadoEl) {
		this.suCreadoEl = suCreadoEl;
	}

	@Column(name = "SU_CREADO_POR", length = 50)
	public String getSuCreadoPor() {
		return this.suCreadoPor;
	}

	public void setSuCreadoPor(String suCreadoPor) {
		this.suCreadoPor = suCreadoPor;
	}

	@Column(name = "SU_CODIGO", unique = true, nullable = false, length = 50)
	public String getSuCodigo() {
		return this.suCodigo;
	}

	public void setSuCodigo(String suCodigo) {
		this.suCodigo = suCodigo;
	}

}
