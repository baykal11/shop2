package kg.easy.shop.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class UserStatusDto {
    private Long id;

    private String name;
    private boolean active;
}
