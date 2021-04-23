/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Horario {

    public Horario(int seq, Grupo grupo_num, Curso grupo_curso_id, int dia, int hora) {
        this.seq = seq;
        this.grupo_num = grupo_num;
        this.grupo_curso_id = grupo_curso_id;
        this.dia = dia;
        this.hora = hora;
    }

    public Horario(int seq, int dia, int hora) {
        this.seq = seq;
        this.dia = dia;
        this.hora = hora;
    }

    public Horario() {
        this.seq = 0;
        this.grupo_num = new Grupo();
        this.grupo_curso_id = new Curso();
        this.dia = 0;
        this.hora = 0;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Grupo getGrupo_num() {
        return grupo_num;
    }

    public void setGrupo_num(Grupo grupo_num) {
        this.grupo_num = grupo_num;
    }

    public Curso getGrupo_curso_id() {
        return grupo_curso_id;
    }

    public void setGrupo_curso_id(Curso grupo_curso_id) {
        this.grupo_curso_id = grupo_curso_id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    private int seq;
    private Grupo grupo_num;
    private Curso grupo_curso_id;
    private int dia;
    private int hora;
}
