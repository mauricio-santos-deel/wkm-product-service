package com.wkm.productservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Created by mauri on 17/08/2017.
 */
@Component
public class SampleDataCLR implements CommandLineRunner {

    ProductRepository repository;

    public SampleDataCLR(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Banana", "Apple", "Mango")
                .forEach( name -> repository.save(new Product(name)));

        repository.findAll().forEach(System.out::println);
    }
}
