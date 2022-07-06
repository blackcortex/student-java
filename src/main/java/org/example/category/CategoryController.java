package org.example.category;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category/")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService service;

    private final CategoryMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody CategoryDTO categoryDTO) {
        service.save(mapper.toCategory(categoryDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<CategoryDTO> getById(@PathVariable Long id) {
        Category category = service.getById(id);
        CategoryDTO categoryDTO = mapper.toCategoryDTO(category);
        return ResponseEntity.ok(categoryDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<CategoryDTO>> getAll() {
        List<Category> categories = service.getAll();
        List<CategoryDTO> categoriesDTO = mapper.toCategoryDTOS(categories);
        return ResponseEntity.ok(categoriesDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody Category category)
    {
        service.update(category);
        return ResponseEntity.ok().build();
    }
}
