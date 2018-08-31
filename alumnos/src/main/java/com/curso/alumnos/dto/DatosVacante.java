package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datos_vacante")
public class DatosVacante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="idEmp")
	private long idEmp;
	
	@Column(name="idReclut")
	private long idReclut;
	
	@Column(name="idRango")
	private int idRangoSalarial;
	
	@Column(name="fechaCreacion")
	private String createDate;

	@Column(name="fechaFinalizacion")
	private String dueDate;

	@Column(name="idTipoContrato")
	private int idTipoContrato;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public long getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(long idEmp) {
		this.idEmp = idEmp;
	}
	public long getIdReclut() {
		return idReclut;
	}
	public void setIdReclut(long idReclut) {
		this.idReclut = idReclut;
	}
	public int getIdRangoSalarial() {
		return idRangoSalarial;
	}
	public void setIdRangoSalarial(int idRangoSalarial) {
		this.idRangoSalarial = idRangoSalarial;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public int getIdTipoContrato() {
		return idTipoContrato;
	}
	public void setIdTipoContrato(int idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}
	@Override
	public String toString() {
		return "DatosVacante [id=" + id + ", descripcion=" + descripcion + ", idEmp=" + idEmp + ", idReclut=" + idReclut
				+ ", idRangoSalarial=" + idRangoSalarial + ", createDate=" + createDate + ", dueDate=" + dueDate
				+ ", idTipoContrato=" + idTipoContrato + "]";
	}
	
	
	
	
}
