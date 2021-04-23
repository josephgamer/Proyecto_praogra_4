/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Especialidad {

    public Especialidad(int profe_id_profe, int area_tematica_id) {
        this.profe_id_profe = profe_id_profe;
        this.area_tematica_id = area_tematica_id;
    }

    public Especialidad() {
    }

    public int getProfe_id_profe() {
        return profe_id_profe;
    }

    public void setProfe_id_profe(int profe_id_profe) {
        this.profe_id_profe = profe_id_profe;
    }

    public int getArea_tematica_id() {
        return area_tematica_id;
    }

    public void setArea_tematica_id(int area_tematica_id) {
        this.area_tematica_id = area_tematica_id;
    }
    
    private int profe_id_profe;
    private int area_tematica_id;
}
