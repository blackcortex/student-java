package org.example.province;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;

import javax.validation.constraints.NotBlank;

@Data
public class ProvinceDTO extends BaseDTO {

    @NotBlank
    @NotBlank
    @ApiModelProperty(required = true)
    private String title;


}
