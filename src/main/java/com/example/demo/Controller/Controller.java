package com.example.demo.Controller;


import com.example.demo.Module.Entity;
import com.example.demo.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class Controller {


    @Autowired
    Repository repository;


    @GetMapping("/")
    public String Welcome(){
        return  "Inventory Service in Microservice";
    }


    @GetMapping(value = "/instock/{code}")
    public boolean isInStock(@PathVariable("code") String code){
        return repository.findBycode(code).isPresent();
    }

    @PostMapping(value = "/Save")
    public String savestock(@RequestBody Entity entity){
        repository.save(entity);
        return  " Saved";
    }


}
