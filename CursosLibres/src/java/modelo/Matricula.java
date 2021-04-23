/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Matricula {

    public Matricula() {
        this.matricula_id = 0;
        this.grupo_num = 0;
        this.curso_id = 0;
        this.nota = 0;
    }
    
    public Matricula(int matricula_id, int grupo_num, int curso_id, int nota) {
        this.matricula_id = matricula_id;
        this.grupo_num = grupo_num;
        this.curso_id = curso_id;
        this.nota = nota;
    }

    public int getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(int matricula_id) {
        this.matricula_id = matricula_id;
    }

    public int getGrupo_num() {
        return grupo_num;
    }

    public void setGrupo_num(int grupo_num) {
        this.grupo_num = grupo_num;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    private int matricula_id;
    private int grupo_num;
    private int curso_id;
    private int nota;
}
