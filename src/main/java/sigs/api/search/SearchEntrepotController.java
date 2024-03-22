package sigs.api.search;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sigs.api.model.Entrepot;
import sigs.api.service.EntrepotService;

import java.util.List;

@RestController
@RequestMapping("/entrepot")
public class SearchEntrepotController {

    private EntrepotService entrepotService;

    public SearchEntrepotController(EntrepotService entrepotService) {
        this.entrepotService = entrepotService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Entrepot>> searchEntrepots(@RequestParam("query") String query){
        return ResponseEntity.ok(entrepotService.searchEntrepots(query));
    }

  /*  @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }*/
}

