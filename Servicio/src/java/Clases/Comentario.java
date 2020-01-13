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
public class Comentario {
    
    private String id;
    private String texto;

    public Comentario(String texto) {
        this.texto = texto;
    }


    public Comentario(String id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", texto=" + texto + '}';
    }
    
}
