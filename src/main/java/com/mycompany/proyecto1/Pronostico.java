/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

/**
 *
 * @author nahue
 */
public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private Resultado resultado;
    private int puntos;

    // Constructor
    public Pronostico(Partido partido, Equipo equipo, Resultado resultado, int puntos) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
        this.puntos = puntos;
    }

    // Getters y Setters
    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
