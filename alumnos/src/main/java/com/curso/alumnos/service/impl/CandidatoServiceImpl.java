package com.curso.alumnos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.alumnos.dao.CandidatoDao;
import com.curso.alumnos.dto.Candidato;
import com.curso.alumnos.service.CandidatoService;
@Service("candidatoService")
public class CandidatoServiceImpl implements CandidatoService {

	@Autowired
	private CandidatoDao candidatoDao;
	
	@Override
	public void saveCandidato(Candidato c) {
		this.candidatoDao.saveCandidato(c);
	}

}
