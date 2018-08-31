package com.curso.alumnos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datos_candidato")
public class DatosCandidato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name="id_candidato")
	private long idCandidato;
	
	@Column(name="disponibilidad")
	private String disponibleVaiaje;
	
	@Column(name="reubicacion")
	private String reubicacion;
	
	@Column(name="estatus")
	private String estatusTrabajo;
	
	@Column(name="idRango")
	private int idRangoSalarial;

	@Column(name="razonCambio")
	private String razonCambio;
	@Column(name="urlFacebook")
	private String urlFacebook;

	@Column(name="urlLinkedin")
	private String urlLinkedin;
	
	@Column(name="urlYoutube")
	private String urlYoutube;
	
	@Column(name="urlPaginaPersonal")
	private String urlPaginaPersonal;
	
	@Column(name="urlOtros")
	private String urlOtros;
	
	@Column(name="id_area")
	private int idArea;
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
