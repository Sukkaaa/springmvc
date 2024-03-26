package org.xproce.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.springmvc.dao.entities.Product;
import org.xproce.springmvc.services.ProductManager;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {
    @Autowired
    private ProductManager productManager;

    public static void main(String[] args) {

        SpringApplication.run(SpringmvcApplication.class, args);
    }
    @Override
    public void run(String... args)throws Exception{
        Product product1=new Product(null,"sketchers",850.0);
        Product product2=new Product(null,"Adidas",1800.0);
        productManager.AjoutProduit(product1);
        productManager.AjoutProduit(product2);
        productManager.VisualiserProduit(product1);
        productManager.VisualiserProduit(product2);



    }

}
