package com.polito.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.polito.entity.Studente;

@Service
@Transactional
public class StudenteDAOImpl implements StudenteDAO {

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public Studente inserisci(Studente std) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Studente cancella(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Studente> cercaTutti() {
		
		return (List<Studente>)entityManager.createQuery("SELECT e FROM Studente e").getResultList();
	}

	@Override
	public Studente update(Studente std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Studente cercaMatricola(int matricola) {
		
		return (Studente) entityManager.createQuery(
		        "SELECT c FROM Studente c WHERE c.matricola LIKE :custMatricola")
		        .setParameter("custMatricola", matricola)
		        .getSingleResult();
		        
	}

}
