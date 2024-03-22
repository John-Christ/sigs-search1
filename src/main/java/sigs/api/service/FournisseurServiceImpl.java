package sigs.api.service;

import org.springframework.stereotype.Service;
import sigs.api.model.Fournisseur;
import sigs.api.repository.FournisseurRepository;

import java.util.List;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    private FournisseurRepository fournisseurRepository;

    public FournisseurServiceImpl(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    @Override
    public List<Fournisseur> searchFournisseurs(String query) {
        List<Fournisseur> fournisseurs = fournisseurRepository.searchFournisseurs(query);
        return fournisseurs;
    }

    @Override
    public Fournisseur createFournisseurs(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }
}
