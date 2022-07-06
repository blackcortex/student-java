package org.example.product;

import java.util.List;

public interface IProductService {

    Product save(Product product);

    Product getById(Long id);

    List<Product> getAll();

    void update(Product product);

    void delete(Long id);

}
