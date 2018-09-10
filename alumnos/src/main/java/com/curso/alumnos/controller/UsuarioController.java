package com.curso.alumnos.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.curso.alumnos.dto.RolDto;
import com.curso.alumnos.dto.UsuarioDto;
import com.curso.alumnos.service.UsuarioService;
import com.curso.alumnos.service.impl.RolServiceImpl;


@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private RolServiceImpl rolService;
	
	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public ModelAndView login(@RequestParam (value="error",required = false) Boolean error){
		ModelAndView modelAndView = new ModelAndView();
		if(error!=null){
			modelAndView.addObject("error", "Tu nombre de usuario y contraseña no coinciden.");
		}
		modelAndView.setViewName("login");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
		modelAndView.setViewName("dashboard");
		return modelAndView;
	}
	
	@RequestMapping(value="/profesor/viewNewUser", method = RequestMethod.GET)
	public ModelAndView viewNewUser() throws SQLException{
		UsuarioDto usuarioDto = new UsuarioDto();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/viewNewUser");
		modelAndView.addObject("usuarioDto", usuarioDto);
		modelAndView.addObject("listRoles",rolService.getRoles());
		return modelAndView;
	}
	
	@ExceptionHandler(value = SQLException.class)
	    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
	        ModelAndView m = new ModelAndView("admin/viewListUser");
	        m.addObject("exception", e.toString());
	        m.addObject("url", req.getRequestURL());
	        return m;
	 }
	
	@RequestMapping(value="/admin/viewListAdmin", method = RequestMethod.GET)
	public ModelAndView viewListAdmin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/viewListUser");
		modelAndView.addObject("listUsers",usuarioService.getUsuarios(1L));
		return modelAndView;
	}
	
	@RequestMapping(value="/viewListStudent", method = RequestMethod.GET)
	public ModelAndView viewListStudent(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/viewListUser");
		//obtenemos los usuarios que sean del tipo estudiante
		modelAndView.addObject("listUsers",usuarioService.getUsuarios(2L));
		return modelAndView;
	}
	
	@RequestMapping(value="/viewListTeacher", method = RequestMethod.GET)
	public ModelAndView viewListTeacher(){
		ModelAndView modelAndView = new ModelAndView();
		//obtenemos los usuarios que sean del tipo profesor
		modelAndView.addObject("listUsers",usuarioService.getUsuarios(3L));
		modelAndView.setViewName("admin/viewListUser");
		return modelAndView;
	}

	@RequestMapping(value="/profesor/createNewUser", method = RequestMethod.POST)
	public ModelAndView saveNewUser(@ModelAttribute UsuarioDto usuarioDto,BindingResult bindingResult){
		ModelAndView modelAndView = new ModelAndView();
		usuarioService.saveUser(usuarioDto);
		modelAndView.setViewName("admin/viewNewUser");
		return modelAndView;
	}
	

	@RequestMapping(value="/alumno/deleteUser", method = RequestMethod.POST)
	public ModelAndView deleteUser(@RequestParam("idChecked") List<String> idUsuario){
		ModelAndView modelAndView = new ModelAndView();
		if (idUsuario!=null && idUsuario.size()>0) {
			for (String username:idUsuario)
				usuarioService.deleteUsuario(username);
			}
		modelAndView.addObject("listUsers",usuarioService.getUsuarios(1L));
		modelAndView.setViewName("admin/viewListUser");
		return modelAndView;
	}
	
	@RequestMapping(value={"/register"}, method = RequestMethod.GET)
	public ModelAndView register(@RequestParam (value="error",required = false) String  error){
		ModelAndView modelAndView = new ModelAndView();
		if(error!=null && error.equals("1")){
			modelAndView.addObject("errorMsg","El Usuario ya existe en el sistema.");
		}else if(error!=null && error.equals("2")){
			modelAndView.addObject("errorMsg","El Email ya existe en el sistema.");			
		}
		modelAndView.setViewName("admin/register");
		return modelAndView;
	}
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute UsuarioDto usuarioDto,@RequestParam (value="error",required = false)  Boolean  error,BindingResult bindingResult){
		ModelAndView modelAndView = new ModelAndView();
		RolDto rol = new RolDto(); 
		if(usuarioDto.getReclutador()!=null) {
			rol.setId(new Long(2));
		}else {
			rol.setId(new Long(3));			
		}
		usuarioDto.setRol(rol);
		UsuarioDto usr= usuarioService.findByUsuario(usuarioDto.getUsuario());
		UsuarioDto user= usuarioService.findByEmail(usuarioDto.getEmail());
		if(usr.getUsuario()!=null){
			modelAndView.addObject("error","1");
			modelAndView.setViewName("redirect:/register");
		}else if(user.getEmail()!=null){
			modelAndView.addObject("error","2");
			modelAndView.setViewName("redirect:/register");
		}else{
			usuarioService.saveUser(usuarioDto);
			modelAndView.setViewName("redirect:/login");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/getUser", method = RequestMethod.GET)
	public UsuarioDto getUser(@RequestParam("usuario") String usuario){
		UsuarioDto user=usuarioService.findByUsuario(usuario);
		return user;
	}
	
	
	
}
