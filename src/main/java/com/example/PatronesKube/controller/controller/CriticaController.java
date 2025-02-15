package com.example.PatronesKube.controller.controller;

import com.example.PatronesKube.bd.orm.CriticaORM;
import com.example.PatronesKube.logica.JuegoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins ="http://134.199.141.19")
public class CriticaController {

    JuegoService juegoService;

    @GetMapping("/Criticas/{idJuego}")
    public List<CriticaORM> obtenerCriticas(@PathVariable Long idJuego) {
        return juegoService.obtenerCriticasPorJuego(idJuego);
    }
}
