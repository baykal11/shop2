package kg.easy.shop.models.dto;

import io.swagger.annotations.ApiModel;
import kg.easy.shop.models.entities.Customer;
import lombok.Data;

@Data
@ApiModel(description = "All details about the Customer hone.")
public class CustomerPhoneDto {
    private Long id;
    private String phone;
    private boolean active;
    private CustomerDto customerDto;
}
