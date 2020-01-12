/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author homar
 */
public class Recurso {
    
    private String id;
    private String nombre;
    private Date fecha;
    private String url;
    private ArrayList<Comentario> comentarios;

    public Recurso(String id, String nombre, Date fecha, String url) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.url = url;
    }

    public Recurso(String nombre, Date fecha, String url, ArrayList<Comentario> comentarios) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.url = url;
        this.comentarios = comentarios;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
    
}
