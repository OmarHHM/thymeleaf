package com.curso.alumnos.dto;

public class HistoricoVacante {

		public long id;
		public long vacanteId;
		public String fechaCierre;
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
