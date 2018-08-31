package com.curso.alumnos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curso.alumnos.dto.Reclutador;

@RestController
public class ReclutadorController {

	
	@RequestMapping(value={"/", "/recruiter"}, method = RequestMethod.GET)
	public ModelAndView recluiter(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("recluit/recluiter");
		return modelAndView;
	}
	
	@RequestMapping(value={"/", "/addRecluiter"}, method = RequestMethod.POST)
	public void addRecluiter (){
		
	}
	
	@RequestMapping(value={"/", "/updateRecluiter"}, method = RequestMethod.POST)
	public void updateRecluiter (){
		
	}
	
	@RequestMapping(value={"/", "/getRecluiter"}, method = RequestMethod.GET)
	public Reclutador getRecluiter (){
		return new Reclutador();
	}
	
	@RequestMapping(value={"/", "/listRecluiter"}, method = RequestMethod.GET)
	public List<Reclutador> listRecluiter (){
		ArrayList<Reclutador> reclu= new ArrayList();
		return reclu;
	}
	
	
}
