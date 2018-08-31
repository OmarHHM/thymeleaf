package com.curso.alumnos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curso.alumnos.dto.*;

@RestController
public class CandidatoController {

	
	@RequestMapping(value={"/", "/candidate"}, method = RequestMethod.GET)
	public ModelAndView candidate(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("candidato/candidate");
		return modelAndView;
	}
	
	@RequestMapping(value={"/", "/addCandidate"}, method = RequestMethod.POST)
	public void addCandidate (){
		
	}
	
	@RequestMapping(value={"/", "/updateCandidate"}, method = RequestMethod.POST)
	public void updateCandidate (){
		
	}
	
	@RequestMapping(value={"/", "/getCandidate"}, method = RequestMethod.GET)
	public Candidato getCandidate (){
		return new Candidato();
	}
	
	@RequestMapping(value={"/", "/listCandidate"}, method = RequestMethod.GET)
	public List<Candidato> listCandidate (){
		ArrayList<Candidato> candi= new ArrayList();
		return candi;
	}
}
