package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidato")
public class Candidato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nombre", length=50,nullable=false)
	private String nombre;
	
	@Column(name = "apellido_materno", length=60)
	private String apellido_materno;
	
	@Column(name = "apellido_paterno", length=60,nullable=false)
	private String apellido_paterno;
	
	@Column(name = "edad")
	private int edad;

	@Column(name = "domicilio")
	private String domicilio;

	@Column(name = "genero")
	private String genero;

	@Column(name = "foto")
	private byte[] foto;
	

	@Column(name = "telefono", length=10,nullable=false)
	private String telefono;
	
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
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nombre=" + nombre + ", apellido_materno=" + apellido_materno
				+ ", apellido_paterno=" + apellido_paterno + ", edad=" + edad + ", domicilio=" + domicilio + ", genero="
				+ genero + ", foto=" + foto + ", telefono=" + telefono + "]";
	}



}
