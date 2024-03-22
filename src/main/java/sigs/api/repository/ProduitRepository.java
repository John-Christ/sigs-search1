package sigs.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.model.Produit;

import java.util.List;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {


    @Query("SELECT p FROM Produit p WHERE " +
            "p.nom LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Produit> searchProducts(String query);



}
