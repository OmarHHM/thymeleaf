package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historico_vacante")
public class HistoricoVacante {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private long id;
		
		@Column(name = "vacanteid")
		private long vacanteId;
		
		@Column(name = "fechaCierre")
		private String fechaCierre;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public long getVacanteId() {
			return vacanteId;
		}
		public void setVacanteId(long vacanteId) {
			this.vacanteId = vacanteId;
		}
		public String getFechaCierre() {
			return fechaCierre;
		}
		public void setFechaCierre(String fechaCierre) {
			this.fechaCierre = fechaCierre;
		}
		@Override
		public String toString() {
			return "HistoricoVacante [id=" + id + ", vacanteId=" + vacanteId + ", fechaCierre=" + fechaCierre + "]";
		}
		
}
