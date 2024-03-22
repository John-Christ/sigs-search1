package sigs.api.service;


import org.springframework.stereotype.Service;
import sigs.api.model.Entrepot;
import sigs.api.repository.EntrepotRepository;

import java.util.List;

@Service
public class EntrepotServiceImpl implements EntrepotService {

    private EntrepotRepository entrepotRepository;

    public EntrepotServiceImpl(EntrepotRepository entrepotRepository) {
        this.entrepotRepository = entrepotRepository;
    }

    @Override
    public List<Entrepot> searchEntrepots(String query) {
        List<Entrepot> entrepots = entrepotRepository.searchEntrepots(query);
        return entrepots;
    }

    @Override
    public Entrepot createEntrepots(Entrepot entrepot) {
        return entrepotRepository.save(entrepot);
    }
}
