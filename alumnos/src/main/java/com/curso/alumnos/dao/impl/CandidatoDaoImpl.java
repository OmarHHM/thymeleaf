package com.curso.alumnos.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.curso.alumnos.configuration.dao.GenericDao;
import com.curso.alumnos.dao.CandidatoDao;
import com.curso.alumnos.dto.Candidato;
import com.curso.alumnos.dto.UsuarioDto;
import com.curso.alumnos.entity.RolEntity;
import com.curso.alumnos.entity.UsuarioEntity;
@Repository
public class CandidatoDaoImpl extends GenericDao implements CandidatoDao {
	
	
	@Override
	@Transactional
	public void saveCandidato(Candidato c) {
		this.entityManager.persist(c);

	}

}
