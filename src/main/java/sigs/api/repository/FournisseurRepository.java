package sigs.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.model.Fournisseur;

import java.util.List;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur, Long> {

    @Query("SELECT f FROM Fournisseur f WHERE " +
            "f.nom LIKE CONCAT('%',:query, '%')" +
            "Or f.email LIKE CONCAT('%', :query, '%')")
    List<Fournisseur> searchFournisseurs(String query);

}