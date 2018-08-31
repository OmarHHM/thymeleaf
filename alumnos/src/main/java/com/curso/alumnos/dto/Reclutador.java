package com.curso.alumnos.dto;

public class Reclutador {

		public long id;
		public String nombre;
		public String apellido_materno;
		public String apellido_paterno;
		public long id_emp;
		public String es_independiente;
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
		public long getId_emp() {
			return id_emp;
		}
		public void setId_emp(long id_emp) {
			this.id_emp = id_emp;
		}
		public String getEs_independiente() {
			return es_independiente;
		}
		public void setEs_independiente(String es_independiente) {
			this.es_independiente = es_independiente;
		}
		
		
		
		
		
		public String getFoto() {
			return foto;
		}
		public void setFoto(String foto) {
			this.foto = foto;
		}
		@Override
		public String toString() {
			return "Reclutador [id=" + id + ", nombre=" + nombre + ", apellido_materno=" + apellido_materno
					+ ", apellido_paterno=" + apellido_paterno + ", id_emp=" + id_emp + ", es_independiente="
					+ es_independiente + ", foto=" + foto + "]";
		}
		
		
		
		
		
		
		
}
