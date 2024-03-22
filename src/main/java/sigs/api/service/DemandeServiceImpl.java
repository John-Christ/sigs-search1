package sigs.api.service;


import org.springframework.stereotype.Service;
import sigs.api.model.Demande;
import sigs.api.repository.DemandeRepository;

import java.util.List;

@Service
public class DemandeServiceImpl implements DemandeService {

    private DemandeRepository demandeRepository;

    public DemandeServiceImpl(DemandeRepository demandeRepository) {
        this.demandeRepository = demandeRepository;
    }

    @Override
    public List<Demande> searchDemandes(String query) {
        List<Demande> demandes = demandeRepository.searchDemandes(query);
        return demandes;
    }

    @Override
    public Demande createDemandes(Demande demande) {
        return demandeRepository.save(demande);
    }
}

