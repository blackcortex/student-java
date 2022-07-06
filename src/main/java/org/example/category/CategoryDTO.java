package org.example.category;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;

import javax.validation.constraints.NotBlank;

@Data
public class CategoryDTO extends BaseDTO {

    @NotBlank
    @NotBlank
    @ApiModelProperty(required = true)
    private String title;


}
