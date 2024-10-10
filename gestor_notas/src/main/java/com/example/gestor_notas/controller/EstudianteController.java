package com.example.gestor_notas.controller;

import com.example.gestor_notas.model.Estudiante;
import com.example.gestor_notas.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping
    public List<Estudiante> getAll() {
        return estudianteRepository.findAll();
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        int total = estudiante.getActividades() + estudiante.getPrimerParcial() +
                    estudiante.getSegundoParcial() + estudiante.getExamenFinal();
        
        estudiante.setPuntajeTotal(total); 
    
        return estudianteRepository.save(estudiante); 
    }
}
