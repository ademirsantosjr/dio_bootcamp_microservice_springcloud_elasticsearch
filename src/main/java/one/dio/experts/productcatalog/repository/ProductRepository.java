package one.dio.experts.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import one.dio.experts.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
    
}
