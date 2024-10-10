package com.example.gestor_notas.model;

import jakarta.persistence.*;


@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int actividades;
    private int primerParcial;
    private int segundoParcial;
    private int examenFinal;
    private int puntajeTotal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getActividades() {
        return actividades;
    }

    public void setActividades(Integer actividades) {
        this.actividades = actividades;
    }

    public Integer getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(Integer primerParcial) {
        this.primerParcial = primerParcial;
    }

    public Integer getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(Integer segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public Integer getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(Integer examenFinal) {
        this.examenFinal = examenFinal;
    }
    public Integer getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal; 
    }
}
