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

	@RequestMapping(value={"/recluiters/profile"}, method = RequestMethod.GET)
	public ModelAndView recluiter(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/admin/recluiter");
		return modelAndView;
	}
	
	@RequestMapping(value={"/recluiters/addRecluiter"}, method = RequestMethod.POST)
	public void addRecluiter (){
		
	}
	
	@RequestMapping(value={"/recluiters/updateRecluiter"}, method = RequestMethod.POST)
	public void updateRecluiter (){
		
	}
	
	@RequestMapping(value={"/recluuiter/getRecluiter"}, method = RequestMethod.GET)
	public Reclutador getRecluiter (){
		return new Reclutador();
	}
	
	@RequestMapping(value={"/recluiters/listRecluiter"}, method = RequestMethod.GET)
	public List<Reclutador> listRecluiter (){
		ArrayList<Reclutador> reclu= new ArrayList();
		return reclu;
	}
	
	
}
