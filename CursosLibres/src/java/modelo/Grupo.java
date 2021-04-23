/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Grupo {

    public Grupo(int num_grupo, int curso_id) {
        this.num_grupo = num_grupo;
        this.curso_id = curso_id;
    }

    public Grupo() {
        this.curso_id = 0;
        this.num_grupo = 0;
    }

    public int getNum_grupo() {
        return num_grupo;
    }

    public void setNum_grupo(int num_grupo) {
        this.num_grupo = num_grupo;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }
    
    private int num_grupo;
    private int curso_id;
}
