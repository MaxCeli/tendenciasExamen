package com.example.demo.max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class MaxController 

{
    @Autowired
    private MaxService maxService;


    //metodo crete
    @PostMapping("/")
    public Max save(@RequestBody Max entity)
    {
      return maxService.save(entity);
    }
    
    //metodo select
    @GetMapping("/{id}/")
    public Max findById(@PathVariable long id)
    {
        return maxService.findById(id);
    }

    //delete
    @DeleteMapping("/numero/{numero}/")
    public void deleteByNumero(@PathVariable long numero)
    {
        maxService.deleteByNumero(numero);
    }

   
 }
