package com.polito.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@NamedQueries({
@NamedQuery(name="getStudenti", query="SELECT s FROM Studente s order by s.nome"),
@NamedQuery(name="getStudenteByNome", query="SELECT s FROM Studente s WHERE s.nome= :nomeX")
})

public class Studente {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	private int matricola;
	
	@Column(name = "cds")
	private String cds;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "nome")
	private String nome;

	/*
	//bi-directional many-to-many associato con Corso
	@ManyToMany(mappedBy="studenti")
	private List<Corso> corsi;
	*/
	
	public Studente() {
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCds() {
		return cds;
	}

	public void setCds(String cds) {
		this.cds = cds;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	/*
	public List<Corso> getCorsi() {
		return this.corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
*/
}
