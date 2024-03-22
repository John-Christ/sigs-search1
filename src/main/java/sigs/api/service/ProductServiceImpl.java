package sigs.api.service;


import org.springframework.stereotype.Service;
import sigs.api.model.Produit;
import sigs.api.repository.ProduitRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProduitRepository productRepository;

    public ProductServiceImpl(ProduitRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Produit> searchProducts(String query) {
        List<Produit> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Produit createProduct(Produit product) {
        return productRepository.save(product);
    }
}
