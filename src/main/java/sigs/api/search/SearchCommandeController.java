package sigs.api.search;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sigs.api.model.Commande;
import sigs.api.service.CommandeService;

import java.util.List;

@RestController
@RequestMapping("/commande")
public class SearchCommandeController {

    private CommandeService commandeService;

    public SearchCommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Commande>> searchCommandes(@RequestParam("query") String query){
        return ResponseEntity.ok(commandeService.searchCommandes(query));
    }

  /*  @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }*/
}
