/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author silvi_5cnyxi8
 */
public class MedicoDTO extends FuncionarioDTO {

    private int idMedico;
    private int numeroMed;
    private int especialidade;

     public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getNumeroMed() {
        return numeroMed;
    }

    public void setNumeroMed(int numeroMed) {
        this.numeroMed = numeroMed;
    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }
}
