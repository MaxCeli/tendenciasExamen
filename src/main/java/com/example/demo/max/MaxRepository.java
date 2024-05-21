package com.example.demo.max;

import org.springframework.data.repository.CrudRepository;

public interface MaxRepository extends CrudRepository<Max, Long>
{

    void deleteByNumero(long numero);

    
} 


    
