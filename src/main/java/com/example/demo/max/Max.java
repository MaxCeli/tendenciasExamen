package com.example.demo.max;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Max {

    @Id
    @GeneratedValue (strategy  =  GenerationType.AUTO)
    private long id;
    private int numero;
    private Date fecha;
    private boolean Boolean;
    private String descripcion;
    
}