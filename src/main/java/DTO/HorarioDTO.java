/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 *
 * @author silvi_5cnyxi8
 */
public class HorarioDTO {
    private int id_horario;
    private int id_medico;
    private String diaSemana;
    private LocalTime hora;
    
    
    public HorarioDTO(){}
    
    public HorarioDTO(int id_horario, int id_medico, String diaSemana, LocalTime hora){
    this.id_horario = id_horario;
    this.id_medico = id_medico;
    this.diaSemana = diaSemana;
    this.hora = hora;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString(){
        return "HorarioDTO{"+
                "id_horario = "+ id_horario +
                "id_medico = "+ id_medico +
                "diaSemana = "+ diaSemana +
                "hora = "+ hora +
                '}';
    }
}
