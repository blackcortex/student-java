package org.example.Student;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.common.BaseDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class StudentDTO extends BaseDTO {


    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private String name;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private String lastname;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private String nationalCode;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private Integer age;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private Date birthdate;

    @NotNull
    @NotBlank
    @ApiModelProperty(required = true)
    private String file;


}
