package com.curso.alumnos.dto;

public class Candidato {

	public long id;
	public String nombre;
	public String apellido_materno;
	public String apellido_paterno;
	public int edad;
	public String domicilio;
	public String genero;
	public String foto;
	
	
	
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
	
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nombre=" + nombre + ", apellido_materno=" + apellido_materno
				+ ", apellido_paterno=" + apellido_paterno + ", edad=" + edad + ", domicilio=" + domicilio + ", genero="
				+ genero + ", foto=" + foto + "]";
	}



}
