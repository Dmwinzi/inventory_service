package com.example.demo.Module;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@jakarta.persistence.Entity(name = "inventory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    int quantity;


}
