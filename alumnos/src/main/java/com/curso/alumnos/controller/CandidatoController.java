package com.curso.alumnos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curso.alumnos.dto.*;
import com.curso.alumnos.service.CandidatoService;

@RestController
public class CandidatoController {

	@Autowired 
	private CandidatoService candidatoService;
	
	@RequestMapping(value={"/candidates/addCandidate"}, method = RequestMethod.POST)
	public void addCandidate (@ModelAttribute Candidato candidato){
		
	}
	
	@RequestMapping(value={"/candidates/updateProfile"}, method = RequestMethod.POST)
	public ModelAndView updateCandidate (@ModelAttribute Candidato candidato,@ModelAttribute DatosCandidato datosCandidato ){
		ModelAndView modelAndView = new ModelAndView();
		try {
			System.out.println(candidato.getApellido_materno());
			System.out.println(candidato.getApellido_paterno());
			System.out.println(candidato.getDomicilio());
			System.out.println(candidato.getEdad());
			System.out.println(candidato.getGenero());
			System.out.println(candidato.getNombre());
			System.out.println(candidato.getTelefono());
			System.out.println(candidato.getFoto());
			
			
			System.out.println(datosCandidato.getDisponibleVaiaje());
			System.out.println(datosCandidato.getEstatusTrabajo());
			System.out.println(datosCandidato.getIdArea());
			System.out.println(datosCandidato.getIdRangoSalarial());
			System.out.println(datosCandidato.getRazonCambio());
			System.out.println(datosCandidato.getReubicacion());
			
			
			candidatoService.saveCandidato(candidato,datosCandidato);
			modelAndView.addObject("exito","Pefil actualizado exitosamente");
			
		}catch(Exception e ){
			System.out.println("Error al guardar candidato>> "+e);
			modelAndView.addObject("error", "Error al actualizar perfil");
		}
		
		modelAndView.setViewName("admin/user");
		return modelAndView;
	}
	
	@RequestMapping(value={"/candidates/getCandidate"}, method = RequestMethod.GET)
	public Candidato getCandidate (){
		return new Candidato();
	}
	
	@RequestMapping(value={"/candidates/listCandidate"}, method = RequestMethod.GET)
	public List<Candidato> listCandidate (){
		ArrayList<Candidato> candi= new ArrayList();
		return candi;
	}
	
	@RequestMapping(value={"/candidates/profile"}, method = RequestMethod.GET)
	public ModelAndView getProfile(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/user");
		return modelAndView;
	}
	
	@RequestMapping(value={"/photo"}, method = RequestMethod.GET)
	public ModelAndView photo(){
		System.out.println("aqui si llega ");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/photo");
		return modelAndView;
	}
	
}
