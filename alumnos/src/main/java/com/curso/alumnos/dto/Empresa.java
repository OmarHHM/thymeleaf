package com.curso.alumnos.dto;

public class Empresa {

	
	public long id;
	public String nombre;
	public String descripcion;
	public String rfc;
	public String razonSocial;
	public String urlSitio;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getUrlSitio() {
		return urlSitio;
	}
	public void setUrlSitio(String urlSitio) {
		this.urlSitio = urlSitio;
	}
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", rfc=" + rfc
				+ ", razonSocial=" + razonSocial + ", urlSitio=" + urlSitio + "]";
	}
	
	
	
	
	
}
