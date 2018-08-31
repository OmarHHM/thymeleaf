package com.curso.alumnos.dto;

public class DatosCandidato {

	public long id;
	public long idCandidato;
	public String disponibleVaiaje;
	public String reubicacion;
	public String estatusTrabajo;
	public int idRangoSalarial;
	public String razonCambio;

	public String urlFacebook;
	public String urlLinkedin;
	public String urlYoutube;
	public String urlPaginaPersonal;
	public String urlOtros;
	public int idArea;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}
	public String getDisponibleVaiaje() {
		return disponibleVaiaje;
	}
	public void setDisponibleVaiaje(String disponibleVaiaje) {
		this.disponibleVaiaje = disponibleVaiaje;
	}
	public String getReubicacion() {
		return reubicacion;
	}
	public void setReubicacion(String reubicacion) {
		this.reubicacion = reubicacion;
	}
	public String getEstatusTrabajo() {
		return estatusTrabajo;
	}
	public void setEstatusTrabajo(String estatusTrabajo) {
		this.estatusTrabajo = estatusTrabajo;
	}
	public int getIdRangoSalarial() {
		return idRangoSalarial;
	}
	public void setIdRangoSalarial(int idRangoSalarial) {
		this.idRangoSalarial = idRangoSalarial;
	}
	public String getRazonCambio() {
		return razonCambio;
	}
	public void setRazonCambio(String razonCambio) {
		this.razonCambio = razonCambio;
	}
	public String getUrlFacebook() {
		return urlFacebook;
	}
	public void setUrlFacebook(String urlFacebook) {
		this.urlFacebook = urlFacebook;
	}
	public String getUrlLinkedin() {
		return urlLinkedin;
	}
	public void setUrlLinkedin(String urlLinkedin) {
		this.urlLinkedin = urlLinkedin;
	}
	public String getUrlYoutube() {
		return urlYoutube;
	}
	public void setUrlYoutube(String urlYoutube) {
		this.urlYoutube = urlYoutube;
	}
	public String getUrlPaginaPersonal() {
		return urlPaginaPersonal;
	}
	public void setUrlPaginaPersonal(String urlPaginaPersonal) {
		this.urlPaginaPersonal = urlPaginaPersonal;
	}
	public String getUrlOtros() {
		return urlOtros;
	}
	public void setUrlOtros(String urlOtros) {
		this.urlOtros = urlOtros;
	}
	public int getIdArea() {
		return idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	@Override
	public String toString() {
		return "DatosCandidato [id=" + id + ", idCandidato=" + idCandidato + ", disponibleVaiaje=" + disponibleVaiaje
				+ ", reubicacion=" + reubicacion + ", estatusTrabajo=" + estatusTrabajo + ", idRangoSalarial="
				+ idRangoSalarial + ", razonCambio=" + razonCambio + ", urlFacebook=" + urlFacebook + ", urlLinkedin="
				+ urlLinkedin + ", urlYoutube=" + urlYoutube + ", urlPaginaPersonal=" + urlPaginaPersonal
				+ ", urlOtros=" + urlOtros + ", idArea=" + idArea + "]";
	}
	
	
	
}
