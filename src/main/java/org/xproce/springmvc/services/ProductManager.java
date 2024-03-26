package org.xproce.springmvc.services;

import org.xproce.springmvc.dao.entities.Product;
import org.xproce.springmvc.dao.repositories.ProductRepository;
import java.util.List;
public interface ProductManager {
    Product AjoutProduit(Product product);
    List<Product> ConsulterProduit();
    Product FindProduct(String motCle);
    void VisualiserProduit(Product product);
    Product UpdateProduct(Product product);
    Product DeleteProduct(Product product);

}
