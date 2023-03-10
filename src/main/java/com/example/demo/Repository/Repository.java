package com.example.demo.Repository;

import com.example.demo.Module.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository  extends JpaRepository<Entity, Long> {

    Optional<Entity> findBycode (String code);

}
