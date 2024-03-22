package sigs.api.service;

import sigs.api.model.Entrepot;

import java.util.List;

public interface EntrepotService {
    List<Entrepot> searchEntrepots(String query);

    Entrepot createEntrepots(Entrepot entrepot);
}