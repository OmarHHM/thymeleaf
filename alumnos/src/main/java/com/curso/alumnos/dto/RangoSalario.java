package com.curso.alumnos.dto;

public class RangoSalario {

	public int id;
	public String rango;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	@Override
	public String toString() {
		return "RangoSalario [id=" + id + ", rango=" + rango + "]";
	}
	
}
