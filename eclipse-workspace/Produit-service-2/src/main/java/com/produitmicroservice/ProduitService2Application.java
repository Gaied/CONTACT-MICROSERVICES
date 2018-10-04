package com.produitmicroservice;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class ProduitService2Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(ProduitService2Application.class, args);
		
		ProduitRepository produitrepository=ctx.getBean(ProduitRepository.class);
		Stream.of("A","B","C").forEach(s->produitrepository.save(new Produit(s)));
		produitrepository.findAll().forEach(s->System.out.println(s.getDesignation()));
		
	}
}