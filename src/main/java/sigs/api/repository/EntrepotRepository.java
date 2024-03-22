package sigs.api.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.model.Demande;
import sigs.api.model.Entrepot;

import java.util.List;

@Repository
public interface EntrepotRepository extends CrudRepository<Entrepot, Long> {


    @Query("SELECT e FROM Entrepot e WHERE " +
            "e.nom LIKE CONCAT('%',:query, '%')" //+
          //  "Or e.email LIKE CONCAT('%', :query, '%')"
            )
    List<Entrepot> searchEntrepots(String query);


}