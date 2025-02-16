package com.example.PatronesKube.logica;

import com.example.PatronesKube.bd.jpa.NombreJPA;
import com.example.PatronesKube.bd.orm.NombreORM;
import com.example.PatronesKube.controller.dto.NombreDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NombreService {

    NombreJPA nombreJPA;

    public NombreORM agregarNombre(NombreDTO nombreDTO) {
        NombreORM nombre = new NombreORM();
        nombre.setNombre(nombreDTO.nombre());

        return nombre;
    }

    public boolean guardarNombre(NombreORM nombreORM) {
        nombreJPA.save(nombreORM);
        return true;
    }

    public boolean añadirYGuardarNombre(NombreDTO nombreDTO) {
        NombreORM nombreORM = agregarNombre(nombreDTO);
        guardarNombre(nombreORM);
        return true;
    }

    public List<NombreORM> obtenerJuegos() {
        return nombreJPA.findAll().stream()
                .map(nombre -> new NombreORM( nombre.getId(),nombre.getNombre()))
                .collect(Collectors.toList());
    }

}
