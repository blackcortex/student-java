package org.example.category;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository repository;

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category getById(Long id) {
        Optional<Category> optional = repository.findById(id);
        if(optional.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Category> getAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public void update(Category category) {
        Category newCategory = getById(category.getId());
        newCategory.setTitle(category.getTitle());
        repository.save(newCategory);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
