package sigs.api.service;

import org.springframework.stereotype.Service;
import sigs.api.model.Commande;
import sigs.api.repository.CommandeRepository;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
        public List<Commande> searchCommandes(String query) {
        List<Commande> commandes = commandeRepository.searchCommandes(query);
        return commandes;
    }

    @Override
    public Commande createCommandes(Commande commande) {
        return commandeRepository.save(commande);
    }
}
