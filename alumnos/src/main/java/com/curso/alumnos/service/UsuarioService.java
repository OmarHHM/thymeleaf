package com.curso.alumnos.service;

import java.util.List;

import com.curso.alumnos.dto.UsuarioDto;

public interface UsuarioService {

	UsuarioDto findByName(String nombre);
	public void saveUser(UsuarioDto usuarioDto);
	public List<UsuarioDto> getUsuarios(Long rol_id);
	public void deleteUsuario(String username);
	public UsuarioDto findByEmail(String email);
	UsuarioDto findByUsuario(String username);

	
}