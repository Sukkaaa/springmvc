package org.xproce.springmvc.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.springmvc.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
