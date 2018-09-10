package com.curso.alumnos.dao;

import com.curso.alumnos.dto.Candidato;
import com.curso.alumnos.dto.DatosCandidato;

public interface CandidatoDao {

	public long saveCandidato(Candidato c);
	public void saveDatosCandidato(DatosCandidato d);
}
