package sigs.api.service;

import sigs.api.model.Fournisseur;

import java.util.List;

public interface FournisseurService {
    List<Fournisseur> searchFournisseurs(String query);

    Fournisseur createFournisseurs(Fournisseur fournisseur);
}
