package com.example.demo.Module;



import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity(name = "inventory")
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
