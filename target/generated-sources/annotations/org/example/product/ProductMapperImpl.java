package org.example.product;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.category.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T21:04:21+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18-ea (Private Build)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Product toProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setVersion( productDTO.getVersion() );
        product.setCreatedDate( productDTO.getCreatedDate() );
        product.setCreatedBy( productDTO.getCreatedBy() );
        product.setLastModifiedDate( productDTO.getLastModifiedDate() );
        product.setLastModifiedBy( productDTO.getLastModifiedBy() );
        product.setTitle( productDTO.getTitle() );
        product.setPrice( productDTO.getPrice() );
        product.setCategory( categoryMapper.toCategory( productDTO.getCategory() ) );

        return product;
    }

    @Override
    public ProductDTO toProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( product.getId() );
        productDTO.setVersion( product.getVersion() );
        productDTO.setCreatedDate( product.getCreatedDate() );
        productDTO.setCreatedBy( product.getCreatedBy() );
        productDTO.setLastModifiedDate( product.getLastModifiedDate() );
        productDTO.setLastModifiedBy( product.getLastModifiedBy() );
        productDTO.setTitle( product.getTitle() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setCategory( categoryMapper.toCategoryDTO( product.getCategory() ) );

        return productDTO;
    }

    @Override
    public List<ProductDTO> toProductDTOS(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( products.size() );
        for ( Product product : products ) {
            list.add( toProductDTO( product ) );
        }

        return list;
    }

    @Override
    public List<Product> toCategories(List<ProductDTO> productDTOS) {
        if ( productDTOS == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productDTOS.size() );
        for ( ProductDTO productDTO : productDTOS ) {
            list.add( toProduct( productDTO ) );
        }

        return list;
    }
}
