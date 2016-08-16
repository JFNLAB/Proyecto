/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author nico
 */
public class Horario {
    int hora_inicio;
    int min_inicio;
    int hora_fin;
    int min_fin;

    public Horario(int hora_inicio, int min_inicio, int hora_fin, int min_fin) {
        this.hora_inicio = hora_inicio;
        this.min_inicio = min_inicio;
        this.hora_fin = hora_fin;
        this.min_fin = min_fin;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getMin_inicio() {
        return min_inicio;
    }

    public void setMin_inicio(int min_inicio) {
        this.min_inicio = min_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    public int getMin_fin() {
        return min_fin;
    }

    public void setMin_fin(int min_fin) {
        this.min_fin = min_fin;
    }

    
        
}
