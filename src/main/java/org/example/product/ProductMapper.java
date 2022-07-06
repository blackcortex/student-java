package org.example.product;

import org.example.category.CategoryMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {


    Product toProduct(ProductDTO productDTO);

    ProductDTO toProductDTO(Product product);


    List<ProductDTO> toProductDTOS(List<Product> products);

    List<Product> toCategories(List<ProductDTO> productDTOS);


}
