package com.produitmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {

	@Autowired
private ProduitRepository produitRepository;
	
}
