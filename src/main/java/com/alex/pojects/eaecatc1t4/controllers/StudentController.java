package com.alex.pojects.eaecatc1t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/estudiante")
public class StudentController {
    @GetMapping("/materias")
    public List<Map<String, String>> listarMaterias() {
        return List.of(
            Map.of("id", "1", "nombre", "Bases de Datos", "estado", "Cursando"),
            Map.of("id", "2", "nombre", "Programación Lógica y Funcional", "estado", "Cursando"),
            Map.of("id", "3", "nombre", "Ingeniería de Software", "estado", "Cursando"),
            Map.of("id", "4", "nombre", "Interfaces de Sistema", "estado", "Cursando")
        );
    }
}