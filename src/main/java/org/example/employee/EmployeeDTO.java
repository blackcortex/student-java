package org.example.employee;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;
import org.example.province.ProvinceDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class EmployeeDTO extends BaseDTO{


    @ApiModelProperty(required = true)
    private String firstname;

    @ApiModelProperty(required = true)
    private String lastname;

    @ApiModelProperty(required = true)
    private Boolean isMarried;

    @ApiModelProperty(required = true)
    private Date birthdate;

    @ApiModelProperty(required = true)
    private Integer children;


    @ApiModelProperty(required = true)
    private String license;



}
