package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "rfc")
	private String rfc;
	
	@Column(name = "razonSocial")
	private String razonSocial;

	@Column(name = "urlSitio")
	private String urlSitio;
	
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
