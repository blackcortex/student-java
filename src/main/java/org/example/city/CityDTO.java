package org.example.city;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.category.CategoryDTO;
import org.example.common.BaseDTO;
import org.example.province.ProvinceDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CityDTO extends BaseDTO {


    @ApiModelProperty(required = true)
    private String title;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private ProvinceDTO province;


}
