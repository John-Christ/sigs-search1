package sigs.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.model.Commande;

import java.util.List;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {


    @Query("SELECT c FROM Commande c WHERE " +
            "c.nom LIKE CONCAT('%',:query, '%')" +
          //  "Or c.date LIKE CONCAT('%', :query, '%')" +
            "Or c.ref_cmd LIKE CONCAT('%', :query, '%')" +
            "Or c.statut LIKE CONCAT('%', :query, '%')")
    List<Commande> searchCommandes(String query);



}


