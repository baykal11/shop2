package kg.easy.shop.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data

public class UserRoleDto {
    private Long id;
    private String role;
}
