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

	
	@RequestMapping(value={"/candidates/addCandidate"}, method = RequestMethod.POST)
	public void addCandidate (){
		
	}
	
	@RequestMapping(value={"/candidates/updateCandidate"}, method = RequestMethod.POST)
	public void updateCandidate (){
		
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
