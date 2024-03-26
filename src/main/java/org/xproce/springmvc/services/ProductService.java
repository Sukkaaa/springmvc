package org.xproce.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.springmvc.dao.entities.Product;
import org.xproce.springmvc.dao.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService implements ProductManager{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product AjoutProduit(Product product) {
        try{
            return productRepository.save(product);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public List<Product> ConsulterProduit() {
       List <Product> allProducts=productRepository.findAll();
       for (Product product:allProducts)
       {
           System.out.println(product);
       }
       return allProducts;
    }

    @Override
    public Product FindProduct(String motCle) {
        List<Product> allProduct=productRepository.findAll();
        for(Product product:allProduct)
        {
            if(product.getDesignation()==motCle)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public void VisualiserProduit(Product product) {
        Product product1=FindProduct(product.getDesignation());
        System.out.println(product1.getId()+" "+product1.getDesignation()+" "+product1.getPrix());
    }

    @Override
    public Product UpdateProduct(Product product) {
        List<Product> allproducts=productRepository.findAll();
        for(Product products:allproducts)
        {
            if(products.getId().equals(product.getId()))
            {
                productRepository.delete(product);
                productRepository.save(products);

            }
        }
        return product;
    }

    @Override
    public Product DeleteProduct(Product product) {
        Product product1=FindProduct(product.getDesignation());
        productRepository.delete(product1);
        return product1;
    }


}
