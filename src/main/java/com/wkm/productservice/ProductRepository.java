package com.wkm.productservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mauri on 17/08/2017.
 */
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

}
