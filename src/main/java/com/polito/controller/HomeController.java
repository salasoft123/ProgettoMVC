package com.polito.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.polito.entity.Studente;
import com.polito.service.StudenteService;

@RestController

public class HomeController {
	
	
	@Autowired
	StudenteService service;
	
	
	//home Page
	@RequestMapping(value="/")
	public ModelAndView home() throws IOException{
		
		ModelAndView model = new ModelAndView("home");
		
		
		return model;
	}

		//lista studenti dal DB
		@RequestMapping(value="/ListaStudentJson", method = RequestMethod.GET)
		public  List<Studente> geALLStudenteList() throws Exception{    
		            
			  List<Studente> result= new ArrayList<>();
					  
					  
			try {
		            	
				 result=service.getAllStudenti();
		            	
		            return result;
		                //return "true";
		            } catch (Exception e) {
		                
		                return null;
		            }
		}
		
		
		
		
		
		
		
		
		
		//lista studenti dal DB sotto forma json
				@RequestMapping(value="/findAll")
				public ModelAndView listaStudenti() throws IOException{
					
					ModelAndView model = new ModelAndView("StudentList");
					List<Studente> result=service.getAllStudenti();
					model.addObject("lista", result);
					return model;
				}
		
		
		
		
		
		//form di registrazioni 
		@RequestMapping(value="/register")
		public ModelAndView register() throws IOException{
			
			ModelAndView model = new ModelAndView("registra");
		
			return model;
		}
	
	
	
	
	@RequestMapping(value="/findMatricola")
	public ModelAndView test(@RequestParam("matricola") int matricola) throws IOException{
		
		ModelAndView model = new ModelAndView("trovaMatricola");
		Studente result=service.findByMatricola(matricola);
		model.addObject("nominativo", result);
		return model;
	}
	
	/*@RequestMapping(value="/" ,method=RequestMethod.GET)
	public ModelAndView testHome(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}*/
	
	
	
	
	@RequestMapping(value="/dettaglio")
	public List<Studente> getPersonDetails() {
		List<Studente> corsi = service.getAllStudenti();
		
		//PagedListHolder pl= new PagedListHolder(corsi);
		return corsi;
 	}
	

	
	@RequestMapping(value ="/json/{matricola}", method=RequestMethod.GET, produces = "application/json")

	public Studente greeting(@PathVariable int matricola) {
		
		Studente result=service.findByMatricola(matricola);
		return result; 
	}
	
	
	@RequestMapping(value = "/jsonare", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> bar() {
	    final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    
	    return new ResponseEntity<String>("{\"test\": \"jsonResponseExample\":\"salah\":\"RoccoJsonato\"}", httpHeaders, HttpStatus.OK);
	}
	
	
	
	
	
	
}
