package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import DAO.ProduitRepositry;

@SpringBootApplication
public class ProduitServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(ProduitServiceApplication.class, args);
		
		ProduitRepositry produitrepository=ctx.getBean(ProduitRepositry.class);
		Stream.of("A","B","C").forEach(s->produitrepository.save(new Produit(s)));
		produitrepository.findAll().forEach(s->System.out.println(s.getDesignation()));
		
	}
}
