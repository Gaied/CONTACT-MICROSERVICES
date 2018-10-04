package com.produitmicroservice;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	@Query("select p from Produit p where p.designation like :x")
	public Page <Produit> ProduitParMc(@Param("x")String mc,Pageable p);
	public List <Produit> findByDesignation(String des);
	public Page <Produit> findByDesignation(String des,Pageable p);
}
