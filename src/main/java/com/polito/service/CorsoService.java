package com.polito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polito.dao.CorsoDAO;
import com.polito.entity.Corso;



@Service
public class CorsoService {
	
	
	@Autowired
	private CorsoDAO corsoDAO;
	
	public List<Corso> getAllCorsi() {
		
		return corsoDAO.visualizzaTuttiCorsi();
	}
	
	public Corso findByCodCorso(int codcorso){
		
		return corsoDAO.cercaByCorso(codcorso);
	
	}
	
	
	
	
	

}
