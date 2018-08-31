package com.curso.alumnos.dto;

public class DatosVacante {

	public long id;
	public String descripcion;
	public long idEmp;
	public long idReclut;
	public int idRangoSalarial;
	public String createDate;
	public String dueDate;
	public int idTipoContrato;
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
