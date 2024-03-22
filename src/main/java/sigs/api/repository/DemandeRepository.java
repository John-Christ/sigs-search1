package sigs.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.model.Demande;

import java.util.List;

@Repository
public interface DemandeRepository extends CrudRepository<Demande, Long> {


    @Query("SELECT d FROM Demande d WHERE " +
            "d.nom LIKE CONCAT('%',:query, '%')" +
            "Or d.email LIKE CONCAT('%', :query, '%')")
    List<Demande> searchDemandes(String query);



}