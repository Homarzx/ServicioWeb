/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author homar
 */
public class Usuario {
    private String id;
    private String password;
    private String nombre;
    private int edad;
    private  String foto;
    private LisFav lista;

    public Usuario(String id, String password, String nombre, int edad, LisFav lista) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.lista = lista;
    }

    public Usuario(String password, String nombre, int edad, String foto, LisFav lista) {
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
        this.lista = lista;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LisFav getLista() {
        return lista;
    }

    public void setLista(LisFav lista) {
        this.lista = lista;
    }
    
    
}
