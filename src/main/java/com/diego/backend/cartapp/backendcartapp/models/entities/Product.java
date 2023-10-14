package com.diego.backend.cartapp.backendcartapp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseModel {
       
    @NotBlank
    @NotNull
    @Size@Size(min = 5, max = 150)
    private String name;

    @NotBlank
    @NotNull
    @Size(min = 5, max = 250)
    private String description;

    @NotBlank
    @NotNull
    private Long price;

}
