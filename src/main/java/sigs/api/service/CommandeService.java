package sigs.api.service;

import sigs.api.model.Commande;

import java.util.List;

public interface CommandeService {
    List<Commande> searchCommandes(String query);

    Commande createCommandes(Commande commande);
}
