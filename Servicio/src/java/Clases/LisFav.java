/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author homar
 */
public class LisFav {
    
    private String id;
    private ArrayList<Recurso> recursos;

    public LisFav(String id, ArrayList<Recurso> recursos) {
        this.id = id;
        this.recursos = recursos;
    }

    public LisFav(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }

    public LisFav() {
    }
    
    

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }
    
    
    
}
