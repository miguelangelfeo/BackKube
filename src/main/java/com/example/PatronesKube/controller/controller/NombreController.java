package com.example.PatronesKube.controller.controller;

import com.example.PatronesKube.controller.dto.NombreDTO;
import com.example.PatronesKube.logica.NombreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/backend")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})


public class NombreController {

    private NombreService nombreService;
    @PostMapping(path = "/Nombre")
    public String guardarNombre(@RequestBody NombreDTO nombreDTO) {

        nombreService.añadirYGuardarNombre(nombreDTO);

        return "proyecto guardado correctamente";
    }




    @GetMapping(path = "/nombres")
    public List obtenerNombres() {

        return nombreService.obtenerJuegos();

    }


}
