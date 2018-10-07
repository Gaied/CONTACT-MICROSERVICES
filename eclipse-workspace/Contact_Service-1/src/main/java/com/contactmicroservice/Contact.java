package com.contactmicroservice;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Contact implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String numero;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Contact() {
		super();
	}
	public Contact(String nom, String prenom, String email,String numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numero = numero;
	}
	
	
}
