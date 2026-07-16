package com.alex.pojects.eaecatc1t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AppController {

    // a) Endpoint para identificar la instancia con tu nombre
    @GetMapping("/instancia")
    public String obtenerInstancia() {
        return "Edwin Alexis";
    }

    // c) Endpoint adicional que regresa un objeto simple (un estado del sistema)
    @GetMapping("/status")
    public Map<String, Object> obtenerEstado() {
        return Map.of(
            "status", "online",
            "codigo", 200,
            "mensaje", "Servidor funcionando correctamente"
        );
    }
}