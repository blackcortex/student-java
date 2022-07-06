package org.example.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.category.Category;
import org.example.category.CategoryDTO;
import org.example.common.BaseDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ProductDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String title;

    @ApiModelProperty(required = true)
    private Integer price;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private CategoryDTO category;


}
