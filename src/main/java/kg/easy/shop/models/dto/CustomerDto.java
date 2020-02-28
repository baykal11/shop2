package kg.easy.shop.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kg.easy.shop.anotations.MyDescription;
import lombok.Data;

import java.util.List;

/**
 * Description - CustomerDto
 * version - 0.1
 */
@Data
@ApiModel(description = "All details about the Customer.")
@MyDescription(description = "CustomerDto")
public class CustomerDto {
    @MyDescription(description = "CustomerId")
    private Long id;
    private String name;
    private String address;
    private double balance;
    private float percent;
    @ApiModelProperty(notes = "Customer phones")
    private List<CustomerPhoneDto> phones;
}
