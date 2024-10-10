package com.example.gestor_notas.repository;

import com.example.gestor_notas.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}