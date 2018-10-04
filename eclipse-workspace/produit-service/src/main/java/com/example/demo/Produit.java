package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Produit  implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String designation;
	private double prix;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit() {
		}
		
	public Produit(String designation) {
		super();
		
		this.designation = designation;
		
	}
	
	
}



 