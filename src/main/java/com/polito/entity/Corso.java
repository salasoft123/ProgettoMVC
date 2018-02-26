package com.polito.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
@NamedQuery(name="getCorso", query="SELECT c FROM Corso c ORDER BY c.nome"),
@NamedQuery(name="getCorsoByName", query="SELECT c FROM Corso c WHERE c.nome = :nome")
})
public class Corso {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String codins;

	private int crediti;

	private String nome;

	private int pd;

	//bi-directional many-to-many associato con Studente
	@ManyToMany
	@JoinTable(
			name="iscrizione", 
			joinColumns={@JoinColumn(name="codins")}, 
			inverseJoinColumns={@JoinColumn(name="matricola")}
		)
	private List<Studente> studenti;

	public Corso() {
	}

	public String getCodins() {
		return this.codins;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public int getCrediti() {
		return this.crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPd() {
		return this.pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}

	public List<Studente> getStudenti() {
		return this.studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

}
