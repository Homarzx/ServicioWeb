/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author homar
 */
public class Curso {
    
    private String id;
    private String nombre;
    private LisFav recursos;

    public Curso(String id, String nombre, LisFav recursos) {
        this.id = id;
        this.nombre = nombre;
        this.recursos = recursos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LisFav getRecursos() {
        return recursos;
    }

    public void setRecursos(LisFav recursos) {
        this.recursos = recursos;
    }
    
    
}
