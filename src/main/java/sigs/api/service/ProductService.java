package sigs.api.service;

import sigs.api.model.Produit;

import java.util.List;

public interface ProductService {
    List<Produit> searchProducts(String query);

    Produit createProduct(Produit product);
}
