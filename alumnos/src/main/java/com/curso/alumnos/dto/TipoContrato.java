package com.curso.alumnos.dto;

public class TipoContrato {

	public int id;
	public String descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "TipoContrato [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
