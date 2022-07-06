package org.example.product;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product/")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    private final ProductMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<Void> save(@RequestBody ProductDTO productDTO) {
        service.save(mapper.toProduct(productDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable Long id) {
        Product product = service.getById(id);
        ProductDTO productDTO = mapper.toProductDTO(product);
        return ResponseEntity.ok(productDTO);
    }

    @GetMapping("v1/")
    public ResponseEntity<List<ProductDTO>> getAll() {
        List<Product> products = service.getAll();
        List<ProductDTO> productsDTO = mapper.toProductDTOS(products);
        return ResponseEntity.ok(productsDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id)
    {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody Product product)
    {
        service.update(product);
        return ResponseEntity.ok().build();
    }
}
