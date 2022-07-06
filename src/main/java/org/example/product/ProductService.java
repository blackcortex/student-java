package org.example.product;

import lombok.AllArgsConstructor;
import org.example.category.Category;
import org.example.category.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository repository;

    private final ICategoryService service;

    @Override
    public Product save(Product product) {
        Category category = service.getById(product.getCategory().getId());
        product.setCategory(category);
        return repository.save(product);
    }

    @Override
    public Product getById(Long id) {
        Optional<Product> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public void update(Product product) {
        Product newProduct = getById(product.getId());
        Category category = service.getById(product.getCategory().getId());
        newProduct.setCategory(category);
        newProduct.setTitle(product.getTitle());
        repository.save(newProduct);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
