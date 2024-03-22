package sigs.api.search;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sigs.api.model.Demande;
import sigs.api.service.DemandeService;

import java.util.List;

@RestController
@RequestMapping("/demande")
public class SearchDemandeController {

    private DemandeService demandeService;

    public SearchDemandeController(DemandeService demandeService) {
        this.demandeService = demandeService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Demande>> searchDemandes(@RequestParam("query") String query){
        return ResponseEntity.ok(demandeService.searchDemandes(query));
    }

  /*  @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }*/
}

