package DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConsultaDTO {
    private int idConsulta;
    private int idPaciente;
    private int idMedico;
    private LocalDate dataConsulta;
    private LocalTime horaConsulta;

    public ConsultaDTO() {
    }

    public ConsultaDTO(int idConsulta, int idPaciente, int idMedico, LocalDate dataConsulta, LocalTime horaConsulta) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    @Override
    public String toString() {
        return "ConsultaDTO{" +
                "idConsulta=" + idConsulta +
                ", idPaciente=" + idPaciente +
                ", idMedico=" + idMedico +
                ", dataConsulta=" + dataConsulta +
                ", horaConsulta=" + horaConsulta +
                '}';
    }
}