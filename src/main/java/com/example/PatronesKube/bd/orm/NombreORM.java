package com.example.PatronesKube.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "nombres")
@Data
@NoArgsConstructor
public class NombreORM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;


    public NombreORM( Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }
}
