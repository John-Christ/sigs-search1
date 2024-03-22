package sigs.api.service;

import sigs.api.model.Demande;

import java.util.List;

public interface DemandeService {
    List<Demande> searchDemandes(String query);

    Demande createDemandes(Demande demande);
}
