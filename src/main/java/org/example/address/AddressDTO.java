package org.example.address;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;
import org.example.user.UserDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AddressDTO extends BaseDTO {

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private String context;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private UserDTO user;


}
