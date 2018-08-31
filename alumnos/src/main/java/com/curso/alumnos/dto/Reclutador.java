package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reclutador")
public class Reclutador {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private long id;
		@Column(name = "nombre", length=50, nullable=false)
		private String nombre;
		@Column(name = "apellido_materno", length=60)
		private String apellido_materno;
		@Column(name = "apellido_paterno", length=60, nullable=false)
		private String apellido_paterno;
		@Column(name = "id_emp")
		private long id_emp;
		@Column(name = "es_independiente")
		private String es_independiente;
		@Column(name = "foto")
		private String foto;
		
		@Column(name = "telefono", length=10, nullable=false)
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
