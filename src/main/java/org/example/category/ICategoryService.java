package org.example.category;

import java.util.List;

public interface ICategoryService {

    Category save(Category category);

    Category getById(Long id);

    List<Category> getAll();

    void update(Category category);

    void delete(Long id);

}
