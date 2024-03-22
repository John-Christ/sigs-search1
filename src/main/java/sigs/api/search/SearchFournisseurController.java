package sigs.api.search;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sigs.api.model.Fournisseur;
import sigs.api.service.FournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class SearchFournisseurController {

    private FournisseurService fournisseurService;

    public SearchFournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Fournisseur>> searchFournisseurs(@RequestParam("query") String query){
        return ResponseEntity.ok(fournisseurService.searchFournisseurs(query));
    }

  /*  @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }*/
}


