package com.polito.dao;

import java.util.List;

import com.polito.entity.Studente;

public interface StudenteDAO {
	
	public Studente inserisci(Studente std);
	public Studente cancella(int id);
	public List<Studente> cercaTutti();
	public Studente update(Studente std);
	public Studente cercaMatricola(int matricola);

}
