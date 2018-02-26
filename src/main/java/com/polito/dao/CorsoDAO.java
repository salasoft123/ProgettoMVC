package com.polito.dao;

import java.util.List;

import com.polito.entity.Corso;


public interface CorsoDAO {
	
	
	public Corso inserisci(Corso  corso);
	public Corso cancella(int id);
	public List<Corso> visualizzaTuttiCorsi();
	public Corso update(Corso corso );
	public Corso cercaByCorso(int codcorso) ;

}
