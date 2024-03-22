package sigs.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sigs.api.dao.DAOUser;
import sigs.api.model.Produit;

import java.util.List;

@Repository
public interface DaoUser extends CrudRepository<DAOUser, Long> {


    @Query("SELECT d FROM DAOUser d WHERE " +
            "d.nom LIKE CONCAT('%',:query, '%')" +
            "Or d.username LIKE CONCAT('%', :query, '%')" +
            "Or d.email LIKE CONCAT('%', :query, '%')" +
            "Or d.role LIKE CONCAT('%', :query, '%')")

    List<DAOUser> searchUsers(String query);


}
