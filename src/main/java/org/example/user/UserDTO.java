package org.example.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;

@Data
public class UserDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private String lastName;

    @ApiModelProperty(required = true)
    private String fatherName;

    @ApiModelProperty(required = true)
    private String nationalCode;

    @ApiModelProperty(required = true)
    private String birthPlace;

    @ApiModelProperty(required = true)
    private String blood;


}
