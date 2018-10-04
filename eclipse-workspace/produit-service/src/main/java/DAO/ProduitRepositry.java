package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Produit;

@RepositoryRestResource
public interface ProduitRepositry extends JpaRepository<Produit, Long> {

}
