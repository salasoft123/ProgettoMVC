package com.polito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polito.dao.StudenteDAO;
import com.polito.entity.Studente;

@Service
public class StudenteService {
	
	@Autowired
	private StudenteDAO studenteDAO;
	
	public List<Studente> getAllStudenti() {
		return studenteDAO.cercaTutti();
	}
	
	public Studente findByMatricola(int matricola){
		return studenteDAO.cercaMatricola(matricola);
	}
}
