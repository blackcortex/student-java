package org.example.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

@Data
public class BaseDTO {

    @ApiModelProperty(hidden = true)
    private Long id;


    @ApiModelProperty(hidden = true)
    private Integer version;

    @ApiModelProperty(hidden = true)
    private Date createdDate;


    @ApiModelProperty(hidden = true)
    private String createdBy;

    @ApiModelProperty(hidden = true)
    private Date lastModifiedDate;

    @ApiModelProperty(hidden = true)
    private String lastModifiedBy;
}
