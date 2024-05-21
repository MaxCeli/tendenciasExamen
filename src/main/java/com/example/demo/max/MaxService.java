package com.example.demo.max;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MaxService
{
    @Autowired
    private MaxRepository maxRepository;

    //metodo insert
    public Max save(Max entity)
    {
        return maxRepository.save(entity);
    }

    //metodo select
     public Max findById(long id)
     {
        return maxRepository.findById(id).orElse(null);
     }

     //delete seria nombre pero yo le hice por numero por que no tengo nombre
     public void deleteByNumero(long numero)
     {
        maxRepository.deleteByNumero(numero);
     }
}
